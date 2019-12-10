package com.kkc.customerservice;

import com.kkc.CustomerDto.CustomerDto;
import com.kkc.untils.InClassDatabaseMemory;

public class CustomerService {
	
	public CustomerDto getDataByDto(Integer polpicyNo) {
		return InClassDatabaseMemory.customerservice.get(polpicyNo);
	}
	
	

}
