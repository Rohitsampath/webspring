package com.mvc.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class ISeasonImpl implements ISeason{

	@Override
	public String findSeason() {
		
		LocalDate date=LocalDate.of(2024, 11, 10);
		
		int month=date.getMonthValue();
		
		if(month>=3 && month<=6) {
			return "summer";
		}else if(month>=7 && month<=9) {
			return "rainy";
		}else {
			return "winter";
		}
		
		
		
	}

}
