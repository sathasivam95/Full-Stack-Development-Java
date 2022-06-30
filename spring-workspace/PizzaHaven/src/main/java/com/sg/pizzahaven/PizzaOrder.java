package com.sg.pizzahaven;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PIZZAORDERNEW")
public class PizzaOrder {
	
	private @Id @GeneratedValue Long order_id;
	private String first_name;
	private String last_name;
	
	PizzaOrder(){
		
	}

	public PizzaOrder(Long order_id, String first_name, String last_name) {
		super();
		this.order_id = order_id;
		this.first_name = first_name;
		this.last_name = last_name;
	}

	/**
	 * @return the order_id
	 */
	public Long getOrder_id() {
		return order_id;
	}

	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	/**
	 * @return the first_name
	 */
	public String getFirst_name() {
		return first_name;
	}

	/**
	 * @param first_name the first_name to set
	 */
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	/**
	 * @return the last_name
	 */
	public String getLast_name() {
		return last_name;
	}

	/**
	 * @param last_name the last_name to set
	 */
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(first_name, last_name, order_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaOrder other = (PizzaOrder) obj;
		return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
				&& Objects.equals(order_id, other.order_id);
	}

	@Override
	public String toString() {
		return "PizzaOrder [order_id=" + order_id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
	}
	
	
	

}
