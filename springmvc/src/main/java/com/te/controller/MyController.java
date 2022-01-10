package com.te.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.te.controller.model.Register;
import com.te.controller.service.MvcService;
@Controller
public class MyController {

	@GetMapping("test")
	public String test(Model model) {
		String s = " haarshad";
		model.addAttribute("name", s);
		return "test.jsp";
	}

	@GetMapping("test2")
	public String test2(ModelMap map) {
		String s = " mehta";
		map.addAttribute("name", s);
		return "test.jsp";

	}
	@GetMapping("test3")
	public ModelAndView test3(ModelAndView mav) {
		
		String s =( " jetha laal !!!");
		mav.addObject("name",s);
		mav.setViewName("test.jsp");
		
		return mav;
		
	}
	
//	@PostMapping("/Register")
//	public String register(Register reg, ModelMap map) {
//		map.addAttribute("details",reg);
//		return "succsess.jsp";
//	}
//	@PostMapping("/register")
//	public String register(Register reg, ModelMap map) {
//		map.addAttribute("details",reg);
//		return"succsess.jsp";
//	}

}
