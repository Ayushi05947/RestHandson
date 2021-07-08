package com.cognizant.project.app.service;

import com.cognizant.project.app.model.Employee;

public interface EmployeeServiceI {
	//to addEmployee to the data @postMapping
	public Employee addEmployee(Employee employee);
	//to update the Employee details @putMapping
	public Employee updateEmployee(Employee employee);
	//to delete the employee details @deleteMapping
	public Employee deleteEmployee(Employee employee);
	//to get all the employee @getMapping
	public Employee getEmployee(Employee employee);


}
