package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Userservice {

@Autowired
private UsersRepository userRepository;
public Iterable<Users> ListUsers()
{
	return userRepository.findAll();
}
public List<Users> findUserByName(String name)
{
	return userRepository.findByName(name);
}

public Users addUsers(String name,String email)
{
	Users user = new Users();
	user.setName(name);
	user.setEmail(email);
	return userRepository.save(user);
	
}

}
