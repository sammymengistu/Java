package com.sam.admindashboard.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sam.admindashboard.models.Role;
import com.sam.admindashboard.repositories.RoleRepository;

@Service
public class RoleService {
	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository){
		this.roleRepository = roleRepository;
	}
	
	public List<Role> all(){return roleRepository.findAll();}
	public Role findByName(String name){return roleRepository.findByName(name);}
	public void create(Role role){roleRepository.save(role);}
	public void update(Role role){roleRepository.save(role);}
	public void destroy(long id){roleRepository.delete(id);}
}
