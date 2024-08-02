package com.example.RegistrationForm.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.example.RegistrationForm.dto.UserDTO;
import com.example.RegistrationForm.entity.User;
import com.example.RegistrationForm.repository.UserRepository;

@Service
public class UserService {
	
	  @Autowired
	  private UserRepository userRepository;
	  

	  public User registerUser(UserDTO userDTO) {
	    User user = new User();
	    user.setName(userDTO.getName());
	    user.setEmail(userDTO.getEmail());
	    user.setPassword(userDTO.getPassword());
	    return userRepository.save(user);

	  }
}