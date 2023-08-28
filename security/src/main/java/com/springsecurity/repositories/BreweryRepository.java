package com.springsecurity.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.brewery.domain.Brewery;

public interface BreweryRepository extends JpaRepository<Brewery, UUID> {

}
