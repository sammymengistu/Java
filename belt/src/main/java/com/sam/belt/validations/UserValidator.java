package com.sam.belt.validations;

import org.springframework.stereotype.Component;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sam.belt.models.User;

@Component
public class UserValidator implements Validator {
    
    
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    
    
    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            
            errors.rejectValue("passwordConfirmation", "Match");
        }         
    }
}
