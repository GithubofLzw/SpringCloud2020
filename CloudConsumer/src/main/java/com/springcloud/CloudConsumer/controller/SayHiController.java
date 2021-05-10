package com.springcloud.CloudConsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.CloudConsumer.providerclient.ProviderClient;

@RestController
public class SayHiController {
	
	@Autowired
	ProviderClient providerClient;

	@GetMapping("/sayHiByConsumer")
	public String sayHi(@RequestParam(value = "ConsumerName", required = false) String name) {
		return providerClient.sayHi(name);
	}
}
