package com.punam.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.punam.department.entity.Department;



@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	Department findByCode(String code);

}
