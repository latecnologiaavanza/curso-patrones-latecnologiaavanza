package com.lta.solid.test2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Triangulo extends Forma{

    private double base;
    private double altura;


    @Override
    double calcularArea() {
        return (base*altura)/2;
    }
}
