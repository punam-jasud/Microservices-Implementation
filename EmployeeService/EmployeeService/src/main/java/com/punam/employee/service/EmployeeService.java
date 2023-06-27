package com.punam.employee.service;

import com.punam.employee.model.APIResponse;
import com.punam.employee.model.EmployeeDto;

public interface EmployeeService {

	EmployeeDto saveEmployee(EmployeeDto employeeDto);

	APIResponse getEmployee(Long id);

}
