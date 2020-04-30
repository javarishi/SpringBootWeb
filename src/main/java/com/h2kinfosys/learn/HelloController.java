package com.h2kinfosys.learn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public void sayHello() {
		System.out.println("Hello is called from URL");
	}
}
