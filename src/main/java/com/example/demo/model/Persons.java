package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Persons {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@Column
	private String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Persons(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public Persons() {
		super();
	}
	
	
	

}
