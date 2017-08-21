package com.bharat.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bharat.hibernate.bussiness.AdminManager;
import com.bharat.hibernate.bussiness.UserManager;
import com.bharat.hibernate.entity.Users;


@Controller
public class FirstController {

	/*@RequestMapping("/")
	public String defaultPage(){
		return "forward:/login";
	}
	*/
	@RequestMapping("/login")
	public ModelAndView login(){
		ModelAndView mv = new ModelAndView("jsp/login.jsp");
		return mv;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup(){
		ModelAndView mv = new ModelAndView("jsp/signup.jsp");
		return mv;
	}
	
	@RequestMapping("/submituserdata")
	public ModelAndView submitUserData(@ModelAttribute("Users") Users user){
		ModelAndView mv = new ModelAndView("jsp/signup.jsp");
		UserManager um = new UserManager();
		um.addUser(user);
		mv.addObject("msg","data inserted successfully.");
		return mv;
	}
	
	@RequestMapping("/verifylogin")
	public ModelAndView verifyLogin(@RequestParam("username") String username, @RequestParam("password") String password){
		ModelAndView mv;
		System.out.println("Controller:Before user manager.");
		UserManager um = new UserManager();
		System.out.println("Controller:After user manager.");
		if(um.verifyUser(username, password))
			 return new ModelAndView("jsp/loginSuccess.jsp");
		else{
			mv = new ModelAndView("jsp/login.jsp");
			mv.addObject("error","login failed");
			return mv;
		}
		
	}
	
	@RequestMapping("/admin_login")
	protected ModelAndView verifyAdmin(@RequestParam("username") String username, @RequestParam("password") String password){
	
		ModelAndView mv;
		System.out.println("Controller:Before user manager.");
		AdminManager um = new AdminManager();
		System.out.println("Controller:After user manager.");
		if(um.verifyAdmin(username, password))
			 return new ModelAndView("jsp/loginSuccess.jsp");
		
		else{
			mv = new ModelAndView("jsp/admin_login.jsp");
			mv.addObject("error","login failed");
			return mv;
		}
		
		
	}
	
}
