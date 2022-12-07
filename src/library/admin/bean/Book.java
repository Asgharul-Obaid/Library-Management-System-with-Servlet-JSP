package library.admin.bean;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;

@Valid
public class Book {
	
	@Positive
	private int id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String author;
	
	@Positive
	private int price;
	
	@Positive
	private int status;
	
	public Book(int id, String name, String author, int price,int status) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.status= status;
		
	}
	public Book(String name, String author, int price ) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	//	this.status= status;
	}
	public Book() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", status=" + status
				+ "]";
	}

}
