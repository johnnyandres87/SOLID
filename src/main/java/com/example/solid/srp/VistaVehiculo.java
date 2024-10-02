package com.example.solid.srp;

public class VistaVehiculo {

    private Vehiculo vehiculo;

    public VistaVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void muestra() {
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
    }
}
