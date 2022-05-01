package pkg.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	public Integer sub(Integer a, Integer b) {
		return a-b;
	}
	
	public Integer mul(Integer a, Integer b) {
		return a*b;
	}
	
	public Integer div(Integer a, Integer b) {
		return a/b;
	}
}
