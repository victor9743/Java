package br.com.Book.model;


import javax.persistence.*;

@Table(name = "book")
@Entity(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Autor author;
	
	public Book(String name, Autor author) {
		this.name = name;
		this.author = author;
	}
}
