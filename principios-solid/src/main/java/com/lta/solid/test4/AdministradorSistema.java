package com.lta.solid.test4;

public interface AdministradorSistema {

    void agregarTarea(String descripcion);
    void marcarTareaComoCompletada(int id);
    void eliminarTarea(int id);

}
