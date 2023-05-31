package com.mycompany.exercicio5;


public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    
    private double bonus = 2000.00;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    
}
