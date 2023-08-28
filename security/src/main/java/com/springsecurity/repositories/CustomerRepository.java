package com.springsecurity.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.brewery.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
	
	List<Customer> findAllByCustomerNameLike(String customerName);

}
