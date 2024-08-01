package com.sample.service;

import java.util.List;

import com.sample.entity.EmployeeEntity;

public interface EmployeeService {

	public EmployeeEntity saveEmp(EmployeeEntity empEntity) throws Exception;
	EmployeeEntity getUserById(Long Id);
	List<EmployeeEntity> getAllUsers();
}
