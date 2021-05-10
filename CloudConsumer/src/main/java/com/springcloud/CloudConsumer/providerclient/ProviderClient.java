package com.springcloud.CloudConsumer.providerclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider")
public interface ProviderClient {
	
//	这个接口对应provider的接口
	@GetMapping("/sayHi")
	String sayHi(@RequestParam(value="name",defaultValue="noName") String name);

}
