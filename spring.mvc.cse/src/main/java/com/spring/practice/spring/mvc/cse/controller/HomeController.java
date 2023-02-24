package com.spring.practice.spring.mvc.cse.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;


@Controller
public class HomeController {
	@RequestMapping("/login")
	public String login() {
		
			System.out.println("from is start to login!!!");
			return "login";
		}
	@RequestMapping(value="/processform",method=RequestMethod.POST)
	public String processform(@RequestParam("uname") String name,
			                  @RequestParam("upwd") String pwd,
			                  Model model) {
		System.out.println("name:"+name);
		System.out.println("password:"+pwd);
		model.addAttribute("kyname",name);
		model.addAttribute("kypwd",pwd);
			System.out.println("form is processed!!!");
			return "successs";
		}
	
	
	@RequestMapping("/mview")
	public ModelAndView mview() {
		ModelAndView m=new ModelAndView();
		m.addObject("uname","Vipul kumar");
		m.setViewName("mview");
		
		return m;
		
	}
	
	
	
	@RequestMapping("/display")
	public String display(Model model) {
		model.addAttribute("niet","Noida Inst. of Tech.");
		model.addAttribute("nirf",135);
		ArrayList<String> course=new ArrayList<String>();
		course.add("Adj java prog");
		course.add("Python");
		course.add(".Net Framework");
		course.add("Ruby on Rail");
		model.addAttribute("kyc",course);
		System.out.print("inside model");
		return "display";
		
	}

	@RequestMapping(value="/hello")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
}
