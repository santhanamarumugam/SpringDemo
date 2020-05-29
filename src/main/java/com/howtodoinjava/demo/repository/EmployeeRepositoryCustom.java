package com.howtodoinjava.demo.repository;

import java.util.List;

import com.howtodoinjava.demo.model.EmployeeEntity;

public interface EmployeeRepositoryCustom<EmployeeEntity, Long> {

	 public List<EmployeeEntity> getEmployessAll();

}
