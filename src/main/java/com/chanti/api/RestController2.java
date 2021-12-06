package com.chanti.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestController2 {

	private List flowers=Arrays.asList("Lilly","Jasmine","ROSE");
	
	@GetMapping("/flowers")
	public ResponseEntity<?> showFlowers(){
		return ResponseEntity.ok(flowers);
	}
}
