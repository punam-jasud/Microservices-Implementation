package com.punam.department.service;

import com.punam.department.model.DepartmentDto;

public interface DepartmentService {
	
	DepartmentDto saveDepartment(DepartmentDto department);

	DepartmentDto getDepartmentByCode(String code);

}
