package com.example.demo.products;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service

public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;
	@Autowired
	JdbcTemplate jdbcTemplate;
	public Iterable<Products> ListProducts() {
		return productsRepository.findAll();
	}

	public Optional<Products> findById(Integer id) {
		return productsRepository.findById(id);
	}
	
	public List<Products> searchByName( String abc)
	{
		return productsRepository.searchByName(abc);
		
	}
	public List<Map<String,Object>> searchByPrice(int price)
	{
		return jdbcTemplate.queryForList("select * from products where price < " +price);
	}
	/*
	 * public List<Users> findUserByName(String name) { return
	 * userRepository.findByName(name); } public List<Users> findByAddress(int
	 * user_id , String address) { return
	 * userRepository.findByAddress(user_id,address); } public Products
	 * addproducts(Integer id ,String name,Integer price) { Users user = new
	 * Users(); user.setName(name); user.setEmail(email); return
	 * userRepository.save(user);
	 * 
	 * }
	 */

}
