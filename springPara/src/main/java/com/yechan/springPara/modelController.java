package com.yechan.springPara;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class modelController {
	
	@RequestMapping("/model")
	String temp(Abc abc)
	{
		System.out.println("a : " + abc.getA());
		System.out.println("b : " + abc.getB());
		
		return "model";
	}
}
