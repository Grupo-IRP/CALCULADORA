package com.edix.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto producto;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto();
	}

	@AfterEach
	void tearDown() throws Exception {
		producto = null;
	}

	@Test
	void testProductoDosEnterosNegativo() {
		assertEquals(-100, producto.productoDosEnteros(-3, 5));
		assertEquals(-100, producto.productoDosEnteros(10, -5));
	}
	
	@Test
	void testProductoDosEnterosLimite() {
		assertEquals(-102, producto.productoDosEnteros(2147483648, 5));
		assertEquals(-102, producto.productoDosEnteros(10, 2147483648));
	}
	
	@Test
	void testProductoDosEnterosMaximo() {
		assertEquals(-103, producto.productoDosEnteros(2147483626, 2));
		
	}
	
	@Test
	void testProductoDosEnterosOk() {
		assertEquals(75, producto.productoDosEnteros(15, 5));
	}

	@Test
	void testProductoDosRealesNegativo() {
		assertEquals(-100, producto.productoDosReales(-3.3, 5.2));
		assertEquals(-100, producto.productoDosReales(10.5, -5.6));
	}


	@Test
	void testProductoDosRealesLimite() {
		assertEquals(-102, producto.productoDosReales(2147483647.2, 5.2));
		assertEquals(-102, producto.productoDosReales(10.5, 2147483647.2));
	}
	
	@Test
	void testProductoDosRealesMaximo() {
		assertEquals(-103, producto.productoDosReales(2147483643.1, 5.2));
	}
	
	@Test
	void testProductoDosRealesOk() {
		assertEquals(205.82, producto.productoDosReales(25.1, 8.2));
		
	}
	
	@Test
	void testProductoTresRealesNegativo() {
		assertEquals(-100, producto.productoTresReales(-3.3, 5.2, 8.6));
		assertEquals(-100, producto.productoTresReales(10.5, -5.6, 8.6));
		assertEquals(-100, producto.productoTresReales(10.5, 5.6, -8.6));
	}
	
	@Test
	void testProductoTresRealesLimite() {
		assertEquals(-102, producto.productoTresReales(2147483647.2, 5.2, 8.6));
		assertEquals(-102, producto.productoTresReales(10.5, 2147483647.2, 8.6));
		assertEquals(-102, producto.productoTresReales(10.5, 5.2, 2147483647.2));
	}
	
	@Test
	void testProductoTresRealesMaximo() {
		assertEquals(-103, producto.productoTresReales(2147483643.1, 5.2, 2.6));
	}
	
	@Test
	void testProductoTresReales() {
		assertEquals(350.625, producto.productoTresReales(25.5, 5.5, 2.5));
	}

	@Test
	void testPotenciaNegativo() {
		assertEquals(-100, producto.potencia(-3, 5));
		assertEquals(-100, producto.potencia(10, -5));
	}
	
	@Test
	void testPotenciaLimite() {
		assertEquals(-102, producto.potencia(2147483648, 5));
		assertEquals(-102, producto.potencia(10, 2147483648));
	}
	
	@Test
	void testPotenciaMaximo() {
		assertEquals(-103, producto.potencia(2147483643, 5));
	}
	
	@Test
	void testPotenciaOk() {
		assertEquals(64, producto.potencia(8, 2));
	}

}
