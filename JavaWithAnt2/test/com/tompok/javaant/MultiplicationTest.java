package com.tompok.javaant;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void testResult() {
		Multiplication first = new Multiplication(3, 2);
		assertEquals("6", 6, first.result());
	}

}
