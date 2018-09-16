/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author pedro
 */
public class Gato extends Felino {
    
    @Override
    /**
     * @see metodo da classe pai Animal
     */
    public void emiteSom(){
        super.emiteSom();
        System.out.println("Estou miando");
    }
    
}
