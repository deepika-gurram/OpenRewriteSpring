package com.sample.Test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import com.sample.dao.EmployeeDAO;
import com.sample.entity.EmployeeEntity;
import com.sample.service.EmployeeService;

class saveEmployeeTest 
{
    
	@InjectMocks
	private EmployeeDAO empDao;
	private EmployeeService empService;

	@Test
	void saveEmployee()
	{
		EmployeeEntity empEntity=new EmployeeEntity();
		empEntity.setEmpId(1L);
		empEntity.setName("Test");
		empEntity.setDesg("Sr SoftwareEngineer");
		try {
			
			when(empService.saveEmp(any(EmployeeEntity.class))).thenReturn(empEntity);
			//empService.saveEmp(empEntity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
