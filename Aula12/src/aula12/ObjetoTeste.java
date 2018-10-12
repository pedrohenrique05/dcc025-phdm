/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author pedro
 */
public class ObjetoTeste {
    private static int ind = 0;
    private int indAux;
    private String nome;
    
    public void setInd(){
        ObjetoTeste.ind++;
        this.indAux = ObjetoTeste.ind;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void getId(){
        System.out.println("Indice: "+this.indAux);
    }
    
    public void getNome(){
        System.out.println("Nome: "+this.nome);
    }
    
    public void recebeObjeto(Object e){
        
    }
}
