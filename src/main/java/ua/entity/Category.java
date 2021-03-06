package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="_category")
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nameOfCategory;
	
	@OneToMany(mappedBy="category")
	private List<Book> book = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameOfCategory() {
		return nameOfCategory;
	}

	public void setNameOfCategory(String nameOfCategory) {
		this.nameOfCategory = nameOfCategory;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}
	
	
}
