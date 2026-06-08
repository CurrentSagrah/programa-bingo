# programa-bingo 2
package com.torres;

import java.util.Scanner;

/*
Estudiante: Anthony Torres
Materia: Programacion II
Fecha: 15-05-2026
*/
public class Main {

    public static void main(String[] args) {

        /*Biblioteca miBiblioteca = new Biblioteca();


        Libro libro1 = new Libro(
                "L001",
                "Cien años de soledad",
                "Gabriel Garcia Marquez",
                471
        );


        Revista revista1 = new Revista(
                "R001",
                "National Geographic",
                "2026",
                "Ciencia"
        );


        Digital digital1 = new Digital(
                "D001",
                "Curso Java PDF",
                "PDF",
                "5MB"
        );


        miBiblioteca.registrarRecurso(libro1);
        miBiblioteca.registrarRecurso(revista1);
        miBiblioteca.registrarRecurso(digital1);

        System.out.println("===== INVENTARIO COMPLETO =====");
        miBiblioteca.mostrarInventario();

        System.out.println("===== SOLO LIBROS =====");
        miBiblioteca.mostrarLibros();
        System.out.println("===== SOLO REVISTAS =====");
        miBiblioteca.mostrarRevistas();


        System.out.println("===== SOLO DIGITALES =====");
        miBiblioteca.mostrarDigitales();

        System.out.println("===== BUSQUEDA POR ID =====");

        Recurso encontrado = miBiblioteca.BuscarPorID("L001");

        if (encontrado != null) {
            encontrado.mostrarFichaTecnica();
        } else {
            System.out.println("Recurso no encontrado");
        } */

        
        Scanner sc = new Scanner(System.in);

        String[][] bingo = new String[6][];

        for (int i = 0; i < bingo.length; i++) {

            int columnas = (int) (Math.random() * 3) + 3;

            bingo[i] = new String[columnas];

            for (int j = 0; j < columnas; j++) {

                int numero;

                do {
                    numero = (int) (Math.random() * 50) + 1;
                } while (existeNumero(bingo, numero));

                bingo[i][j] = String.valueOf(numero);
            }
        }

        imprimir(bingo);

        while (true) {

            System.out.print("\nIngrese un número: ");
            int numeroBuscado = sc.nextInt();

            boolean encontrado = false;

            for (int i = 0; i < bingo.length; i++) {

                for (int j = 0; j < bingo[i].length; j++) {

                    if (bingo[i][j].equals(String.valueOf(numeroBuscado))) {

                        bingo[i][j] = "X";
                        encontrado = true;
                    }
                }
            }

            if (encontrado) {
                System.out.println("Número tachado.");
            } else {
                System.out.println("Número no encontrado.");
            }

            imprimir(bingo);
        }
    }

    public static boolean existeNumero(String[][] bingo, int numero) {

        for (int i = 0; i < bingo.length; i++) {

            if (bingo[i] == null) {
                continue;
            }

            for (int j = 0; j < bingo[i].length; j++) {

                if (bingo[i][j] != null &&
                    bingo[i][j].equals(String.valueOf(numero))) {

                    return true;
                }
            }
        }

        return false;
    }

    public static void imprimir(String[][] bingo) {

        System.out.println();

        for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo[i].length; j++) {

                System.out.print(bingo[i][j] + "\t");
            }

            System.out.println();
        }
        
        
    }
}
