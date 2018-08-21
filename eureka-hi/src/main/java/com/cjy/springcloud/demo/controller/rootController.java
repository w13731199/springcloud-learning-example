package com.cjy.springcloud.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rootController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/")
	public String index() {
		return "It's work with port：".concat(port);
	}

	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "cjy") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

	@RequestMapping("/info")
	public String info(@RequestParam(value = "name", defaultValue = "cjy") String name) {
		return "hello " + name + " ,i am from port:" + port;
	}

}
