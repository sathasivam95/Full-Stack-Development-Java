package com.sg.pizzahaven;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PIZZAMENU")
public class PizzaMenu {
	
	private @Id @GeneratedValue Long pizza_index;
	private String pizza_name;
	private Double cost;
	
	PizzaMenu(){
		
	}
	
	public PizzaMenu(Long pizza_index, String pizza_name, Double cost) {
		super();
		this.pizza_index = pizza_index;
		this.pizza_name = pizza_name;
		this.cost = cost;
	}

	/**
	 * @return the pizza_index
	 */
	public Long getPizza_index() {
		return pizza_index;
	}

	/**
	 * @param pizza_index the pizza_index to set
	 */
	public void setPizza_index(Long pizza_index) {
		this.pizza_index = pizza_index;
	}

	/**
	 * @return the pizza_name
	 */
	public String getPizza_name() {
		return pizza_name;
	}

	/**
	 * @param pizza_name the pizza_name to set
	 */
	public void setPizza_name(String pizza_name) {
		this.pizza_name = pizza_name;
	}

	/**
	 * @return the cost
	 */
	public Double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cost, pizza_index, pizza_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaMenu other = (PizzaMenu) obj;
		return Objects.equals(cost, other.cost) && Objects.equals(pizza_index, other.pizza_index)
				&& Objects.equals(pizza_name, other.pizza_name);
	}

	@Override
	public String toString() {
		return "PizzaMenu [pizza_index=" + pizza_index + ", pizza_name=" + pizza_name + ", cost=" + cost + "]";
	}

	
}
