package com.telusko;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.service.Addservice;

@Controller
public class MultiplyController {
	@RequestMapping("/multiply")

	public ModelAndView addition(HttpServletRequest request,HttpServletResponse response)
		{
		int i = Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		
		
		Addservice as=new Addservice();
		int k=as.operation(i,j,"*");
		
		ModelAndView mv=new ModelAndView();
	mv.setViewName("display.jsp");
		mv.addObject("result",k);
		
		return mv;
		
		}
}
