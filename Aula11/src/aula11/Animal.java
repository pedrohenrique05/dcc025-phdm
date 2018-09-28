/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author pedro
 */
public abstract class Animal {
    
    private String alimento;
    private int qtd = -1;
    public abstract void tipo();
    public void comer(String alimento){
        this.alimento = alimento;
        get();
    }
    public void comer (String alimento, int qtd){
        this.alimento = alimento;
        this.qtd = qtd;
        get();
    }
    
    public void get(){
        if(this.qtd == -1){
            System.out.println("O animal está comendo: "+this.alimento);
        }else{
            System.out.println("O animal está comendo: "+this.alimento+", com uma"
                    + " porção de "+this.qtd+" unidade(s)");
        }
    }
}
