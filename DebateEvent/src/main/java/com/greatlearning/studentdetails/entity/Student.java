package com.greatlearning.studentdetails.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Table(name ="student")
@Data
public class Student {

	@Id
	@Column(name ="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name ="firstName")
	private String firstName;
	@Column(name ="lastName")
	@NotBlank(message = "Last Name cannot be empty")
	private String lastName;
	@Column(name ="country")
	private String country;
	@Column(name ="course")
	private String course;
	
}
