package com.akshay.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse resp) {
		System.out.println("this is add controller");
		
		int t1 = Integer.parseInt(request.getParameter("t1"));
		int t2 = Integer.parseInt(request.getParameter("t2"));
		int res = t1+t2;
		
		ModelAndView ModelAndView = new ModelAndView();
		ModelAndView.setViewName("addResult.jsp");
		ModelAndView.addObject("result", res);
		
		//return "addResult.jsp";
		return ModelAndView;
	}

}
