/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author pedro
 * 
 */
public abstract class Pokemon {
    protected String nome;
    private int nivel, hp, ataque, defesa;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public void setDefesa(int defesa){
        this.defesa = defesa;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public abstract void emiteSom();
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
 public abstract boolean equals(Object obj);
 public abstract String toString();
 
}
