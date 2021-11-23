package com.cap.details.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cap.details.service.impl.CapDetailsService;

@RestController
public class CapDetailsController {
	
	@Autowired
	CapDetailsService capService;
	
	@GetMapping("/val/{number}")
	public String getCapDetails(@PathVariable("number") String capRegNumber) {
		return capService.getCapDetails(capRegNumber);
	}

}
