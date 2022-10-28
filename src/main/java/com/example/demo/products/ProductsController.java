package com.example.demo.products;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/search")
	public Optional<Products> findById(@RequestParam("id") Integer id)
	{
		Optional<Products> product = productsservice.findById(id);
		if(product.isPresent()){
		    Products p = product.get();
		}
		return productsservice.findById(id);
	}
	@GetMapping("/searchbyName")
	public List<Products> searchByName(@RequestParam("name") String name)
	{
		return productsservice.searchByName(name);
	}
	@GetMapping("/searchbyPrice")
	public List<Map<String,Object>> searchByPrice(@RequestParam("price") int price)
	{
		return productsservice.searchByPrice(price);
	}
	

}
