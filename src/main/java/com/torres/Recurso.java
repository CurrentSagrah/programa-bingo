package com.torres;

import java.util.Map;
import java.util.HashMap;

public class Recurso {

private String id;
private String titulo;
private TipoRecurso tipo;
private boolean disponible;

private Map<String, String> detalles;

public Recurso(String id, String titulo, TipoRecurso tipo) {
    this.id = id;
    this.titulo = titulo;
    this.tipo = tipo;
    this.disponible = true;
    this.detalles = new HashMap<>();
}

public void agregarDetalle(String clave, String valor) {
    detalles.put(clave, valor);
}

public void mostrarFichaTecnica() {

    System.out.println("---------------");
    System.out.println("ID: " + id);
    System.out.println("Titulo: " + titulo);
    System.out.println("Tipo: " + tipo);
    System.out.println("Disponible: " + disponible);

    detalles.forEach((clave, valor) -> {
        System.out.println(clave + ": " + valor);
    });

    System.out.println("---------------");
}

public String getId() {
    return id;
}

public TipoRecurso getTipo() {
    return tipo;
}

    
}
