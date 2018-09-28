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
public class Gato extends Felino {
    @Override
    public void tipo(){
        System.out.println("Sou um Gato");
    }
    @Override
    public void comer(String alimento){
        super.comer(alimento);
    }
    
    /**
     *
     * @param alimento
     * @param qtd
     */
    @Override
    public void comer(String alimento, int qtd){
        super.comer(alimento,qtd);
    }
}
