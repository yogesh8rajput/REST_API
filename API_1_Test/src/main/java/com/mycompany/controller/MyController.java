package com.mycompany.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mycompany.entity.Employe1;
import com.mycompany.service.Employee1Service;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class MyController {
	@Autowired
	Employee1Service service;
	
  @GetMapping("/getAll")
  public List<Employe1> get() {
      return service.getAll();
  }
  
}
