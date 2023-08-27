package com.springsecurity.brewery.domain;

import java.sql.Timestamp;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
public class BeerOrder extends BaseEntity {

	
	 
	public BeerOrder(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, String customerRef,
			Customer customer, Set<BeerOrderLine> beerOrderLine, OrderStatusEnum orderStatus,
			String orderStatusCallbackUrl) {
		super(id, version, createdDate, lastModifiedDate);
		this.customerRef = customerRef;
		this.customer = customer;
		this.beerOrderLine = beerOrderLine;
		this.orderStatus = orderStatus;
		this.orderStatusCallbackUrl = orderStatusCallbackUrl;
	}

	private String customerRef;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "beerOrder", cascade = CascadeType.ALL)
	@Fetch(FetchMode.JOIN)
	private Set<BeerOrderLine> beerOrderLine;
	
	private OrderStatusEnum orderStatus = OrderStatusEnum.NEW;

	private String orderStatusCallbackUrl;

}
