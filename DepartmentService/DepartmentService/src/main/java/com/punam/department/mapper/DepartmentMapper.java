package com.punam.department.mapper;

import com.punam.department.entity.Department;
import com.punam.department.model.DepartmentDto;

public class DepartmentMapper {
	
	public static DepartmentDto mapToDepartmentDto(Department department) {

		DepartmentDto departmentDto = new DepartmentDto(
				department.getId(), 
				department.getName(),
				department.getDescription(),
				department.getCode());
		return departmentDto;

	}
	
	public static Department mapToDepartment(DepartmentDto departmentDto) {

		Department department = new Department(
				departmentDto.getId(), 
				departmentDto.getName(),
				departmentDto.getDescription(), 
				departmentDto.getCode());
		return department;

	}

}
