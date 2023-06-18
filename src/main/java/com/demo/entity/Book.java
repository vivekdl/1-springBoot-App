package com.demo.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

	@jakarta.persistence.Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private Integer bookID;
	
	
	private String bookName;
	
	
	private Double bookPrice;
}
