package com.test.services.inventory.inventoryservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.test.services.inventory.inventoryservices.dto.ProductDTO;
import com.test.services.inventory.inventoryservices.entity.Products;
import com.test.services.inventory.inventoryservices.service.ProductServices;


@CrossOrigin("*")
@RequestMapping(value = "/products")
@RestController
public class ProductsController {

	@Autowired
	private ProductServices productServices;
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Products addProduct(@RequestBody ProductDTO products) {
		Products prd = new Products();
		prd.setCode(products.getCode());
		prd.setName(products.getName());
		prd.setPrice(products.getPrice());
		prd.setStock(products.getStock());
		return productServices.addProduct(prd);
	}
	
	@PatchMapping(consumes = "application/json", produces = "application/json")
	public Products updateProduct(@RequestBody ProductDTO products) {
		Products prd = productServices.fetchProductById(products.getId());
		prd.setCode(products.getCode());
		prd.setName(products.getName());
		prd.setPrice(products.getPrice());
		prd.setStock(products.getStock());
		return productServices.addProduct(prd);
	}
	
	@GetMapping("/{id}")
	public Products fetchProductById(@PathVariable int id) {
		return productServices.fetchProductById(id);
	}
}
