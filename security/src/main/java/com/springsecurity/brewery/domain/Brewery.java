package com.springsecurity.brewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Brewery  extends BaseEntity{
	
	
	private String breweryName;

	public Brewery(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate, String breweryName) {
		super(id, version, createdDate, lastModifiedDate);
		this.breweryName = breweryName;
	}

}
