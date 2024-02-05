package com.test.services.inventory.inventoryservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.services.inventory.inventoryservices.entity.Products;


@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {

}
