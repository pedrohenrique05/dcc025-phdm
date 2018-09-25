/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author pedro
 */
public class Inseto extends Pokemon{
    protected String nome;
    Inseto(String nome){
        super.setNome(nome);
        this.nome = nome;
    }
    
    @Override

    public void emiteSom(){
        System.out.println("shishsihsih");
    }
    
        @Override
    public boolean equals(Object obj){
        return false;
    }
    
    
    @Override
    public String toString(){
        return getNome();
    }
    
    public void setNome(String nome){
        
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
