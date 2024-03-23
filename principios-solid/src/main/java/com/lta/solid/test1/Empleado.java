package com.lta.solid.test1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado { //Esta clase debe tener una responsabilidad

    private String nombre;
    private String cargo;
    private double salario;

}
