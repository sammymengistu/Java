package com.sam.auth.validations;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sam.auth.models.User;

@Component
public class UserValidator implements Validator {
	private static final String email_regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private Pattern pattern;
	private Matcher matcher;
    // Need to match email regex
	
	public UserValidator() {
		this.pattern = Pattern.compile(email_regex);
	}
	// Makes the pattern the email regex
	
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    // Specifies that a instance of the User Domain Model 
    // can be validated with this custom validator
    
    public boolean validateEmail(String email) {
		this.matcher = this.pattern.matcher(email);
		return matcher.matches();
	}
	// Checks if the email is an email and returns a boolean
    
    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "Match");
        } else if(!validateEmail(user.getEmail())){
			errors.rejectValue("email","Match");
		}    
    }
}
