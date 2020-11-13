package com.divyansh.services;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.divyansh.UserRegistrationDto;
import com.divyansh.models.User;

@Service("userDetailsService")
@Transactional
public interface UserService extends UserDetailsService{
	
	User save(UserRegistrationDto registrationDto);
}
