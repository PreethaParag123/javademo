package com.example.demo.bean;

public class Product {

	private int Prod_id = 1;
	private String Prod_name = "x";
	int Prod_price = 1;

	public int getProd_id() {
		return Prod_id;
	}

	public void setProd_id(int prod_id) {
		Prod_id = prod_id;
	}

	public String getProd_name() {
		return Prod_name;
	}

	public void setProd_name(String prod_name) {
		Prod_name = prod_name;
	}

	public int getProd_price() {
		return Prod_price;
	}

	public void setProd_price(int prod_price) {
		Prod_price = prod_price;
	}

	public Product(int prod_id, String prod_name, int prod_price) {
		super();
		Prod_id = prod_id;
		Prod_name = prod_name;
		Prod_price = prod_price;

	}

	
}
