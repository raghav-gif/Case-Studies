package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.model.ProductService;

@RestController
public class ShoppingRestController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/getallproducts")
	public List<Product> getIndex() {
		return service.getAllProducts();		
	}
	
	@PostMapping("/saveproduct")
	public ResponseEntity<?> saveproduct(@RequestBody Product product){
		service.saveProduct(product);
		return ResponseEntity.ok("Product Saved Successfully");
	}

	@PatchMapping("/updateproduct")
	public ResponseEntity<?> updateProduct(@RequestBody Product product){
		if(service.updateProduct(product)) {
			return ResponseEntity.ok("Item Upated Successfully");
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
		}
	}
	
	@DeleteMapping("/deleteproducts/{id}")
	public ResponseEntity<?> deleteitem(@PathVariable int id){
		if(service.deleteProduce(id)) {
			return ResponseEntity.ok("Product Deleted Successfully");
		}
		else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
		}
	}
	
	
}
