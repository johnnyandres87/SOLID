package com.example.solid.ocp;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Suma suma = new Suma();

        System.out.println("El valor de la suma de 2+3 es: " + calculadora.calcular(suma, 2, 3));
    }
}
