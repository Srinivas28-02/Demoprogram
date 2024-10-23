package com.nit.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	@Size(max = 50)
	@Column(length = 50)
	private String name;

	@NotEmpty
	@Size(max = 50)
	@Column(length = 100)
	private String address;

	@Positive
	@Max(20000)
	private Double salary;
	@NotEmpty
	@Email
	private String email;

	public Employee(String name, String address, Double salary, String email) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.email = email;
	}

}
