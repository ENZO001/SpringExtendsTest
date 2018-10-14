package com.ctbc.service.impl;

import org.springframework.stereotype.Service;

import com.ctbc.service.CarService;

@Service
public class ToyotaServiceImpl implements CarService {
	
	@Override
	public String getCarLabel() {
		return "Here is Toyota";
	}

}
