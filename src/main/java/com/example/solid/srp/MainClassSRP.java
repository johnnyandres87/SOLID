package com.example.solid.srp;

public class MainClassSRP {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 2021);
        VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
        vistaVehiculo.muestra();
    }
}
