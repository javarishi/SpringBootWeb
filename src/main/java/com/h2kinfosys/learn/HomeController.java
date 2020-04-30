package com.h2kinfosys.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/test")
	public ModelAndView testMethod(@RequestParam("name") String custName) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", custName);
		mv.addObject("key" , " Its just a Boook name");
		mv.setViewName("hello");
		System.out.println("Test Complete");
		return mv;
	}
}
