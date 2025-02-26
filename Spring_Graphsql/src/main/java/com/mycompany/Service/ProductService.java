package com.mycompany.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.Entity.Product;
import com.mycompany.Repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProducts(){
		return productRepository.findAll();
		
	}
	
	public List<Product> getProductsByCategory(String category){
		return productRepository.findByCategory(category);
	}

	// update the stock of a product
		public Product updateStock(int id,int stock) {
			Product existingProduct=productRepository.findById(id)
					.orElseThrow(()->new RuntimeException("Prodect not found"+id));
			existingProduct.setStock(stock);
			return productRepository.save(existingProduct);
		}
		//recieve new shipment
		
		public Product recieveNewShipment(int id,int stock) {
			Product existingProduct=productRepository.findById(id)
					.orElseThrow(()->new RuntimeException("Prodect not found"+id));
			existingProduct.setStock(existingProduct.getStock()+stock);
			return productRepository.save(existingProduct);
		}
	
}
