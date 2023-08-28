package com.springsecurity.repositories;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.springsecurity.brewery.domain.BeerOrderLine;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {

}
