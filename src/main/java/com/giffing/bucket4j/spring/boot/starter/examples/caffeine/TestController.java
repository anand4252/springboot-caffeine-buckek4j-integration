package com.giffing.bucket4j.spring.boot.starter.examples.caffeine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.cache.CacheManager;

@RestController
public class TestController {
	@Autowired
	private TestService service;
	
	@GetMapping("hello/{id}")
	public ResponseEntity<String> hello(@PathVariable int id) {
		return ResponseEntity.ok(service.myService(id));
	}
}
