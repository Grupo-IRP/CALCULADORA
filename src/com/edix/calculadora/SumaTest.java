package com.edix.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumaTest {
	
	Suma suma;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		suma = new Suma();
	}

	@AfterEach
	void tearDown() throws Exception {
		suma = null;
	}

	@Test
	void testSumaDosEnterosNegativo() {
		assertEquals(-100, suma.sumaDosEnteros(-3, 5));
		assertEquals(-100, suma.sumaDosEnteros(10, -5));
	}
	
	@Test
	void testSumaDosEnterosLimite() {
		assertEquals(-102, suma.sumaDosEnteros(2147483648, 5));
		assertEquals(-102, suma.sumaDosEnteros(10, 2147483648));
	}
	
	@Test
	void testSumaDosEnterosMaximo() {
		assertEquals(-103, suma.sumaDosEnteros(2147483647, 5));
	}
	
	@Test
	void testSumaDosEnterosOk() {
		assertEquals(15, suma.sumaDosEnteros(10, 5));
	}

	@Test
	void testSumaDosRealesNegativo() {
		assertEquals(-100, suma.sumaDosReales(-3.7, 5.3));
		assertEquals(-100, suma.sumaDosReales(10.4, -5.3));
	}
	
	@Test
	void testSumaDosRealesLimite() {
		assertEquals(-102, suma.sumaDosReales(2147483647.3, 5.3));
		assertEquals(-102, suma.sumaDosReales(10.4, 2147483647.3));
	}
	@Test
	void testSumaDosRealesMaximo() {
		assertEquals(-103, suma.sumaDosReales(2147483646.5, 5.3));
	}
	
	@Test
	void testSumaDosRealesOk() {
		assertEquals(16.2, suma.sumaDosReales(10.4, 5.8));
	}
	
	@Test
	void testSumaTresRealesNegativo() {
		assertEquals(-100, suma.sumaTresReales(-3.7, 5.3, 8.6));
		assertEquals(-100, suma.sumaTresReales(10.4, -5.3, 8.6));
		assertEquals(-100, suma.sumaTresReales(10.4, 5.3, -8.6));
	}
	
	@Test
	void testSumaTresRealesLimite() {
		assertEquals(-102, suma.sumaTresReales(2147483647.3, 5.3, 8.6));
		assertEquals(-102, suma.sumaTresReales(10.4, 2147483647.3, 8.6));
		assertEquals(-102, suma.sumaTresReales(10.4, 5.3, 2147483647.3));
	}
	
	@Test
	void testSumaTresRealesMaximo() {
		assertEquals(-103, suma.sumaTresReales(2147483646.5, 5.3, 8.6));
	}

	@Test
	void testSumaTresRealesOK() {
		assertEquals(36.8, suma.sumaTresReales(10.4, 5.8, 20.6));
	}
	
		
	@Test
	void testAcumuladorLimite() {
		suma.acumulador(2147483648);
		assertEquals(-102, suma.getAcumulado());
	}

	
	@Test
	void testAcumuladorOk() {
		suma.acumulador(15);
		assertEquals(15, suma.getAcumulado());
	}

}
