package com.microservices.orders.controllers;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.microservices.orders.dtos.ProductOrders;
import com.microservices.orders.dtos.ResponseDto;
import com.microservices.orders.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.microservices.orders.entity.Order;
import com.microservices.orders.services.OrderService;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class OrderController {
	
	@Autowired
	private OrderService OrderService;

	
	@PostMapping("/addorder")
	public String addNeworder( @RequestBody Order order ){
			return OrderService.addorder( order );		
	}

	@GetMapping("/allOrders")
	public List<Order> fetchAllProducts(){
		return  OrderService.fetchAllOrders();
	}


	@PostMapping("/updateProduct")
	public Order updateProduct(@RequestBody  Order order){

		return  OrderService.update(order);
	}

	@DeleteMapping("/deleteProduct/{id}")
	 public String deleteProductById(@PathVariable("id") String id)
	 {
		OrderService.deleteById(id);
		return "id no "+id+" is deleted";
	 }


}
