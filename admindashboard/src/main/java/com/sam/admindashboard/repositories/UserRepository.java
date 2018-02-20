package com.sam.admindashboard.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sam.admindashboard.models.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long>{
	public User findByEmail(String email);
}

