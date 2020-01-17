package com.yechan.springPara;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class requestController {
	
	@RequestMapping("/request")
	String temp(HttpServletRequest request)
	{
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		return "request";
	}
}
