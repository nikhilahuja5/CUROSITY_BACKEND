package com.app.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
 public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uid;
	
	@Column(name = "first_name",length = 40)
	private String firstName;
	
	@Column(name = "last_name",length = 40)
	private String lastName;
	
	@Email
	@Column(length = 40,unique = true)
 	private String email;
	
	@Length(min =10 ,max = 10)
	@Column(unique = true)
	private String phone;
	
	@Length(min = 6)
	@Column(length = 40)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Role role;
	
	private LocalDate DOB;
	
	@JoinColumn(name = "aid")
	@OneToOne
	private Address address;
	
	@JoinColumn(name="account_id")
	@OneToOne
	private Account account;
}