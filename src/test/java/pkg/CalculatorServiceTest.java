package pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import pkg.service.CalculatorService;

@RunWith(BlockJUnit4ClassRunner.class)
class CalculatorServiceTest {
	
	private CalculatorService service = new CalculatorService();

	@Test
	void addTest() {
		assertEquals(service.add(2, 6), 8);
	}

	@Test
	void subTest() {
		assertEquals(service.sub(12, 6), 6);
	}
	
	@Test
	void mulTest() {
		assertEquals(service.mul(2, 6), 12);
	}
	
	@Test
	void divTest() {
		assertEquals(service.div(12, 6), 2);
	}
}
