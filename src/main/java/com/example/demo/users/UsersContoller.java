package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UsersContoller {
	@Autowired
	private Userservice userservice ;
	@GetMapping("/list")
	public Iterable<Users> ListUsers()
	{
		return userservice.ListUsers();
	}
	@GetMapping("/search")
	public List<Users> findUserByName(@RequestParam("name") String name)
	{
		return userservice.findUserByName(name);
	}
	@GetMapping("/add")
	public Users addUsers(@RequestParam("name") String name, @RequestParam("email") String email)
	{
		
		return userservice.addUsers(name,email);
	}
	
	

}
