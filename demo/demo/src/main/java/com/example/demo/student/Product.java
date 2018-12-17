package com.example.demo.student;

//import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Table(name = "seller")
public class Product {
	@Id
@GeneratedValue
	private Long id;
 @Column(name = "name")

	private String name;
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	@Column(name = "type")
		private String type;
	 @Column(name = "subtype")
		private String subtype;
	
	 @Column(name = "price")
	private int price;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSubtype() {
		return subtype;
	}
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}
	
}