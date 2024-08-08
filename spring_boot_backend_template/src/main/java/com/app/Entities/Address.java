package com.app.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aid;
	
	@Column(name = "current_address" ,length = 50 , nullable = false)
	private String currentAddress;
	@Column(length = 20 , nullable = false)
	private String city;
	@Column(length = 20 , nullable = false)
	private String street;
	@Column(length = 50 , nullable = false)
	private String state;
	@Column(name = "pin_code" ,nullable = false)
	@Length(min = 6,max = 6)
	private String pinCode;
	
	
}
