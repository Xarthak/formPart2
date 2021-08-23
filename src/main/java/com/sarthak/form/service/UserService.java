package com.sarthak.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarthak.form.entity.User;
import com.sarthak.form.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		
		return userRepository.save(user);
	}
	

	public boolean exists(User user) {
		
		return userRepository.existsById(user.getId());
	}
}
