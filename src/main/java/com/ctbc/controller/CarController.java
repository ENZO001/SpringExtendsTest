package com.ctbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ctbc.service.CarService;

@Controller
public class CarController {

	@Autowired
	@Qualifier("lexusServiceImpl")
	private CarService lexusService;

	@RequestMapping(value = "/")
	public String toIndex() {
		System.out.println("this is index function");
		System.out.println("廠牌是: " + lexusService.getCarLabel());
		return "index";
	}

}
