package com.example.demo.users;

	import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

	@Repository

	// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
	// CRUD refers Create, Read, Update, Delete

	public interface UsersRepository extends CrudRepository<Users, Integer> {
		//@Query(value = "select ")
		List<Users> findByName(String name);
		//List<Users>findByAddress(int user_id, String name);

	}

