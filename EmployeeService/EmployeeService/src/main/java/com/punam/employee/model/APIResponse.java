package com.punam.employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse {
	
	private EmployeeDto employee;
	private DepartmentDto department;
	private OrgnizationDto orgnization;

}
