package com.lta.example;

public abstract class Scooter {

    protected String modelo;
    protected String color;
    protected int potencia;

    public Scooter(String modelo, String color, int potencia) {
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
    }

    public abstract void mostrarCaracteristicas();
}
