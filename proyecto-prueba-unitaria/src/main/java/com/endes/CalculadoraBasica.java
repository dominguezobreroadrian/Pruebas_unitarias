package com.endes;

public class CalculadoraBasica {
	public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        // Versión sencilla: asumimos que b != 0
        return a / b;
    }
}
