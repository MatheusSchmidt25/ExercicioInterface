package com.mycompany.exercicio4;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Funcionario  funcionario = new Funcionario("Matheus", 25000);
        
        System.out.println("Funconario\t" + funcionario.getNome());
        System.out.println("Salário\t\t" + funcionario.getSalario());
    }
}
