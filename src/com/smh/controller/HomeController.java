package com.smh.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
@RequestMapping("/home")
public class HomeController {
	
	
	@RequestMapping(value="/home.htm", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal,HttpServletRequest request ) {
 
		String name = principal.getName();
		request.getSession().setAttribute("name", name);
		model.addAttribute("username", name);
		return "home";
 
	}
	
}
