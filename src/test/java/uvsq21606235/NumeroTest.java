package uvsq21606235;

import static org.junit.Assert.*;

import org.junit.Before;


import org.junit.Test;

public class NumeroTest {

	Numero num;
	
	@Before 
	public void init() {
	num = new Numero(); num.add("Fixe", 33, 123456);
	}
	
	@Test
	public void testAdd() {
		assertTrue(num.getNumero() < 1000000 && num.getNumero() > 99999);
	}

}