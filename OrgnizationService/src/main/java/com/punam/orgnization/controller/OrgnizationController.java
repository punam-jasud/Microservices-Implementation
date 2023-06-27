package com.punam.orgnization.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.punam.orgnization.model.OrgnizationDto;
import com.punam.orgnization.service.OrgnizationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(
		name = "OrgnizationController",
		description = "REST APIs for Orgnization Service"
)


@RestController
@RequestMapping("api/orgnizations")
public class OrgnizationController {
	
	@Autowired
	private OrgnizationService orgnizationService;
	
	@Operation(
			summary = "Save Orgnization API",
			description = "Save Orgnization API Saves Orgnization Object in the Database"
	)
	
	@ApiResponse(
			responseCode = "201",
			description = "HTTP Status 201 CREATED"
	)
	
	@PostMapping
	public ResponseEntity<OrgnizationDto> saveOrgnization(@RequestBody OrgnizationDto orgnizationDto){
		OrgnizationDto org = orgnizationService.saveOrgnization(orgnizationDto);
		return new ResponseEntity<OrgnizationDto>(org, HttpStatus.CREATED);
	}
	
	
	@Operation(
			summary = "Get Orgnization API",
			description = "Get Orgnization API Returns Orgnization Object from the Database"
	)
	
	@ApiResponse(
			responseCode = "200",
			description = "HTTP Status 200 OK"
	)

	
	@GetMapping("/{code}")
	public ResponseEntity<OrgnizationDto> getOrgnization(@PathVariable String code){
		OrgnizationDto org = orgnizationService.getOrgnization(code);
		return new ResponseEntity<OrgnizationDto>(org, HttpStatus.OK);
	}


}
