package com.sonata.mvc.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sonata.mvc.model.Product;
import com.sonata.mvc.repository.ProductRepository;

@RestController
public class ProductController {
	Optional<Product> p1;
	
	@Autowired
	private ProductRepository prepository;
	
	@RequestMapping("/")
	public String sayHi() {
		return "This is a Product Controller";
	}
	
	@GetMapping("/product")
	public List<Product> getAllProducts() {
		return prepository.findAll();
	}

}
