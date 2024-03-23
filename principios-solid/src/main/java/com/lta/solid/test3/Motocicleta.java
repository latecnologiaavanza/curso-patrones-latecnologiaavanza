package com.lta.solid.test3;

public class Motocicleta extends Vehiculo {

    private String tipo;

    public Motocicleta(int velocidadMaxima, String tipo) {
        super(velocidadMaxima);
        this.tipo = tipo;
    }

    public String obtenerTipo() {
        return tipo;
    }

}
