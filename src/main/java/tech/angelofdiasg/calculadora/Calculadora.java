package tech.angelofdiasg.calculadora;

public class Calculadora {

    public int adicao(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir número por 0");
        }
        return (double) a / b;
    }

    public int fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Não é possível calcular fatorial de número negativo");
        }
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public double potencia(int base, int expoente) {
        return Math.pow(base, expoente);
    }
}
