package com.punam.employee.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;


@Schema(
		description = "Employee Service Model"
)

@Data
@AllArgsConstructor
public class EmployeeDto {

	@Schema(description = "Employee ID")
	private Long id;

	@Schema(description = "Employee First Name")
	private String firstName;

	@Schema(description = "Employee Last Name")
	private String lastName;

	@Schema(description = "Employee Email Address")
	private String email;

	@Schema(description = "Employee Department Code")
	private String departmentCode;

	@Schema(description = "Employee Orgnization COde")
	private String orgnizationCode;

}
