package com.smh.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.smh.entity.InPayments;
import com.smh.entity.Patient;
import com.smh.entity.PatientTest;
import com.smh.entity.TestFee;
import com.smh.entity.TestStatusEnum;
import com.smh.entity.test.PatientTestResult;
import com.smh.model.PatientModel;
import com.smh.service.LabDashboardService;
import com.smh.service.PatientService;

@Controller
@RequestMapping("/lab")
public class LabDashboardContorller {

	@Autowired
	private LabDashboardService labDashboardService;
	@Autowired
	private PatientService patientService;
	
	@RequestMapping(value="/labDashboard.htm")
	public ModelAndView getTestpatientList(){

		ModelAndView modelAndView=new ModelAndView();
		List<PatientTest> patientTestList=labDashboardService.getPatientTestList();
		modelAndView.addObject("patientTestList",patientTestList);
		modelAndView.setViewName("labDashboard");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/listOfTests.htm",method = RequestMethod.GET) 
	public ModelAndView getTestResults(@RequestParam("id") Long id){
		ModelAndView modelAndView=new ModelAndView();
		Patient patient=patientService.getPatientById(id);
		List<TestFee> list=labDashboardService.listOfTest();
		modelAndView.addObject("testList",list);
		modelAndView.addObject("patient",patient);
		modelAndView.addObject("patientModel", new PatientModel());
		//modelAndView.addObject("patientTest",new PatientTest());
		modelAndView.setViewName("listOfTests");
		return modelAndView;
	}
	
	
	@RequestMapping(value="/submitTest.htm",method=RequestMethod.POST)
	public String submitTest(@ModelAttribute("patientModel") PatientModel patientModel, BindingResult result ){
		Integer []testId=patientModel.getTestIds();
		TestFee testFee=null;
		List<TestFee> list=new ArrayList<TestFee>();
		for (int i = 0; i < testId.length; i++) {
			testFee=labDashboardService.getTestFeeById(testId[i]);
			//((BaseEntity)testFee).setId(testId[i]);
			list.add(testFee);
		}
		PatientTest patientTest=new PatientTest();
		patientTest.setTestFee(list);
		patientTest.setStatus(TestStatusEnum.N);
		//List<PatientTest> testList=new ArrayList<PatientTest>();
		//testList.add(patientTest);
		Patient patient=labDashboardService.getPatientById(patientModel.getId());
		List<Patient> patientList=new ArrayList<Patient>();
		patientList.add(patient);
		//patient.setPatientTest(testList);
		patientTest.setPatientList(patientList);
		labDashboardService.savePatientTest(patientTest);
		return "redirect:/lab/viewTestCharges.htm?id="+patient.getId();
	}
	
	@RequestMapping(value="/viewTestCharges.htm",method=RequestMethod.GET)
	public ModelAndView viewTestCharges(@RequestParam("id") Long id){
		PatientTest patientTest=labDashboardService.getPatientTest(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("patientTest",patientTest);
		Double totFee=0.0;
		for(TestFee fee:patientTest.getTestFee()){
			totFee=totFee+fee.getFee();
		}
		modelAndView.addObject("totFee",totFee);
		modelAndView.addObject("patient",labDashboardService.getPatientById(id));
		modelAndView.addObject("inPayment",new InPayments());
		modelAndView.setViewName("viewTestCharges");
		return modelAndView;
	}
	
	@RequestMapping(value="/viewTest.htm",method=RequestMethod.GET)
	public ModelAndView viewTests(@RequestParam("id") Long id){
		PatientTest patientTest=labDashboardService.getPatientTest(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("patientTestResult",new PatientTestResult());
		modelAndView.addObject("patientTest",patientTest);
		modelAndView.setViewName("viewTests");
		return modelAndView;
	}
	
	@RequestMapping(value="/submitTestValues.htm",method=RequestMethod.POST)
	public String submitTestValues(@ModelAttribute("patientTestResult") PatientTestResult patientTestResult,BindingResult result){
		labDashboardService.savePatientTestResult(patientTestResult);
		return "redirect:/lab/labDashboard.htm";
	}
		
}
