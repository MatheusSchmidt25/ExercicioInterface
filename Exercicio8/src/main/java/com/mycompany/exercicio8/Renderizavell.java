/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio8;

/**
 *
 * @author aluno
 */
public class Renderizavell {
    public void renderizar(int[] data){

        int maxValue = getMaxValue(data);

        for (int i = 0; i < data.length; i++) {
            int barSize = (int) ((data[i] / (double) maxValue) * 50); // Pega o valor atual do array divide pelo maior valor do array e multiplica por 50 e retonar o maior inteiro proximo 

            System.out.print(i + 1 + ": "); // Rótulo do valor

            for (int j = 0; j < barSize; j++) {
                System.out.print("*"); // Símbolo da barra
            }

            System.out.println(" (" + data[i] + ")"); // Valor numérico
        }
    }

    public static int getMaxValue(int[] data) {
        int maxValue = Integer.MIN_VALUE;

        for (int value : data) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }
    }
    

