package com.torres;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random; 
*/
import java.util.Scanner;

/*
Estudiante: Anthony Torres
Materia: Programacion II
Fecha: 13-05-2026
*/

public class Main {
    public static void main(String[] args) {

        String[][] bingo;
        bingo = new String[5][5];

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo.length; j++) {
                int aux = (int) (Math.random() * 100);
                bingo[i][j] = String.valueOf(aux);

            }
        }


        for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo.length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }

            System.out.println();
        }

        while (true) {
            System.out.println("Ingrese fila: ");
            int fila = sc.nextInt();

            System.out.println("ingrese una columna: ");
            int columna = sc.nextInt();

            bingo[fila][columna] = "x";

            for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo.length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }

            System.out.println();
        }
            
            
        }

        

    
    }
}