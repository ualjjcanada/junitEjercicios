package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion06.Ejercicio1;


class Ejercicio1Test {

	@ParameterizedTest // (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"2, 1",
//				"5, 1",
//				"6, 1",
				"14, 7"})
	
	void testTransformar(int input, int expected) {
		Ejercicio1 c = new Ejercicio1();
		assertEquals(expected, c.transformar(input));
	}

}
