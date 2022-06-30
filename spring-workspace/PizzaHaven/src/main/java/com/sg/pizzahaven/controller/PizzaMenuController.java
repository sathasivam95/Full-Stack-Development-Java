package com.sg.pizzahaven.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.pizzahaven.PizzaMenu;
import com.sg.pizzahaven.repository.PizzaMenuRepository;


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
		return pizzaMenuRepository.findById(pizza_index)
				.map( PizzaMenu -> {
					if(PizzaMenu.getPizza_index()==pizza_index) {
						PizzaMenu.setPizza_name(newPizzaMenu.getPizza_name()); //sets pizzaName
						PizzaMenu.setCost(newPizzaMenu.getCost()); //set pizzaCost
					}
					return pizzaMenuRepository.save(PizzaMenu);
					}).orElseGet( ()-> {newPizzaMenu
						.setPizza_index(pizza_index);
					return pizzaMenuRepository.save(newPizzaMenu);
				});
		}
	
	@DeleteMapping("/menu/{pizza_index}")
	void deleteUserById(@PathVariable Long pizza_index)
	{
		pizzaMenuRepository.deleteById(pizza_index); //no need to return anything
	}

	}
		
