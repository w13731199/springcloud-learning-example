package com.cjy.springcloud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cjy.springcloud.demo.service.HelloService;

@RestController
public class HelloController {

	@Value("${server.port}")
	private String port;

	@Autowired
	HelloService helloService;
//
//	@RequestMapping("/error")
//	public String error() {
//		return "error port：".concat(port);
//	}

	@RequestMapping("/")
	public String index() {
		return "It's work with port：".concat(port);
	}

	@GetMapping(value = "/hi")
	public String hi(@RequestParam(value = "name", required = false, defaultValue = "") String name) {

		return helloService.hiService(name).concat("。By ribbon");

	}

}
