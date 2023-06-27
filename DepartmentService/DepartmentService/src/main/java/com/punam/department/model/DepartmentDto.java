package com.punam.department.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;


@Schema(
		description = "Department Service Model"
)

@Data
@AllArgsConstructor
public class DepartmentDto {
	
	@Schema(
			description = "Department ID"
	)
	private Long id;
	
	@Schema(
			description = "Department Name"
	)
	private String name;
	
	@Schema(
			description = "Department Description"
	)
	private String description;
	
	@Schema(
			description = "Department Code"
	)
	private String code;

}
