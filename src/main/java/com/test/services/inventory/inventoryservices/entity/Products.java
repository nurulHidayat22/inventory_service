package com.test.services.inventory.inventoryservices.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "stock")
	private Integer stock;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", code=" + code + ", price=" + price + ", stock=" + stock
				+ "]";
	}

}
