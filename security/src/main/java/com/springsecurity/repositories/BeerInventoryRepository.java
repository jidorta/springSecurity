package com.springsecurity.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.brewery.domain.Beer;
import com.springsecurity.brewery.domain.BeerInventory;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID>{
	
	List<BeerInventory>findAllByBeer(Beer beer);

}
