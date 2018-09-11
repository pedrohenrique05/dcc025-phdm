/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Random;
/**
 *
 * @author pedro
 */
/**
 * 
 *  foi iniciado a classe Dado
 */
public class Dado {
    int faceDado[] = new int[5];
    //private int valFace;
    /**
     * @return gera um numero aleatorio e o retorna
     */
    /*public int [] geraAleatorio(){
        for(int aux = 0 ; aux < 5 ; aux++){
            Random num = new Random();
            this.faceDado[aux] = num.nextInt(5)+1;
        }
        
        return faceDado;
    }*/
    
       public int geraAleatorio(){
        
            Random num = new Random();
            return num.nextInt(5)+1;
       }

    
    
}
