package com.model;

import javax.persistence.Id;

import lombok.Data;

@Data
public class Cliente {
	
	@Id
	private Long id;
	
	private String nome;
	
	
	
	

}
