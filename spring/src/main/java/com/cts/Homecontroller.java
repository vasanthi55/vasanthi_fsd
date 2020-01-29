package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	@RequestMapping("/")
	public String getHome() {
	return "index";
	}
	@RequestMapping("/admin")
	public String getAdminPage() {
	return "admin";
	}
	@RequestMapping("/user")
	public String getUser() {
	return "user";
	}

}
