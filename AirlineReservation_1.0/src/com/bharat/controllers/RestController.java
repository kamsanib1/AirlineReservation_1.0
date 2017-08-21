package com.bharat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bharat.hibernate.bussiness.AdminManager;
import com.bharat.hibernate.bussiness.UserManager;

@Controller
public class RestController {

	@ResponseBody
	@RequestMapping("/rest/login")
	protected String login(	@RequestParam("username") String username, 
							@RequestParam("password") String password,
							@RequestParam("type") String type){
		
		if(type=="user")
		{
			UserManager um = new UserManager();
			if(um.verifyUser(username, password))
				return "success";
			else
				return "fail";
		}
		else{
			AdminManager am = new AdminManager();
			if(am.verifyAdmin(username, password))
				return "success";
			else
				return "fail";
		}	
		
	}
}
