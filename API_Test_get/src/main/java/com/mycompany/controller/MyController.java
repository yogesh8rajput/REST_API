package com.mycompany.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.Employee1;
import com.mycompany.service.Employee1Service;

@RestController
public class MyController {
   @Autowired
   Employee1Service es;
   
   @GetMapping("/getAll")
   public Iterator<Employee1> getAll()
   {
	   
	   return es.getAll();
   }
   
   @GetMapping("/getAll/{id}")
   public Employee1 getid(@PathVariable Integer id)
   {
	   
	   return es.get(id);
   }
   
   
   @PostMapping("/post")
   public Employee1 post(@RequestBody Employee1 employee1)
   {
	   return employee1=es.post(employee1);
	   
//	   return es.post(employee1);
   }
}