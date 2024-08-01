package com.sample.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.sample.entity.EmployeeEntity;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public EmployeeEntity saveEmp(EmployeeEntity empEntity) {
		// TODO Auto-generated method stub
		  entityManager.persist(empEntity);
		  empEntity.setEmpId(empEntity.getEmpId());
		return empEntity;
	}

	@Override
	public EmployeeEntity findById(Long Id) {
		// TODO Auto-generated method stub
		return entityManager.find(EmployeeEntity.class, Id);
	}

	@Override
	public List<EmployeeEntity> findAll() {
		// TODO Auto-generated method stub
		TypedQuery<EmployeeEntity>query=entityManager.createQuery("SELECT e from EmployeeEntity e",EmployeeEntity.class);
		return query.getResultList();
	}
	

}
