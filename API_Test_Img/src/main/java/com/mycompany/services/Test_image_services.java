package com.mycompany.services;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.dao.Test_imageDao;
import com.mycompany.entity.Test_image;

@Service
public class Test_image_services {

	@Autowired
	Test_imageDao tid;
	
	public Iterator<Test_image> getAll(){
		
		Iterable<Test_image> t=tid.findAll();
		Iterator<Test_image> ti=t.iterator();
		return ti;
		
	}
	public Test_image get(int id) {
		Optional<Test_image> ti=tid.findById(id);
		Test_image t=ti.get();
	     return t;	
	}
	
	public Test_image post(Test_image test_image) {
		Test_image ti=tid.save(test_image);
		return ti;
	}
	
	public void delete(Integer id) {
		tid.deleteById(id);
	}
	
	public Test_image put(@RequestBody  Test_image test_image) {
		Optional<Test_image> op=tid.findById(test_image.getS_id());
//		Optional<Test_image> op1=tid.findById(test_image.getS_id());
		
		Test_image t=op.get();
	     t.setS_name(test_image.getS_name());
	     t.setS_img(test_image.getS_img());
	     return tid.save(t);
	}
	
}
