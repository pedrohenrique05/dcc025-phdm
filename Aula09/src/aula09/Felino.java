/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author pedro
 * @see filho de Animal e pai de Gato
 */
public class Felino extends Animal{
    private String subEspecie;
    
    @Override
     /**
     * @see chamando o metodo setEspecie da classe pai Animal
     */
    public void setEspecie(String subEspecie){
        this.subEspecie = subEspecie;
        super.setEspecie("Felidae");
    }
    
    @Override
        /**
     * @see chamando o metodo getEspecie da classe pai Animal
     */
    public void getEspecie(){
        super.getEspecie();
        System.out.println("SubEspecie: " + this.subEspecie);
    }
}
