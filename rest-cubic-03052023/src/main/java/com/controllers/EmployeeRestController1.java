package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
import com.response.ResponseDTO;
import com.services.EmployeeService;

@RestController

@RequestMapping("/api/v1")

public class EmployeeRestController1 {
	@Autowired
	EmployeeService employeeService;
	
	 
	@GetMapping("/employees") //api/v1/employees
	List<EmployeeEntity>findAllEmployees(){
		
		return employeeService.findAllEmployee();		
		
	}
	
	
	@GetMapping("/employees/{employeeId}") //localhost:999/api/v1/employees/2
	EmployeeEntity findByEmpId(@PathVariable int employeeId){
		
		EmployeeEntity employeeEntity= employeeService.findByEmployeeId(employeeId);	
		return employeeEntity;
		
	}
	
	@PostMapping("/employees")
	ResponseDTO doRegistration(@RequestBody EmployeeDTO employeeDTO) {

		// System.out.println(employeeEntity);

		employeeService.saveEmployee(employeeDTO);
		ResponseDTO responseDTO=new ResponseDTO();
		responseDTO.setMessage("registration done successfully");
		responseDTO.setStatus(201);
		

		return responseDTO;

	}
	
	
	
	
	

}
