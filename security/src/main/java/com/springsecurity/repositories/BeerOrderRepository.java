package com.springsecurity.repositories;

import java.util.List;
import java.util.UUID;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import com.springsecurity.brewery.domain.BeerOrder;
import com.springsecurity.brewery.domain.Customer;
import com.springsecurity.brewery.domain.OrderStatusEnum;


import jakarta.persistence.LockModeType;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
	
	Page<BeerOrder>findAdllByCustomer(Customer customer,Pageable pageable);
	
	List<BeerOrder> findAllByOrderStatus(OrderStatusEnum orderStatusEnum);
	
	@Lock(LockModeType.PESSIMISTIC_WRITE)
	BeerOrder findOneById(UUID id);

}
