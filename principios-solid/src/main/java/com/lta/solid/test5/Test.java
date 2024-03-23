package com.lta.solid.test5;

public class Test {
    public static void main(String[] args) {

        //Esto facilita la introducción de nuevas implementaciones sin modificar el codigo existente
        Mensaje mensajeCorreo = new CorreoElectronico();
        Mensaje mensajeSMS = new SMS();

        Notificador notificadorCorreo = new Notificador(mensajeCorreo);
        Notificador notificadorSMS = new Notificador(mensajeSMS);

        notificadorCorreo.enviarMensaje();
        notificadorSMS.enviarMensaje();

    }
}
