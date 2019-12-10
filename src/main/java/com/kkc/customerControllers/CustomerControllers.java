package com.kkc.customerControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kkc.CustomerDto.CustomerDto;
import com.kkc.customerservice.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerControllers {

	CustomerService customerservice;

	@GetMapping(value = "/{no}/details")
	public CustomerDto sendData(@PathVariable (value="no") Integer policyNo) {
		return customerservice.getDataByDto(policyNo);
	}
	
	@GetMapping(value = "/{no}/details/{noo}/dot")
	public CustomerDto sendDataDto(@PathVariable (value="no") Integer policyNo, 
			@PathVariable(value="noo") String name) {
		return customerservice.getDataByDto(policyNo);
		
	}

	public CustomerService getCustomerservice() {
		return customerservice;
	}

	public void setCustomerservice(CustomerService customerservice) {
		this.customerservice = customerservice;
	}

}
