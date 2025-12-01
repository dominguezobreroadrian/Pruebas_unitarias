package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NifNieValidatorTest {
	NifNieValidator validarNif, validarNie, validarNifNie;
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
	@DisplayName("Test validar NIF")
	void testValidarNIF() {
		boolean resultadoEsperado = true;
		boolean resultado = NifNieValidator.validarNif("29898765");
		
		assertEquals(resultadoEsperado, resultado, "Nif incorrecto");
	}
	
	@Test
	@DisplayName("Test validar NIE")
	void testValidarNIE() {
		boolean resultadoEsperado = true;
		boolean resultado = NifNieValidator.validarNie("29898765");
		
		assertEquals(resultadoEsperado, resultado, "Nie incorrecto");
	}
}
