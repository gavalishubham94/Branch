package com.BikkadIT.SpringBootCrudWithRestful.service;

import java.util.List;

import com.BikkadIT.SpringBootCrudWithRestful.model.Employee;

public class ServiceImpl implements ServiceI {

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("This is just for demo");
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
	System.out.println("TeamMember 2 done his works");
		return null;
	}

}
