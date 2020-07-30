package com.srimal.crud.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.srimal.crud.example.entities.Product;

//import com.srimal.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository< Product,Integer>{

	Product findByName(String name);

//	List<Product> listAll(List<Product> products);

}
