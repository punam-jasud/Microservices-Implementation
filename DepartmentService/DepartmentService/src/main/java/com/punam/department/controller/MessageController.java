package com.punam.department.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(
		name = "MeassageController",
		description = "REST APIs for Testing Config Changes"
)

@RefreshScope
@RestController
public class MessageController {
	
	@Value("${spring.boot.message}")
	private String message;
	
	
	@Operation(
			summary = "Meassage API",
			description = "Retrive Message from Config Properties"
	)
	
	@ApiResponse(
			responseCode = "200",
			description = "HTTP Status 200 OK"
	)
	
	@GetMapping("/message")
	public String message() {
		return message;
	}

}
