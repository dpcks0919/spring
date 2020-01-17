package com.yechan.springPara;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class requestParamController {
	@RequestMapping("/requestParam")
	String temp(@RequestParam("a") String a, @RequestParam("b") int b)
	{
		System.out.println("a : " + a);
		// Integer.parseInt() 과정이 필요없다!
		System.out.println("b : " + b);

		return "requestParam";
	}
}
