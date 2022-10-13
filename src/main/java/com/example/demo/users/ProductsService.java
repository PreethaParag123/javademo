package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	public Iterable<Products> ListProducts() {
		return productsRepository.findAll();
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
