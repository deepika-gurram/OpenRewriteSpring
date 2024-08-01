package com.sample.dao;

import java.util.List;

import com.sample.entity.EmployeeEntity;

public interface EmployeeDAO {

	public EmployeeEntity saveEmp(EmployeeEntity empEntity);
	EmployeeEntity findById(Long Id);
	List<EmployeeEntity> findAll();
}
