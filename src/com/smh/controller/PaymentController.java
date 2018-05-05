package com.smh.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.smh.entity.InPayments;
import com.smh.entity.OutPayments;
import com.smh.entity.Patient;
import com.smh.service.PatientService;
import com.smh.service.PaymentService;
import com.smh.util.DateUtil;


@Controller
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PatientService patientService;
	
	@Autowired
	private PaymentService paymentService;
	
	Long PLACE_KEY;
	
	@RequestMapping("/fwdToMakePayment.htm")
	public ModelAndView fwdToMakePayment(@RequestParam("id") Long id){
		ModelAndView modelAndView =new ModelAndView();
		InPayments inPayments=new InPayments();
		Patient patient=patientService.getPatientById(id);
		inPayments.setPatient(patient);
		modelAndView.addObject("patient", patient);
		modelAndView.addObject("inPayment",inPayments);
		modelAndView.setViewName("makePayment");
		return modelAndView;
	}
	
	@RequestMapping(value="/makePayment.htm")
	public ModelAndView makePayment(@ModelAttribute ("inPayment") InPayments inPayments,BindingResult result){
		Patient patient=patientService.getPatientById(inPayments.getPatient().getId());
		ModelAndView model=new ModelAndView();
		model.addObject("patient", patient);
		model.addObject("inPayment", inPayments);
		model.setViewName("makePayment");
		return model;
	}
	
	@RequestMapping(value="/submitPayment.htm", method=RequestMethod.POST)
	public String addPayment(@ModelAttribute ("inPayment") InPayments inPayments,BindingResult result)
	{
		Date date=new Date();
		SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
		try{
		date=formatter.parse(formatter.format(date));
		}
		catch (Exception e) {
			
		}
		inPayments.setPaymetnDate(date);
		paymentService.savePayment(inPayments);
		return "redirect:/patient/patientDashboard.htm?id="+inPayments.getPatient().getId();
	}
	
	@RequestMapping(value="/paymentDashboard.htm")
	public ModelAndView submitPayment(@RequestParam("id") Long id){
		Patient patient=patientService.getPatientById(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("paymentDashboard");
		modelAndView.addObject("patient", patient);
		return modelAndView;
		
	}
	
	@RequestMapping(value="ceateVoucher.htm")
	public ModelAndView createVoucher(){
		PLACE_KEY = (new Random()).nextLong();
		OutPayments outPayments=new OutPayments();
		outPayments.setStaffId(1l);
		outPayments.setDate(DateUtil.getTodayDate());
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("outPayments",outPayments);
		modelAndView.setViewName("createVoucher");
		return modelAndView;
	}
	
	@RequestMapping(value="submitVoucher.htm",method=RequestMethod.POST)
	public String submitVoucher(@ModelAttribute("outPayments") OutPayments outPayments,BindingResult result,HttpSession session){
		//if (! (((Long) session.getAttribute("LAST_PLACE_KEY"))!=null && ((Long) session.getAttribute("LAST_PLACE_KEY")).equals(PLACE_KEY))) {
			outPayments.setDate(DateUtil.getTodayDate());
			paymentService.saveOutPayment(outPayments);
		//	}
		//session.setAttribute("LAST_PLACE_KEY", PLACE_KEY);
		return "redirect:/payment/ceateVoucher.htm";
	}
}
