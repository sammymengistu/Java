package com.sam.belt.repositories;

import java.util.List;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sam.belt.models.Subs;

@Repository
public interface SubsRepository extends CrudRepository<Subs, Long>{
	List<Subs> findAll();

//	Pack updateStatus(String pack);
}
