package com.sg.pizzahaven;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PizzaOrderController {
	
	private final PizzaOrderRepository pizzaOrderRepository;
	
	PizzaOrderController(PizzaOrderRepository pizzaOrderRepository){
		this.pizzaOrderRepository = pizzaOrderRepository;
	}
	
	//find all orders
	@GetMapping("/orders")
	List<PizzaOrder>getAll(){
		return pizzaOrderRepository.findAll();
	}
	
	//enter first name last name --> creates an order id
	@PostMapping("/orders")
	PizzaOrder newPizzaOrder(@RequestBody PizzaOrder pizzaOrder) {
		return pizzaOrderRepository.save(pizzaOrder);
	}
	
	//delete an order using order id
	@DeleteMapping("/orders/{order_id}")
	void deleteByOrderId(@PathVariable Long order_id){
		pizzaOrderRepository.deleteById(order_id);
	}
	
}
	


