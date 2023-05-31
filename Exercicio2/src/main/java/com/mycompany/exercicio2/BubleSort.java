/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;



/**
 *
 * @author aluno
 */
public class BubleSort {
    int[] numeros = { 11, 2, 336, 41, 7, 6, 90, 68, 6549, 10 };
     public void bolha() {
        

        boolean houveTroca = true;

        while (houveTroca) {
            houveTroca = false;

            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    houveTroca = true;
                }
            }
        }
        System.out.println("Vetor Ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
     }
}
