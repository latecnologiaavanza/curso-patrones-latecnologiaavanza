package com.lta.solid.test2;

public class Circulo extends Forma{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

}
