package com.edix.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RestaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRestaDosEnteros1() {
		Resta resta1 = new Resta();
		assertEquals(-100, resta1.restaDosEnteros(-1, 0));
		assertEquals(-100, resta1.restaDosEnteros(0, -1));
		assertEquals(-102, resta1.restaDosEnteros(2147483649, 0));
		assertEquals(5, resta1.restaDosEnteros(6, 1));
		assertEquals(-103, resta1.restaDosEnteros(2147483647, 20));
		// no se puede llegar al límite
	}

	@Test
	void testRestaDosReales() {
		Resta resta2 = new Resta();
		assertEquals(-100, resta2.restaDosReales(-1.1, 0));
		assertEquals(-100, resta2.restaDosReales(0, -1.1));
		assertEquals(-102, resta2.restaDosReales(2147483647.1, 0));
		assertEquals(5.0, resta2.restaDosReales(6.0, 1.0));
	}

	@Test
	void testRestaTresReales() {
		Resta resta3 = new Resta();
		assertEquals(-100, resta3.restaTresReales(-1.1, 0, 5));
		assertEquals(-100, resta3.restaTresReales(0, -1.1, 5));
		assertEquals(-100, resta3.restaTresReales(0, 0, -5.1));
		assertEquals(-102, resta3.restaTresReales(2147483647.1, 0, 0));
		assertEquals(5.0, resta3.restaTresReales(6.0, 1.0, 0));
	}

	@Test
	void testAcumulador() {
		Resta resta4 = new Resta();
		resta4.setAcumulado(-1);
		assertEquals(-1, resta4.getAcumulado());
		resta4.setAcumulado(2147483649);
		assertEquals(-102, resta4.getAcumulado());

	}

}
