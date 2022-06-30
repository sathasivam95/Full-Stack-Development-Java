package com.sg.pizzahaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.pizzahaven.PizzaOrder;

@Repository
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

}



