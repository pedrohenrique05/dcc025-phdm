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
public class CachorroRobo extends Canino implements Contrato{
    
    @Override
    public void tipo(){
        System.out.println("Sou um Cachorro");
    }
    @Override
    public void comer(String alimento){
        super.comer(alimento);
    }
    
    public void comer(String alimento, int qtd){
        super.comer(alimento,qtd);
    }
    
    @Override
    public void limpaPoeira() {
        System.out.println("Estou limpando a poeira");
    }
    
}
