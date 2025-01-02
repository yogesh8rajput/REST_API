package com.mycompany;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mycompany.Entity.Product;
import com.mycompany.Repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringGraphsqlApplication {

	@Autowired
	private ProductRepository productRepository;
	
//	@PostConstruct
//	public void initDB() {
//		
//		List<Product> products=Stream.of(
//				new Product("Laptop","Electronics",10000,99f,50),
//				new Product("Mobile","Electronics",10000,99f,50),
//				new Product("Table","Carpanter",10000,99f,50),
//				new Product("Chair","Carpanter",10000,99f,50),
//				new Product("Chemistry","College",10000,99f,50),
//				new Product("Physics","College",10000,99f,50)
//				).collect(Collectors.toList());
//		productRepository.saveAll(products);
//	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGraphsqlApplication.class, args);
		
		System.out.println("GraphSql!!!!!!!!!");
	}

}
