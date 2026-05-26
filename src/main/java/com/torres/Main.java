package com.torres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
Estudiante: Anthony Torres
Materia: Programacion II
Fecha: 13-05-2026
*/

public class Main {
    public static void main(String[] args) {
        

        

Object[][] matriz = {
            {7,  23, 21,  4,  5},
            {22, 3,  15,  2, 10},
            {19, 6,  18,  9, 17},
            {11, 16, 8, 25, "X"},
            {12, 13, 14, 24, 1}
        };

        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to Bingo!\n");
        System.out.println("Player 1 - Drawn Number: 20\n");
        System.out.println("Player 1's Card:");
        imprimirMatriz(matriz);


        while (true) {
            System.out.print("\nIngrese fila (0-4) o -1 para salir: ");
            int fila = sc.nextInt();

            if (fila == -1) {
                break;
            }

            System.out.print("Ingrese columna (0-4): ");
            int columna = sc.nextInt();

            matriz[fila][columna] = "X";

            System.out.println("\nPlayer 1's Card:");
            imprimirMatriz(matriz);
        }

        System.out.println("Juego terminado.");
    }

    static void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------");


        




    
    }
}