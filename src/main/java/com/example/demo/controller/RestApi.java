package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.bean.Product;

@RestController

public class RestApi
{
	 @GetMapping("/a/b")
	public List<Employee> example()
	{
		 List<Employee> e = new ArrayList<>();
		 e.add(new Employee("a", "b"));
		 e.add(new Employee("c", "d"));
		 return e;
	}
	 @GetMapping("/product")
	 public List<Product> product()
	 {
		 List<Product> p = new ArrayList<>();
		 p.add(new Product(12,"qwsqw",34));
		 return p;
	 }
	
}