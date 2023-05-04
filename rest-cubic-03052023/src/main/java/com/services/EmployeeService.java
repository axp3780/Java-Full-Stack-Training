package com.services;

import java.util.List;

import com.entity.EmployeeEntity;

public interface EmployeeService {

	void saveEmployee(EmployeeEntity employeeEntity);

	EmployeeEntity authenticate(String email, String pswd);

	List<EmployeeEntity> findAllEmployee();

	void deleteEmp(int employeeId);

	EmployeeEntity findByEmployeeId(int employeeId);

	void updateEmployee(EmployeeEntity employeeEntity);




}
