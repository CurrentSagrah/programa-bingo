package com.torres;
public class Prueba {

    //1 bloque estatico
    static {
        System.out.println("1. Bloque estático");
    }

    //2 bloque de instancia
    {
        System.out.println("2. bloque de instancia");
    }

    //constructor
    public Prueba() {
        System.out.println("3. Constructor");
    }
    


}
