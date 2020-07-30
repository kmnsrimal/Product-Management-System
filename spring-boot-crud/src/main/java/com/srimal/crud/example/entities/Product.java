package com.srimal.crud.example.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    
//	Logger logger = LoggerFactory.getLogger(Product.class);
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quentity;
	private double price;
	
	
	
	public Integer getId() {
		// TODO Auto-generated method stub
		System.out.println(id);
		return id;
	}
	
public String getName() {
		return name;
	}



	public void setName(String name) {
		System.out.println("name"+name);
		this.name = name;
	}



	public int getQuentity() {
		return quentity;
	}



	public void setQuentity(int quentity) {
		System.out.println("quentity"+quentity);
		this.quentity = quentity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		System.out.println("price"+price);
		this.price = price;
	}



	public void addAttribute(String string, List<Product> listProducts) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}

