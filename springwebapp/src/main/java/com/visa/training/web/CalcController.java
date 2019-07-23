package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalcController {
	
	@RequestMapping("/calculator")
	public ModelAndView calculate(@RequestParam("op1") String op1, @RequestParam("op2") String op2,
			@RequestParam("operation") String operation) {
		
		double n1 = Double.parseDouble(op1);
		double n2 = Double.parseDouble(op2);
		Double result = null;
		switch (operation) {
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		default:
			result = n1 + n2;
		}
		
		String viewName = "calcview";
		
		Map<String, Object> attributes = new HashMap<String, Object>();
		attributes.put("result",result);
		
		return new ModelAndView(viewName,attributes);
		

	}

}
