package com.example.solid.ocp;

public class Calculadora {
    public double calcular(Operation operation, double a, double b) {
        return operation.apply(a, b);
    }
}
