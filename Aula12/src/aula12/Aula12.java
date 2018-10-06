/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Aula12 {

    /**
     * @param valor
     * @param args the command line arguments
     */
    
    public static void erro(String valor){
        try{
            int valorInt;
            valorInt  = Integer.parseInt(valor);
            
        }catch(NumberFormatException e){
           Scanner teste = new Scanner(System.in); 
           erro(teste.next());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teste1 = new Scanner(System.in);
        erro(teste1.next());
        //erro(teste1.next());
    }
    
}
