package com.docongban.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.docongban.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query(value = "SELECT * FROM employee where username=?1", nativeQuery = true)
	public Employee findByUsername(String username);
}
