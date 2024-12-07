package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.repository.Customer_Repo;

@Service
public class Customer_Manager {
	@Autowired
	Customer_Repo CR;
	public String addCustomer_details(customer_details CI) {
		CR.save(CI);
		return "info saved";
	}

}
