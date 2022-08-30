package br.com.Book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "author")
@Entity(name = "author")
public class Autor {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	public Autor(String nome) {
		this.name = nome;
	}
	
}
