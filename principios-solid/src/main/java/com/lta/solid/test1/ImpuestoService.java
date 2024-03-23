package com.lta.solid.test1;

public class ImpuestoService {
    public void calcularImpuestos(Empleado empleado) {
        double impuestos = empleado.getSalario() * 0.1;
        System.out.println("Los impuestos a pagar son: " + impuestos);
    }

}
