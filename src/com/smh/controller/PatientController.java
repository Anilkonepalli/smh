package com.smh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smh.entity.Bed;
import com.smh.entity.Consultant;
import com.smh.entity.InPayments;
import com.smh.entity.Patient;
import com.smh.entity.Ward;
import com.smh.entity.test.PatientTestResult;
import com.smh.service.LabDashboardService;
import com.smh.service.PatientService;
import com.smh.service.PaymentService;

@Controller
@RequestMapping("/patient")
public class PatientController {

	private Logger LOG=Logger.getLogger(PatientController.class);
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private PaymentService paymentService;
	
	@Autowired
	private LabDashboardService labDashboardService;
	
	@RequestMapping(value="/registerPatient.htm")
	public ModelAndView getRegisterPage()
	{
		ModelAndView modelAndView=new ModelAndView();
		
		/*Map<String, List<Consultant>> model=new HashMap<String, List<Consultant>>();
		model.put("consultant", patientService.getAllConsultant());*/
		
		modelAndView.setViewName("register");
		List<Consultant> list=patientService.getAllConsultant();
		modelAndView.addObject("consultantsList",list);
		List<Bed> listBeds=patientService.getAllBeds();
		modelAndView.addObject("bedsList",listBeds);
		List<Ward> wardList=patientService.getWardNames();
		modelAndView.addObject("wardList",wardList);
		System.out.println(list.size());
		modelAndView.addObject("patient", new Patient());

		return modelAndView;
	}
	
	@RequestMapping(value="/submitPatient.htm", method=RequestMethod.POST)
	public String addPatient(@ModelAttribute("patient") Patient patient, BindingResult result)
	{
		patientService.savePatient(patient);
		return "redirect:/patient/patientDashboard.htm?id="+patient.getId();
	}
	
	@RequestMapping(value="/patientDashboard.htm")
	public ModelAndView patientDashboard(@RequestParam("id") Long id){
		LOG.debug("Id "+id);
		Patient patient=patientService.getPatientById(id);
		LOG.debug("Name"+patient.getPatientDetails().getPatientName());
		ModelAndView model=new ModelAndView();
		List<InPayments> paymentList=paymentService.getInPayments(id);
		List<PatientTestResult> testResult=labDashboardService.getPatientTestResultById(id);
		model.addObject("testResult",testResult);
		model.addObject("paymentList",paymentList);
		model.addObject("patient",patient);
		model.setViewName("patientDashboard");
		return model;
	}
	
	@RequestMapping(value="/getPatientNameList.htm",
					method = RequestMethod.GET, headers="Accept=*/*")
	public @ResponseBody List<Map<String, String>> getPatientNameList(@RequestParam("term") String patientName){
		List<String> patientNameList=new ArrayList<String>();
		Map<String, String> map=null;
		List<Map<String, String>> mapp=new ArrayList<Map<String,String>>();
		List<Patient> pList=patientService.getPatientNameList(patientName);
		for (Patient patient : pList) {
			map=new HashMap<String, String>();
			map.put("name",patient.getPatientDetails().getPatientName());
			map.put("id", patient.getId().toString());
			mapp.add(map);
			patientNameList.add(patient.getPatientDetails().getPatientName());
		}
		/*patientNameList.add("Anil1");
		patientNameList.add("Anil2");
		patientNameList.add("Anil3");
		patientNameList.add("Anil4");
		patientNameList.add("Anil5");*/
		return mapp;
	}
	
	@RequestMapping(value="/viewPatient.htm", method=RequestMethod.GET)
	public String listPatients(@ModelAttribute("patient") Patient patient, BindingResult result)
	{
		return null;
	}
	
	public @ResponseBody String getAvailableBedByWardId(Long wardId){
		return "";
	}
}
