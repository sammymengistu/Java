package com.sam.DojoNinjas.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sam.DojoNinjas.Models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{

}
