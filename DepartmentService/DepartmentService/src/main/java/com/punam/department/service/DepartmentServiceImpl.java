package com.punam.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.punam.department.entity.Department;
import com.punam.department.mapper.DepartmentMapper;
import com.punam.department.model.DepartmentDto;
import com.punam.department.repository.DepartmentRepository;


@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto dept) {
		
		Department department = DepartmentMapper.mapToDepartment(dept);
		
		Department savedDepartment = departmentRepository.save(department);
		
		DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(savedDepartment);
		
		return departmentDto;
	}

	@Override
	public DepartmentDto getDepartmentByCode(String code) {
		
		Department department = departmentRepository.findByCode(code);
		
		DepartmentDto departmentDto = DepartmentMapper.mapToDepartmentDto(department);
		
		return departmentDto;
	}

}
