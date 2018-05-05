package com.smh.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smh.entity.Consultant;
import com.smh.entity.InPayments;
import com.smh.entity.OutPayments;
import com.smh.entity.Patient;
import com.smh.entity.admin.Staff;
import com.smh.service.AdminDashboardService;
import com.smh.service.PatientService;
import com.smh.service.PaymentService;
import com.smh.util.DateUtil;

@Controller
@RequestMapping("/admin")
public class AdminDashboardController {
	@Autowired
	private AdminDashboardService adminDashboardService;
	@Autowired
	private PatientService patientService;
	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping(value="/adminDashboard.htm")
	public ModelAndView adminDashboad(){
		ModelAndView modelAndView=new ModelAndView();
		List<Staff> staffList=adminDashboardService.getAllStaff();
		List<Patient> patientList=patientService.getPatientListByDate(DateUtil.getTodayDate());
		List<InPayments> inPaymentsList=paymentService.getAllInPayment(DateUtil.getTodayDate());
		List<OutPayments> outPaymentList=paymentService.getAllOutPayment(DateUtil.getTodayDate());
		List<Patient> listPatient=patientService.listPatientByDate(DateUtil.getTodayDate());
		modelAndView.addObject("listPatient",listPatient);
		modelAndView.addObject("inPaymentsList",inPaymentsList);
		modelAndView.addObject("outPaymentList",outPaymentList);
 		modelAndView.addObject("staffList",staffList);
		modelAndView.addObject("patientList",patientList);
		modelAndView.addObject("consultantList",adminDashboardService.getAllConsultant());
		modelAndView.setViewName("adminDashboard");
		return modelAndView;
	}
	
	@RequestMapping(value="/getAllOutpayments.htm",method=RequestMethod.POST)
	public @ResponseBody List<OutPayments> getAllOutpayments(@RequestParam("sdate") String date){
		List<OutPayments> outPaymentList=paymentService.getAllOutPayment(DateUtil.convertStringToDate(date));
		return outPaymentList;
	}
	
	@RequestMapping(value="/getAllInpayments.htm",method=RequestMethod.POST)
	public @ResponseBody List<InPayments> getAllInpayments(@RequestParam("sdate") String date){
		List<InPayments> inpaymentsList=paymentService.getAllInPayment(DateUtil.convertStringToDate(date));
		return inpaymentsList;
	}
	
	@RequestMapping(value="/addStaff.htm",method=RequestMethod.POST)
	public String addStaff(@ModelAttribute("staff") Staff staff){
		adminDashboardService.addStaff(staff);
		return "redirect:/admin/adminDashboard.htm";
	}
	
	@RequestMapping(value="/addConsultant.htm",
			method = RequestMethod.POST)
	public @ResponseBody List<Consultant> addConsultant(@ModelAttribute("consultant") Consultant consultant){
	//List<String> patientNameList=new ArrayList<String>();
	//Map<String, String> map=null;
	//List<Map<String, String>> mapp=new ArrayList<Map<String,String>>();
	adminDashboardService.addConsultant(consultant);
	List<Consultant> pList=new ArrayList<Consultant>();
	pList.add(adminDashboardService.getLastConsultant());
	//	adminDashboardService.getAllConsultant();
	/*for (Consultant consultant2 : pList) {
		map=new HashMap<String, String>();
		map.put("name",patient.getPatientDetails().getPatientName());
		map.put("id", patient.getId().toString());
		mapp.add(map);
		patientNameList.add(patient.getPatientDetails().getPatientName());
	}*/
	//return mapp;
	return pList;
	}
	
}
