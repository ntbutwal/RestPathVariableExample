package com.kkc.untils;

import java.util.HashMap;
import java.util.Map;

import com.kkc.CustomerDto.CustomerDto;

public class InClassDatabaseMemory {

	public static Map<Integer, CustomerDto> customerservice;

	static {
		customerservice = new HashMap<Integer, CustomerDto>();

		CustomerDto cd = new CustomerDto();
		cd.setPolpicyNo(123);
		cd.setName("Kishor Kunwar");
		cd.setPhNo("7032203541");
		cd.setEmail("kishor.kc@gmail.com");
		cd.setInsType("Health");
		customerservice.put(123, cd);

		CustomerDto cd1 = new CustomerDto();
		cd1.setPolpicyNo(456);
		cd1.setName("Jay Joshi");
		cd1.setPhNo("5712203541");
		cd1.setEmail("jay.joshi@gmail.com");
		cd1.setInsType("Auto");
		customerservice.put(456, cd1);

		CustomerDto cd2 = new CustomerDto();
		cd2.setPolpicyNo(789);
		cd2.setName("Roshan Bhai");
		cd2.setPhNo("8002203541");
		cd2.setEmail("roshan.bhai@gmail.com");
		cd2.setInsType("Life");
		customerservice.put(789, cd2);

	}

}
