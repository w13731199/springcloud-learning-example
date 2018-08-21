package com.cjy.springcloud.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	public String hiService(String name) {

		return restTemplate.getForObject("http://eureka-hi/hi?name=".concat(name), String.class);

	}

}
