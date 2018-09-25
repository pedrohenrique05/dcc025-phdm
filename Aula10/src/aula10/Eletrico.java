/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Eletrico extends Pokemon {
    protected String nome;
    
    Eletrico(String nome){
        super.setNome(nome);
        this.nome = nome;
    }
    @Override
    public void emiteSom(){
        System.out.println("Pika-Pika");
    }
    
    @Override
    public boolean equals(Object obj){
       if(obj.toString() == this.nome){
           return true;
       }else{
           return false;
       }
    }
    
    @Override
    public String toString(){
        return getNome();
    }
    @Override
    public void setNome(String nome){
        super.setNome(nome);
        this.nome = nome; 
    }
    @Override
    public void setNivel(int nivel){
        
    }
    @Override
    public void setHp(int hp){
        
    }
    @Override
    public void setAtaque(int ataque){
        
    }
    @Override
    public void setDefesa(int defesa){
        
    }
    
}
