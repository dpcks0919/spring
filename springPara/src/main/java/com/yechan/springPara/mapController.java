package com.yechan.springPara;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mapController {
	@RequestMapping("/map")
	String temp(@RequestParam Map<String, String> param)
	{
		String a = param.get("a");
		String b = param.get("b");

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		return "map";
	}
}
