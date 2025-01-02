package com.mycompany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.Entity.Product;
import com.mycompany.Service.ProductService;

@RestController
@RequestMapping("/products")

public class MyController {
	

		@Autowired
		private ProductService  productService;
		
		
		@GetMapping
		public List<Product> getProducts(){
			return productService.getProducts();
		}
		
		@GetMapping("{category}")
		public List<Product> getProductsByCategory(@PathVariable String category){
			return productService.getProductsByCategory(category);
		}
		
	}