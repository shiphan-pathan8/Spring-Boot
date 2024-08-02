package com.example.RegistrationForm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegistrationForm.dto.UserDTO;
import com.example.RegistrationForm.entity.User;
import com.example.RegistrationForm.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	  @Autowired
	  private UserService userService;

	  @PostMapping("/register")
	  public User registerUser(@RequestBody UserDTO userDTO) {
	    return userService.registerUser(userDTO);

	  }
}