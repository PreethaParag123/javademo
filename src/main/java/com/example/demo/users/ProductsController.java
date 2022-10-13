package com.example.demo.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {
	@Autowired
	private ProductsService productsservice ;
	@GetMapping("/list")
	public Iterable<Products> Listproducts()
	{
		return productsservice.ListProducts();
	}
	
	/*}@GetMapping("/search")
	public List<Users> findUserByName(@RequestParam("name") String name)
	{
		return userservice.findUserByName(name);
	}
	@GetMap
	ping("/add")
	public Users addUsers(@RequestParam("name") String name, @RequestParam("email") String email)
	{
		
		return userservice.addUsers(name,email);
	}*/

}
