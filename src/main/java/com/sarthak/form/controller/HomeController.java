package com.sarthak.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import com.sarthak.form.entity.User;
import com.sarthak.form.service.JwtUtil;
import com.sarthak.form.service.UserService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager autentiAuthenticationManager;
	

	@RequestMapping("")
	public String welcome() {
		
		return "HELLO";
	}
	
	@PostMapping("login")
	public String login(
			@RequestBody User user) {
		
		
	try {	
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());
		
//		System.out.println(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword()) );
//		autentiAuthenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword() ) );
		  
	}catch (Exception e) {
		//throw  Exception("Invalid Username/password");
		return "Invalid Username/password";
	}
	
	return jwtUtil.generateToken(user.getUserName());
	}
	
	 
	@PostMapping("register")
	public User register(@RequestBody User user) {
		
		System.out.println(user);
		return userService.save(user);
		//return "";
	}
	
	
	
	
	
	
}
