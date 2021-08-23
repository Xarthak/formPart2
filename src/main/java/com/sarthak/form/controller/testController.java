package com.sarthak.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sarthak.form.entity.User;
import com.sarthak.form.repository.UserRepository;

@RestController
public class testController {

	@Autowired
	UserRepository urepoRepository;
	
	@RequestMapping("/test")
	public User test() {
		long id=1;
		System.out.println(urepoRepository.findByUserName("doge2"));
		System.out.println(urepoRepository.findById(id));
		
		return urepoRepository.findByUserName("doge2");
		//return urepoRepository.findByUserName("doge");
		
	}
}
