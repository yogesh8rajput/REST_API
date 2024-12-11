package com.mycompany.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.entity.Employe1;

@Service
public class Employee1Service {
   
	private List<Employe1> l=new ArrayList<>();
	
	public Employee1Service() {
		Employe1 e1=new Employe1();
		e1.setE_id(101);
		e1.setE_name("Ayush");
		e1.setE_age(15);
		
		Employe1 e2=new Employe1();
		e2.setE_id(102);
		e2.setE_name("Babula");
		e2.setE_age(16);
		
		Employe1 e3=new Employe1();
		e3.setE_id(103);
		e3.setE_name("Raja");
		e3.setE_age(17);
		
		l.add(e1);
		l.add(e2);
		l.add(e3);


	}
	
	public List<Employe1> getAll()
	{
		return l;
		
	}
}
