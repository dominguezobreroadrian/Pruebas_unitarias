package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraBasicaTest {
	CalculadoraBasica calculadora;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup(-> beforeEach) antes de cada @Test");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Prueba de suma de la calculadora")
	void testSuma() {
		int resultadoEsperado = 3;
		int resultado = CalculadoraBasica.sumar(1, 2);
		
		assertEquals(resultadoEsperado, resultado, "La suma no es correcta");
	}
	
	@Test
	@DisplayName("Prueba de resta de la calculadora")
	void testResta() {
		int resultadoEsperado = 8;
		int resultado = CalculadoraBasica.restar(10, 2);
		
		assertEquals(resultadoEsperado, resultado, "La resta no es correcta");
	}
	
	@Test
	@DisplayName("Prueba de multiplicar de la calculadora")
	void testMultiplicar() {
		int resultadoEsperado = 100;
		int resultado = CalculadoraBasica.multiplicar(10, 10);
		
		assertEquals(resultadoEsperado, resultado, "La multiplicacion no es correcta");
	}
	
	@Test
	@DisplayName("Prueba de dividir de la calculadora")
	void testDividir() {
		int resultadoEsperado = 67;
		int resultado = CalculadoraBasica.dividir(670, 10);
		
		assertEquals(resultadoEsperado, resultado, "La división no es correcta");
	}
}