package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TesteCalculadoraFixtures {


    private Calculadora calculadora;
    private int numeroPositivo;
    private int numeroZero;
    private int numeroNegativo;

    // Configuração que ocorre antes de cada teste
    @BeforeEach
    void configurar() {
        calculadora = new Calculadora();  // Instância da calculadora
        numeroPositivo = 7;
        numeroZero = 0;
        numeroNegativo = -3;
    }

    // Testes de Adição
    @Test
    void testeAdicao() {
        assertEquals(10, calculadora.adicao(6, 4));
        assertEquals(-4, calculadora.adicao(3, -7));
        assertEquals(0, calculadora.adicao(0, 0));
    }

    // Testes de Subtração
    @Test
    void testeSubtracao() {
        assertEquals(5, calculadora.subtracao(9, 4));
        assertEquals(26, calculadora.subtracao(3, -23));
        assertEquals(-11, calculadora.subtracao(14, 25));
    }

    // Testes de Multiplicação
    @Test
    void testeMultiplicacao() {
        assertEquals(72, calculadora.multiplicacao(9, 8));
        assertEquals(-12, calculadora.multiplicacao(3, -4));
        assertEquals(0, calculadora.multiplicacao(7, 0));
    }

    // Testes de Divisão
    @Test
    void testeDivisao() {
        assertEquals(25.0, calculadora.divisao(125, 5), 0.0001);
        assertEquals(4.5, calculadora.divisao(9, 2), 0.0001);
        assertEquals(0.25, calculadora.divisao(3, 12), 0.0001);
    }

    // Teste para Divisão por Zero
    @Test
    void testeDivisaoPorZero() {
        Exception excecao = assertThrows(ArithmeticException.class, () -> {
            calculadora.divisao(6, 0);
        });
        assertEquals("Não é possível dividir número por 0", excecao.getMessage());
    }

    // Testes para Fatorial
    @Test
    void testeFatorialNumeroPositivo() {
        assertEquals(24, calculadora.fatorial(4));
        assertEquals(1, calculadora.fatorial(0));
    }

    @Test
    void testeFatorialNumeroNegativo() {
        Exception excecao = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.fatorial(numeroNegativo);
        });
        assertEquals("Não é possível calcular fatorial de número negativo", excecao.getMessage());
    }

    // Testes para Potência
    @Test
    void testePotencia() {
        assertEquals(36.0, calculadora.potencia(6, 2), 0.0001);
        assertEquals(0.25, calculadora.potencia(2, -2), 0.0001);
    }
}