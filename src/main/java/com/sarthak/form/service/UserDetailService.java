package com.sarthak.form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarthak.form.entity.UserDetails;
import com.sarthak.form.repository.UserDetailsRepository;

@Service
public class UserDetailService {

	@Autowired
	UserDetailsRepository userDetailRepository;
	
	
	
	public void save(UserDetails userDetail) {
		
		userDetailRepository.save(userDetail);
	}
	
}
