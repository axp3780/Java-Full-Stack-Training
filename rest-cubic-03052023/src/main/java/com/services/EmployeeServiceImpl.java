package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
//import com.dao.EmployeeDao;
import com.entity.EmployeeEntity;


@Service
@Transactional

public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired 
	EmployeeDao  employeeDao;
	
	
	@Override
	public void saveEmployee(EmployeeEntity employeeEntity) {		
		employeeDao.save(employeeEntity);//It is not mandatory to mention this save() in repository(dao interface as it is inbuilt method)			
		
	}
	
	@Override
	public EmployeeEntity authenticate(String email, String pswd) {		
		EmployeeEntity employeeEntity=employeeDao.findByEmailIdAndPassword(email,pswd);	//derived method
		return employeeEntity;
	}

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		
	List<EmployeeEntity> employeeEntityList=employeeDao.findAll();		
		
		return employeeEntityList;
	}
	
	@Override
	public void deleteEmp(int employeeId) {
		
		employeeDao.deleteById(employeeId);
	}
	
	@Override
	public EmployeeEntity findByEmployeeId(int employeeId) {
		
		Optional<EmployeeEntity> optional=employeeDao.findById(employeeId);
		if(optional.isPresent()) {
			
			EmployeeEntity employeeEntity=optional.get();
			return employeeEntity;
		}
		
		
	
		return null;
	}
	
	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) {		
		employeeDao.save(employeeEntity);		
	}


	
}
