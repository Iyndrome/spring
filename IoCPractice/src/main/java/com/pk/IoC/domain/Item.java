package com.pk.IoC.domain;

import org.springframework.stereotype.Component;

@Component
public class Item {
	private String code;
	private String name;
	private String price;
	
	public Item() {		
		super();		
	}
	public Item(String code, String name, String price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [code=" + code + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
