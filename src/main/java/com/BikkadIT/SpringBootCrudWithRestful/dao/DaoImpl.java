package com.BikkadIT.SpringBootCrudWithRestful.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringBootCrudWithRestful.model.Employee;

@Repository
public class DaoImpl implements DaoI{

	@Override
	public Employee addEmployee(Employee employee) {
		System.out.println("It is just for Demo");
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}



}
