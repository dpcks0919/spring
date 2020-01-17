package com.yechan.springPara;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pathController {
	@RequestMapping("/path/{a}/{b}")
	String temp(@PathVariable("a") String a, @PathVariable("b") int b)
	{
		System.out.println(a);
		System.out.println(b);
		
		return "path";
	}
}
