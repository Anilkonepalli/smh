package com.smh.controller;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

public class AuthenticationSuccessHandlerImpl extends SimpleUrlAuthenticationSuccessHandler  {

	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication) throws IOException,
			ServletException {
		if (authentication != null) {
			 authentication.getAuthorities();
			 Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
			 if(roles.contains("admin")){
		        	setDefaultTargetUrl("/admin/adminDashboard.htm");
		     }   
			 else if (roles.contains("receptionist")) {
		        	setDefaultTargetUrl("/home/home.htm");
		        }
		        else  if(roles.contains("lab")){
		        	setDefaultTargetUrl("/lab/labDashboard.htm");
		        }
			 	User userDetails=(User)authentication.getPrincipal();
			 	String name =userDetails.getUsername();
				request.getSession().setAttribute("name", name);
		       super.onAuthenticationSuccess(request, response, authentication);
		 }
	}

}
