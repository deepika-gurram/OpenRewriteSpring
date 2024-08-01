package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sample.dao.EmployeeDAO;
import com.sample.entity.EmployeeEntity;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO empDAO;

	@Override
	@Transactional
	public EmployeeEntity saveEmp(EmployeeEntity empEntity) throws Exception {
		// TODO Auto-generated method stub
		return empDAO.saveEmp(empEntity);
	}

	@Override
	public EmployeeEntity getUserById(Long id) {
		// TODO Auto-generated method stub
		return empDAO.findById(id);
	}

	@Override
	public List<EmployeeEntity> getAllUsers() {
		// TODO Auto-generated method stub
		return empDAO.findAll();
	}


	

}
