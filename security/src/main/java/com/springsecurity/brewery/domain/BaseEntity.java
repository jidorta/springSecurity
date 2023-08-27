package com.springsecurity.brewery.domain;

import java.sql.Timestamp;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import org.hibernate.usertype.UserType;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity { 
	
	 public BaseEntity(UUID id, Long version, Timestamp createdDate, Timestamp lastModifiedDate) {
	        this.id = id;
	        this.version = version;
	        this.createdDate = createdDate;
	        this.lastModifiedDate = lastModifiedDate;
	
	 }
	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
				name = "UUID"
				
			)
	
			@Column(length = 36, columnDefinition = "varchar",updatable=false, nullable = false)
			private UUID id;
	
	 		@Version
	 		private Long version;
	 		
	 		 @CreationTimestamp
	 	    @Column(updatable = false)
	 	    private Timestamp createdDate;
	 		
	 		@UpdateTimestamp
	 		private Timestamp lastModifiedDate;
	 		
	 		public boolean isNew() {
	 			return this.id == null;
	 		}
	 		
}
