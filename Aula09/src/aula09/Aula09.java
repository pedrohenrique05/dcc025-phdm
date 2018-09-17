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
        System.out.println();
        
        System.out.println("cachorro a baixo");
        Cachorro cachorro = new Cachorro();
        
        
        cachorro.setNome("Fred");
        cachorro.setIdade(5);
        cachorro.setRaca("Vira lata");
        cachorro.setEspecie("Canis Lupus");
        cachorro.getNome();
        cachorro.getIdade();
        cachorro.getRaca();
        cachorro.getEspecie();
        cachorro.emiteSom();
        cachorro.come();
        cachorro.dorme();
        
        System.out.println();
        System.out.println("Gato a baixo");
        Gato gato = new Gato();
        
        gato.setNome("Tom");
        gato.setIdade(9);
        gato.setRaca("Vira lata");
        gato.setEspecie("Felis silvestris catus");
        gato.getEspecie();
        gato.getIdade();
        gato.getNome();
        gato.getRaca();
        gato.emiteSom();
        gato.come();
        gato.dorme();
        
    }
    
}
