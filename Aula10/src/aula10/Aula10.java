/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Pokemon> pok = new ArrayList();
        pok.add(new Eletrico("Pika"));
        pok.add(new Dragao("ksabhuv"));
        pok.add(new Inseto("jhvdchv"));
        
        Eletrico ele1 = new Eletrico("Pika");
        //ele1.setNome("Pika");
        Eletrico ele2 = new Eletrico("Pika");
        //ele2.setNome("Pika");
        
        System.out.println(ele1.equals(ele2));
        
        for(int i = 0; i < pok.size();i++){
            pok.get(i).emiteSom();
            System.out.println(pok.get(i).toString());
        }
        // TODO code application logic here
    }
    
}
