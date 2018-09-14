package com.hcentive.training.addition;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/number")
public class AdditionController {

	
	@GetMapping(value="/{first}/{second}")
	public ResponseEntity<Integer> addNumbers(@PathVariable("first") Integer first,
			@PathVariable("second") Integer second) {
		System.out.println("**********Inside add Numbers *****");
		return ResponseEntity.ok(second + first);
	}
}
