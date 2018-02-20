package com.sam.DojoNinjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sam.DojoNinjas.Models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long>{

}

