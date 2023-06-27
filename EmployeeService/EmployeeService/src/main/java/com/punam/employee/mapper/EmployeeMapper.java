package com.punam.employee.mapper;

import com.punam.employee.entity.Employee;
import com.punam.employee.model.EmployeeDto;

public class EmployeeMapper {
	
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		
		EmployeeDto employeeDto = new EmployeeDto(
				employee.getId(), 
				employee.getFirstName(),
				employee.getLastName(), 
				employee.getEmail(),
				employee.getDepartmentCode(),
				employee.getOrgnizationCode());
		return employeeDto;
		
	}
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		
		Employee employee = new Employee(
				employeeDto.getId(), 
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail(),
				employeeDto.getDepartmentCode(),
				employeeDto.getOrgnizationCode());
		return employee;
		
	}

}
