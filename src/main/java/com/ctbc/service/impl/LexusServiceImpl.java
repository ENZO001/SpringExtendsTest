package com.ctbc.service.impl;

import org.springframework.stereotype.Service;

@Service("lexusServiceImpl")
public class LexusServiceImpl extends ToyotaServiceImpl {

	@Override
	public String getCarLabel() {
		return "Here is Lexus";
	}
	
}
