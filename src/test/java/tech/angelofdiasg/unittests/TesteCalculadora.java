package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculadora;
import static org.junit.jupiter.api.Assertions.*;

class TesteCalculadora {

    @Test
    void testeAdicao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(10, calculadora.adicao(6, 4));
        assertEquals(-4, calculadora.adicao(3, -7));
        assertEquals(0, calculadora.adicao(0, 0));
    }

    @Test
    void testeSubtracao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.subtracao(9, 4));
        assertEquals(26, calculadora.subtracao(3, -23));
        assertEquals(-11, calculadora.subtracao(14, 25));
    }

    @Test
    void testeMultiplicacao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(72, calculadora.multiplicacao(9, 8));
        assertEquals(-12, calculadora.multiplicacao(3, -4));
        assertEquals(0, calculadora.multiplicacao(7, 0));
    }

    @Test
    void testeDivisao() {
        Calculadora calculadora = new Calculadora();
        assertEquals(25.0, calculadora.divisao(125, 5), 0.0001);
        assertEquals(4.5, calculadora.divisao(9, 2), 0.0001);
        assertEquals(0.25, calculadora.divisao(3, 12), 0.0001);
    }

    @Test
    void testeDivisaoPorZero() {
        Calculadora calculadora = new Calculadora();
        Exception excecao = assertThrows(ArithmeticException.class, () -> {
            calculadora.divisao(6, 0);
        });
        assertEquals("Não é possível dividir número por 0", excecao.getMessage());
    }

    @Test
    void testeFatorialNumeroPositivo() {
        Calculadora calculadora = new Calculadora();
        assertEquals(24, calculadora.fatorial(4));
        assertEquals(1, calculadora.fatorial(0));
    }

    @Test
    void testeFatorialNumeroNegativo() {
        Calculadora calculadora = new Calculadora();
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.fatorial(-1);
        });
        assertEquals("Não é possível calcular fatorial de número negativo", excecao.getMessage());
    }

    @Test
    void testePotencia() {
        Calculadora calculadora = new Calculadora();
        assertEquals(36.0, calculadora.potencia(6, 2), 0.0001);
        assertEquals(0.25, calculadora.potencia(2, -2), 0.0001);
    }
}

