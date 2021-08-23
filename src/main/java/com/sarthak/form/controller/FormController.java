package com.sarthak.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sarthak.form.entity.Details;
import com.sarthak.form.repository.DetailsRepo;



@RestController
@RequestMapping("/form")
public class FormController {
	
	
	
	@Autowired
	DetailsRepo detailsRepo;
	
	
	@PostMapping("save-details")
	public void saveDetails(
			@RequestBody Details userDetails) {
		
		System.out.println("inside savedetails");
		
		detailsRepo.save(userDetails);
		
		
	}
	
	
	@PostMapping("/test")
	public Details test(
			@RequestBody Details details) {
		return detailsRepo.save(details);
	}

}
