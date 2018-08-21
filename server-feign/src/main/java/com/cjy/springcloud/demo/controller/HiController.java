package com.cjy.springcloud.demo.controller;

import com.cjy.springcloud.demo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

	@Autowired
	SchedualServiceHi schedualServiceHi;

	@GetMapping(value = "/hi")
	public String sayHi(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
		return  schedualServiceHi.sayHiFromClientOne(name).concat("。By feign");
	}

}
