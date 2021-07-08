package com.cognizant.project.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.project.app.dao.EmployeeDao;
import com.cognizant.project.app.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI {
	
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee getEmployee(Employee employee) {
		return employeeDao.save(employee);
	}
}
