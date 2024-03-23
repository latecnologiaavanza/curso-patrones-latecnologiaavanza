package com.lta.solid.test5;

public class Notificador {

    private Mensaje mensaje;

    public Notificador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public void enviarMensaje(){
        mensaje.enviar();
    }
}
