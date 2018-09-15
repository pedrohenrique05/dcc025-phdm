/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Animal {
    
    private int idade;
    private String raca;
    private String nome;
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void getIdade(){
        System.out.println(this.idade);
    }
    
    public void getRaca(){
        System.out.println(this.raca);
    }
    
    public void getNome(){
        System.out.println(this.nome);
    }
    
    public void come(){
        System.out.println("Estou comendo");
    }
    
    public void dorme(){
        System.out.println("Estou dormindo");
    }
    
    public void emiteSom(){
        
        System.out.println("Estou emitindo som");
    }
}
