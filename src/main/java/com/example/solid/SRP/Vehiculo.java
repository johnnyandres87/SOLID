package com.example.solid.SRP;

public class Vehiculo {

    private String marca;
    private Integer modelo;

    public Vehiculo(String marca, Integer modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getModelo() {
        return modelo;
    }
}
