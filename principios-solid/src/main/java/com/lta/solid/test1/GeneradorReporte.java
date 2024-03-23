package com.lta.solid.test1;

public class GeneradorReporte {

    public void generarReporte(Empleado empleado) {
        System.out.println("Reporte del empleado:");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Cargo: " + empleado.getCargo());
        System.out.println("Salario: " + empleado.getSalario());
    }

}
