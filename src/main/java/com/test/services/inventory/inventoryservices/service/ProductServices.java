package com.test.services.inventory.inventoryservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.services.inventory.inventoryservices.entity.Products;
import com.test.services.inventory.inventoryservices.repository.ProductRepository;

@Service
public class ProductServices {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Products addProduct(Products product) {
		
		return productRepository.save(product);
	}
	
	public Products fetchProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
}
