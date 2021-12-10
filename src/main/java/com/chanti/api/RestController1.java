package com.chanti.api;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestController1 {

	private List fruits=Arrays.asList("Mango","Banana","Graphes");
	private static final Logger LOG=LoggerFactory.getLogger(RestController1.class);
	
	@GetMapping("/fruits")
	public ResponseEntity<?> showFruits(){
		fruits.forEach((fruit)->{
			LOG.debug("{}",fruit);
		});
		return ResponseEntity.ok(fruits);
	}
}
