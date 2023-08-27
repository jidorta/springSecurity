package com.springsecurity.brewery.domain;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Customer extends BaseEntity {
		
	public Customer(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, String customerName,
			UUID apiKey, Set<BeerOrder> beerOrders) {
		super(id, version, createdDate, lastModifiedDate);
		this.customerName = customerName;
		this.apiKey = apiKey;
		this.beerOrders = beerOrders;
	}

	private String customerName;
	
	@Column(length = 36, columnDefinition = "varchar")
	private UUID apiKey;
	
	@OneToMany(mappedBy= "customer")
	private Set<BeerOrder> beerOrders;

}
