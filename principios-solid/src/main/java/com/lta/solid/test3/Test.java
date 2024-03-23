package com.lta.solid.test3;

public class Test {
    public static void main(String[] args){
        Vehiculo vehiculo1 = new Automovil(200,4);
        Vehiculo vehiculo2 = new Motocicleta(150,"Deportiva");

        mostrarDetallesVehiculo(vehiculo1);
        mostrarDetallesVehiculo(vehiculo2);
    }

    public static void mostrarDetallesVehiculo(Vehiculo vehiculo) { //Padre
        System.out.println("Velocidad máxima: " + vehiculo.obtenerVelocidadMaxima());

        if (vehiculo instanceof Automovil) {
            Automovil automovil = (Automovil) vehiculo;
            System.out.println("Número de puertas: " + automovil.obtenerNumeroPuertas());
        } else if (vehiculo instanceof Motocicleta) {
            Motocicleta motocicleta = (Motocicleta) vehiculo;
            System.out.println("Tipo de motocicleta: " + motocicleta.obtenerTipo());
        }
    }
}
