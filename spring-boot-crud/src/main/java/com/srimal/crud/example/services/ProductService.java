package com.srimal.crud.example.services;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srimal.crud.example.entities.Product;
import com.srimal.crud.example.repository.ProductRepository;


@Service
public class ProductService {
	
	Logger logger = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		logger.error("save product in product service");
	return 	repository.save(product);
	
	}
	
	public List <Product> saveProducts(List<Product> products) {
		return 	repository.saveAll(products);
		}
	
	public List<Product>getProducts(){
		return repository.findAll();
	}
	
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Product getProductByName(String name){
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		repository.deleteById(id);
		return "Product removed!!"+id;
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuentity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
		
	}
	
//	public List <Product> listProducts(List<Product> products) {
//		return 	repository.listAll(products);
//		}

	public List<Product> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object listAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}