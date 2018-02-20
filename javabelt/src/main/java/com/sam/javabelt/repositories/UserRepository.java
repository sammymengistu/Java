package com.sam.javabelt.repositories;

import org.springframework.data.repository.CrudRepository;


import java.util.List;


import org.springframework.stereotype.Repository;

import com.sam.javabelt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
	List<User> findAll();
	 User findById(Long id);
}

