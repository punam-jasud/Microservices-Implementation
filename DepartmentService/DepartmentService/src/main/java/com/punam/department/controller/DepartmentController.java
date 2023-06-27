package com.punam.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.punam.department.model.DepartmentDto;
import com.punam.department.service.DepartmentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(
		name = "DepartmentController",
		description = "REST APIs for Department Service"
)


@RestController
@RequestMapping("api/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@Operation(
			summary = "Save Department API",
			description = "Save Department API Saves Department Object in the Database"
	)
	
	@ApiResponse(
			responseCode = "201",
			description = "HTTP Status 201 CREATED"
	)
	
	@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto){
		DepartmentDto department = departmentService.saveDepartment(departmentDto);
		return new ResponseEntity<>(department, HttpStatus.CREATED);
	}
	
	
	
	@Operation(
			summary = "Get Department API",
			description = "Get Department API Returns Department Object from the Database"
	)
	
	@ApiResponse(
			responseCode = "200",
			description = "HTTP Status 200 OK"
	)
	
	@GetMapping("/{code}")
	public ResponseEntity<DepartmentDto> getDepartment(@PathVariable String code){
		DepartmentDto department = departmentService.getDepartmentByCode(code);
		return new ResponseEntity<>(department, HttpStatus.OK);
	}
	

}
