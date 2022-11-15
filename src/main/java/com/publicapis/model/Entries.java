package com.publicapis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Entries {
	/*
	 	Entity which will persist in the H2 DataBase
	*/
	
	@Id
	private Integer id;
	
	private String title;
	
	private String description;
	
	private String category;
	
}
