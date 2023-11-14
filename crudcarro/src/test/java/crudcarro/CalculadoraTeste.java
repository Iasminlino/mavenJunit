package crudcarro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
	private Calculadora calculadora = new Calculadora();

    @Test
    public void testSubtraInteiros() {
        assertEquals(3, calculadora.subtraInteiros(10, 7));
    }

    @Test
    public void testMultiplicaInteiros() {
        assertEquals(12, calculadora.multiplicaInteiros(3, 4));
    }

    @Test
    public void testDividNumer() {
        assertEquals(5, calculadora.dividNumer(10, 2));
    }

    @Test
    public void testDividiNumerPorZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividNumer(5, 0);
        });
    }

	@Test
	void doisSomaDoisEsperaQuatro() {
		assertEquals(4, calculadora.SomaInteiros(2, 2));
	}
	
	@Test
	void tresSomaSeteEsperaDez() {
		assertTrue(calculadora.SomaInteiros(3, 7)==10);
		
	}

}
