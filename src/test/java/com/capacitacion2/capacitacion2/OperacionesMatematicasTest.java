package com.capacitacion2.capacitacion2;

import com.capacitacion.clase6.OperacionesMatematicas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OperacionesMatematicasTest {
	OperacionesMatematicas objMetodo;

	@Before
	public void inicializarPrecondiciones() {
		objMetodo = new OperacionesMatematicas();
	}

	@Test
	public void testSuma() {
		int expected = 8;
		int resultado = objMetodo.suma(3, 5);

		assertEquals(expected, resultado);
	}

	@Test
	public void testResta() {
		int expected = -2;
		int resultado = objMetodo.resta(3, 5);

		assertEquals(expected, resultado);
	}

	@Test
	public void testMultiplicacion() {
		int expected = 15;
		int result = objMetodo.multiplicacion(4, 5);

		assertEquals(expected, result);
	}

	@Test
	public void testDividir() {
		int expected = 5;
		double result = objMetodo.division(10, 2);
		assertEquals(expected, result, 0.1);
	}

}
