package pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pkg.service.CalculatorService;

@SpringBootApplication(scanBasePackages = {"pkg.service"})
@RestController(value = "cal")
public class CalculatorApplication {
	
	@Autowired
	private CalculatorService service;

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
	
	@PostMapping(value = "/add")
	public Integer addition(@RequestParam Integer a, @RequestParam Integer b) {
		return service.add(a, b);
	}
	
	@PostMapping(value = "/sub")
	public Integer subtraction(Integer a, Integer b) {
		return service.add(a, b);
	}
	
	@PostMapping(value = "/mul")
	public Integer multiplication(Integer a, Integer b) {
		return service.mul(a, b);
	}
	
	@PostMapping(value = "/div")
	public Integer division(Integer a, Integer b) {
		return service.div(a, b);
	}

}
