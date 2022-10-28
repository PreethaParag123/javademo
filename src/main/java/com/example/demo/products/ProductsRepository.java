package com.example.demo.products;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ProductsRepository extends CrudRepository<Products, Integer> 
{
	// @Query(value = "select ")
	List<Products>findByName(String name);
	@Query(value = "select p from Products p where p.name like %:name%")
	List<Products> searchByName(@Param("name") String abc);


	//List<Products>findById(int id);

}
