package appliTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import appli.CalculMath;

class CalculMathTest {

	CalculMath c = new CalculMath();
	
	@Test
	void testFacPositif() {
		int calcul = 5*4*3*2*1;
		assertEquals(calcul, c.fac(5));
		
	}
	
	@Test
	void testFacNull() {
		assertEquals(1, c.fac(0));
	}

}
