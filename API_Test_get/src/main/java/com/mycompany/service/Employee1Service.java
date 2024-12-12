package com.mycompany.service;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.Employee1Dao;
import com.mycompany.entity.Employee1;

@Service
public class Employee1Service {
       
	@Autowired
	Employee1Dao ed;
	
	public Iterator getAll()
	{
		Iterable<Employee1> itb=ed.findAll();
		Iterator<Employee1> itr=itb.iterator();
		return itr;
		
	}
	
	public Employee1 get(int id)
	{
		
		Optional<Employee1> op=ed.findById(id);
		Employee1 e=op.get();
		return e;
	}
	
	public Employee1 post(Employee1 employee1) {
		
		Employee1 e=ed.save(employee1);
		return e;
	}
}
