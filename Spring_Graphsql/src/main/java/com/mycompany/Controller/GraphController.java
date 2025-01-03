package com.mycompany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.Entity.Product;
import com.mycompany.Repository.ProductRepository;
import com.mycompany.Service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GraphController {

	@Autowired
	private ProductService  productService;
	
	
	@QueryMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@QueryMapping
	public List<Product> getProductsByCategory(@Argument String category){
		return productService.getProductsByCategory(category);
	}
	
	@MutationMapping
	public Product updateStock(@Argument int id,@Argument int stock)
	{
		return productService.updateStock(id, stock);
	}
	
	@MutationMapping
	public Product recieveNewShipment(@Argument int id,@Argument int stock)
	{
		return productService.recieveNewShipment(id, stock);
	}
}
