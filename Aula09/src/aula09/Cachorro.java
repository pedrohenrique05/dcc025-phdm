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
public class Cachorro extends Canino {
    

    
    @Override
    /**
     * @see metodo da classe pai Animal
     */
    public void emiteSom(){
        super.emiteSom();
        System.out.println("Estou latindo!");
    }
    
    
}
