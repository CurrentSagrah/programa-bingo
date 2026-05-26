package com.torres;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    
private List<Recurso> inventario;

public Biblioteca() {
    inventario = new ArrayList<>();
}

public void registrarRecurso(Recurso r) {
    inventario.add(r);
    
}

public void mostrarInventario() {

    for (Recurso r : inventario) {
        r.mostrarFichaTecnica();
    }
}


public Recurso BuscarPorID(String id) {
    for (Recurso r : inventario) {
        if (r.getId().equals(id)) {

            return r;
        }
    }
    return null;

}

public void filtrarPorTipo(TipoRecurso tipo) {

    for (Recurso r : inventario) {

        if (r.getTipo() == tipo) {
            r.mostrarFichaTecnica();
        }
    }
}




}
