package com.mycompany.controller;


import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.dao.Test_imageDao;

import com.mycompany.entity.Test_image;
import com.mycompany.services.Test_image_services;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MyController {

	@Autowired
	Test_image_services tis;
	
	@GetMapping("/getAll")
	public Iterator<Test_image> getAll() {
		return  tis.getAll();
	}
	
	@GetMapping("/getAll/{id}")
	public Test_image get(@PathVariable Integer id) {
		
		return tis.get(id);
	}
	
	
	@PostMapping("/post")
	public Test_image post(@RequestBody Test_image test_image) {
		return test_image =tis.post(test_image);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		tis.delete(id);
		
	}
	
	   @PutMapping("/put")
	   public Test_image put(@RequestBody Test_image test_image) {
	      
	       
	       return tis.put(test_image);
	   }
	
}
