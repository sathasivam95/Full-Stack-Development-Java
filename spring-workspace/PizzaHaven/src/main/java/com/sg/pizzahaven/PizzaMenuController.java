package com.sg.pizzahaven;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PizzaMenuController {
	
	private final PizzaMenuRepository pizzaMenuRepository;

	PizzaMenuController(PizzaMenuRepository pizzaMenuRepository){
		this.pizzaMenuRepository = pizzaMenuRepository;
	}
	
	//get Menu
	@GetMapping("/menu")
	List<PizzaMenu>getMenu(){
		return pizzaMenuRepository.findAll();
	}
	

	//update menu
	@PutMapping("/menu/{pizza_index}")
	PizzaMenu updateMenu(@PathVariable Long pizza_index,@RequestBody PizzaMenu newPizzaMenu){
		return pizzaMenuRepository.findById(pizza_index).map(
				PizzaMenu ->{
					PizzaMenu.setCost(newPizzaMenu.getCost()); //sets the new cost
					return pizzaMenuRepository.save(PizzaMenu);
				}).orElseGet( ()-> {
					newPizzaMenu.setPizza_index(pizza_index);
					return pizzaMenuRepository.save(newPizzaMenu);
				});
		}
	
}
		//Pathvariable is pointing to the reference whereas Request Body is you putting in the value
