package com.sg.pizzahaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sg.pizzahaven.PizzaMenu;

@Repository
public interface PizzaMenuRepository extends JpaRepository<PizzaMenu, Long>{

}
