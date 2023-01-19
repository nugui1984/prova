/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.provagitt;

public class ex1 {

    public static void main(String[] args) {
     //la i recorre de arriba a abajo y la j recorre de izquierda a derecha primero ponemos la i y después la j. 1 profundidad y 2 filas.
        int[][] notesalumnes = new int[2][4];
        //int[] notaspepe = new int [4];
        //int[] notasmaria = new int [4];
        //el 0 es Pepe y 1 es maria--> la i siempre va delante de la j
        notesalumnes[0][0] = 6;
        notesalumnes[0][1] = 8;
        notesalumnes[0][2] = 8;
        notesalumnes[0][3] = 4;
        notesalumnes[1][0] = 4;
        notesalumnes[1][1] = 3;
        notesalumnes[1][2] = 4;
        notesalumnes[1][3] = 5;

        for (int i = 0; i < notesalumnes.length; i++) {
            System.out.print("Les notes de [" + i + "] són:\n");
            for (int j = 0; j < notesalumnes[i].length; j++) {

                if (j < notesalumnes[i].length - 1) {
                    System.out.print("M" + (j + 1) + "=" + notesalumnes[i][j] + ", ");
                } else {
                    System.out.print("M" + (j + 1) + "=" + notesalumnes[i][j] + "\n");
                }
            }

        }
        System.out.print("Ara farem canvis en aquest arxiu");

    }
    
}
