package com.hcentive.training.subtraction;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/number")
public class SubtractionController {

	@GetMapping(value="/{first}/{second}")
	public ResponseEntity<Integer> subNumbers(@PathVariable("first") Integer first,
			@PathVariable("second") Integer second) {
		
		return ResponseEntity.ok(second-first);
	}
}
