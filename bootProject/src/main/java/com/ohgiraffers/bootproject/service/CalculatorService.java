package com.ohgiraffers.bootproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.ohgiraffers.bootproject.dto.CalculatorDTO;

@Service
public class CalculatorService {

	public int plus(CalculatorDTO calculatorDTO) {
		return calculatorDTO.getNum1() + calculatorDTO.getNum2();
	}
}
