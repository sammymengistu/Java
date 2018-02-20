package com.sam.DojoNinjas.services;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.DojoNinjas.Models.Dojo;
import com.sam.DojoNinjas.Models.Ninja;
import com.sam.DojoNinjas.repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired
	private DojoRepository dojoRepository;
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	// Initializing the repository interface
	
	public ArrayList<Dojo> getAll(){
		return (ArrayList<Dojo>) dojoRepository.findAll();
	}
	// Getting all dojos
	
	public Dojo getOneById(Long id) {
		return dojoRepository.findOne(id);
	}
	// Getting one dojo
	
	public void createDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	// Creating a dojo and saving it to the database
	
	public void updateDojo(Dojo dojo) {
		dojoRepository.save(dojo);
	}
	// Updating a dojo
	
	public void deleteDojo(Long id) {
		dojoRepository.delete(id);
	}
	// Delete a dojo by id
}
