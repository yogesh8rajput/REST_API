package com.mycompany.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategory(String category);

}
