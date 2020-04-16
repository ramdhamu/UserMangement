package com.example.user.UserManagerment.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.UserManagerment.dao.UserRepository;
import com.example.user.UserManagerment.entity.User;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		
		return (List<User>) userRepository.findAll();
		
	}
	
	 @PostMapping("/users")
	    public User createUser(@Valid @RequestBody User user) {
	        return userRepository.save(user);
	    }

}
