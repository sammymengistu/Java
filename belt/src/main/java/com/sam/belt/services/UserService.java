package com.sam.belt.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sam.belt.models.Role;
import com.sam.belt.models.User;
import com.sam.belt.models.Subs;
import com.sam.belt.repositories.RoleRepository;
import com.sam.belt.repositories.UserRepository;
import com.sam.belt.repositories.SubsRepository;




@Transactional
@Service
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private SubsRepository packageRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
//    
    public UserService(UserRepository userRepository, RoleRepository roleRepository,SubsRepository packageRepository, BCryptPasswordEncoder bCryptPasswordEncoder)     {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.packageRepository = packageRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }
    
    
    // 1
    public void saveWithUserRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_USER"));
        userRepository.save(user);
    }
     
     // 2 
    public void saveUserWithAdminRole(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRoles(roleRepository.findByName("ROLE_USER"));
        user.setRoles(roleRepository.findByName("ROLE_ADMIN"));
        userRepository.save(user);
    }    
    
    // 3
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
    public void deleteUser(Long id) {
    		userRepository.delete(id);
    }
    public User findById(Long id) {
        return userRepository.findById(id);
    }
  
    public void saveSelecion(User selection) {
    		userRepository.save(selection);
	}

    
    public List<Subs> findAllPackages(){
    		return packageRepository.findAll();
    }
    
    public void saveNewPackage(Subs pack) {
    		packageRepository.save(pack);
    }
    public Subs findPackById(Long id) {
    		return packageRepository.findOne(id);
    }
    
    public void saveStatus(Subs status) {
    		packageRepository.save(status);
    }


	public void saveUser(User myUser) {
		userRepository.save(myUser);
		
	}


	public void deletePack(Long id) {
		packageRepository.delete(id);
		
	}
   
}