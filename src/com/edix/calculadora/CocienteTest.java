package com.edix.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocienteTest {
	Cociente cociente;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cociente = new Cociente();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCocienteDosEnterosNegativo() {
		String resultadoEsperado="-100";
		String resultado = cociente.cocienteDosEnteros(4, -2);
		String resultado1 = cociente.cocienteDosEnteros(-2, 4);
		assertEquals(resultadoEsperado, resultado);
		assertEquals(resultadoEsperado, resultado1);
		
	}
	@Test
	void testCocienteDosEnterosCero() {
		String resultadoEsperado="-101";
		String resultado = cociente.cocienteDosEnteros(4, 0);
		String resultado1 = cociente.cocienteDosEnteros(0, 4);
		assertEquals(resultadoEsperado, resultado);
		assertEquals(resultadoEsperado, resultado1);
		
	}
	@Test
	void testCocienteDosEnterosLimite() {
		String resultadoEsperado="-102";
		String resultado = cociente.cocienteDosEnteros(2147483648, 2);
		String resultado1 = cociente.cocienteDosEnteros(2, 2147483648);
		assertEquals(resultadoEsperado, resultado);
		assertEquals(resultadoEsperado, resultado1);
		
	}
	@Test
	void testCocienteDosEnterosExacto() {
		String resultadoEsperado="Cociente = 2";
		String resultado = cociente.cocienteDosEnteros(4, 2);
		assertEquals(resultadoEsperado, resultado);
		
	}
	@Test
	void testCocienteDosEnterosResto() {
		String resultadoEsperado= "Cociente = 1 Resto = 1";
		String resultado = cociente.cocienteDosEnteros(3, 2);
		assertEquals(resultadoEsperado, resultado);
			
	}
	@Test
	void testCocienteDosRealesNegativo() {
		String resultadoEsperado="-100";
		String resultado = cociente.cocienteDosReales(4, -2.1);
		String resultado1 = cociente.cocienteDosReales(-2.1, 4);
		assertEquals(resultadoEsperado, resultado);
		assertEquals(resultadoEsperado, resultado1);
		
	}
	@Test
	void testCocienteDosRealesCero() {
		String resultadoEsperado="-101";
		String resultado = cociente.cocienteDosReales(4.2, 0);
		String resultado1 = cociente.cocienteDosReales(0, 4.2);
		assertEquals(resultadoEsperado, resultado);
		assertEquals(resultadoEsperado, resultado1);
		
	}
	@Test
	void testCocienteDosRealesLimite() {
		String resultadoEsperado="-102";
		String resultado = cociente.cocienteDosReales(214748364.E9, 2);
		String resultado1 = cociente.cocienteDosReales(2, 214748364.E9);
		assertEquals(resultadoEsperado, resultado);
		assertEquals(resultadoEsperado, resultado1);
		
	}
	@Test
	void testCocienteDosRealesExacto() {
		String resultadoEsperado="Cociente = 2.0";
		String resultado = cociente.cocienteDosReales(4.0, 2.0);
	
		assertEquals(resultadoEsperado, resultado);
				
	}
	@Test
	void testCocienteDosRealesResto() {
		String resultadoEsperado= "Cociente = 1.5 Resto = 1.0";
		String resultado = cociente.cocienteDosReales(3.0, 2.0);
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	void testCocienteInversoNegativo() {
		Double resultadoEsperado = -100.0;
		Double resultado = cociente.inverso(-3);
		
		assertEquals(resultadoEsperado, resultado);
			
	}
	@Test
	void testCocienInversoCero() {
		Double resultadoEsperado = -101.0;
		Double resultado = cociente.inverso(0);
		assertEquals(resultadoEsperado, resultado);
		
	}
	@Test
	void testCocienteInversoLimite() {
		Double resultadoEsperado = -102.0;
		Double resultado = cociente.inverso(214748364.E9);
		assertEquals(resultadoEsperado, resultado);
		
	}
	@Test
	void testCocienteInversoExacto() {
		Double resultadoEsperado = 0.25;
		Double resultado = cociente.inverso(4);	
		assertEquals(resultadoEsperado, resultado);
				
	}
	
	@Test
	void testCocienteRaizNegativo() {
		Double resultadoEsperado= -100.0;
		Double resultado = cociente.raiz(-3);
		
		assertEquals(resultadoEsperado, resultado);
			
	}
	@Test
	void testCocienRaizCero() {
		Double resultadoEsperado = -101.0;
		Double resultado = cociente.raiz(0);
		assertEquals(resultadoEsperado, resultado);
		
	}
	@Test
	void testCocienteRaizLimite() {
		Double resultadoEsperado = -102.0;
		Double resultado = cociente.raiz((int) 2147483648);
		assertEquals(resultadoEsperado, resultado);
		
	}
	@Test
	void testCocienteRaizExacto() {
		Double resultadoEsperado = 2.0;
		Double resultado = cociente.raiz(4);	
		assertEquals(resultadoEsperado, resultado);
				
	}
	
	

}
