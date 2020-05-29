package com.howtodoinjava.demo.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.annotation.Persistent;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.howtodoinjava.demo.model.EmployeeEntity;

public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom<EmployeeEntity, Long>{

	@PersistenceContext
	EntityManager entityManager;
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeEntity> getEmployessAll() {
		
		Query query= entityManager.createNativeQuery("select em.* from TBL_EMPLOYEES em");
		
		
		return query.getResultList();
	}

}
