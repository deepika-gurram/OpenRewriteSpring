package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.entity.EmployeeEntity;
import com.sample.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value ="/saveEmp" ,method =RequestMethod.POST,consumes = {"application/json"})
	@ResponseBody
	public ResponseEntity<EmployeeEntity> saveEmp(@RequestBody EmployeeEntity empEntity) {
		EmployeeEntity emp =null;
		try {
		 emp = empService.saveEmp(empEntity);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return new ResponseEntity<EmployeeEntity>(emp, HttpStatus.OK);
	}
	
	@RequestMapping(value ="/users",method = RequestMethod.GET)
	@ResponseBody
	public List<EmployeeEntity> getAllUsers() {
		
		return empService.getAllUsers();
	}
	@RequestMapping(value ="/{id}",method = RequestMethod.GET)
	@ResponseBody
	public EmployeeEntity getUserById(@PathVariable Long id) {
		
		return empService.getUserById(id);
	}

}
