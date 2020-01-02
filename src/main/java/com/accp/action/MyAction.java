package com.accp.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Bill")
public class MyAction {
	@GetMapping
	public String getA() {
		return "asd";
	}
}
