package com.te.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.controller.model.Register;
import com.te.controller.service.MvcService;

@RequestMapping("/")
@Controller
public class MvcController {
	@RequestMapping("/spider")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/login")
	public String login() {
		return "login.jsp";

	}


	@GetMapping("/register")
	public String reg() {
		return"register.jsp";
	}
	
//	@PostMapping("/register")
//	public String register(@ModelAttribute Register req) {
//		System.out.println(req.getName()+":"+req.getEmail()+":"+req.getContactNumber()+":"+req.getAddress());
//		return "succsess.jsp";
//		
//	}
//	@PostMapping("/register")
//	public String register(Register reg, ModelMap map) {
//		map.addAttribute("details",reg);
//		return"succsess.jsp";
//	}

//	@RequestMapping(path = "/login", method = RequestMethod.POST)
//	public String log(HttpServletRequest req) {
//	public String log(@RequestParam("user") String usermane, @RequestParam("pass") String password) {
//		String username = req.getParameter("user");
//		String password = req.getParameter("pass");
//
//		if (usermane.isEmpty()) {
//			return "failure.jsp";
//		}
	//	return "succsess.jsp";
		
		
		@Autowired
		MvcService service;
		@PostMapping("/register")
		public String register(Register reg, ModelMap map) {
			map.addAttribute("details",reg);
			service.save(reg);
			return "succsess.jsp";

		}
		
		

}
