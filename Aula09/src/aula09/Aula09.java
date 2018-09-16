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
public class Aula09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal = new Animal();
        animal.come();
        animal.dorme();
        animal.emiteSom();
        
        System.out.println("cachorro a baixo");
        Cachorro cachorro = new Cachorro();
        
        cachorro.come();
        cachorro.setNome("Fred");
        cachorro.setIdade(5);
        cachorro.setRaca("Vira lata");
        cachorro.getNome();
        cachorro.getIdade();
        cachorro.getRaca();
        cachorro.emiteSom();
        
    }
    
}
