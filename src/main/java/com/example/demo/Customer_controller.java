package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer_Manager;
import com.example.demo.model.customer_details;

@RestController
@RequestMapping("/customer")

public class Customer_controller {
	@Autowired
	Customer_Manager CM;
	@PostMapping("/customerinfo")
	public String Customer_details(@RequestBody customer_details CI) {
		return CM.addCustomer_details(CI);
	}

}
