package com.sam.DriverLicense.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.sam.DriverLicense.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person,Long>{

}