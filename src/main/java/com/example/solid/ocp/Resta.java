package com.example.solid.ocp;

public class Resta implements Operation{
    @Override
    public double apply(double a, double b) {
        return a - b;
    }
}
