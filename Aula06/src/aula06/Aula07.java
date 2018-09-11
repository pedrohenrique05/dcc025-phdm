/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c1 = new Cachorro("fred","vira lata", 10);
        Cachorro c2 = new Cachorro("bob","vira lata", 8);
        Cachorro c3 = new Cachorro("marley","vira lata", 4);
        
        
        
        //jeito que eu fiz e não deu certo
        
        Cachorro cac[] = new Cachorro[100];
        PetShop loja = new PetShop();
        int cachorro = 0;
        int menu = 0;
        int aux = 1;
        
        while(menu == 0){
            System.out.println(" 1 - para sair");
            Scanner menu1 = new Scanner(System.in);
            menu = menu1.nextInt();
            if(menu != 1){
                System.out.println(" 2 - para adc cachorro, 3 - para vender");
                Scanner aux1 = new Scanner(System.in);
                 aux = aux1.nextInt();
                if(aux == 2){
                    cachorro++;
                    cac[cachorro] = loja.adcCachorro();
                    
                }else if(aux == 3) {
                    cac[cachorro] = loja.vendaCachorro(cac[cachorro]);
                }
            }
        }
        
        System.out.println("PetShop possui: ");
        System.out.println(loja.numCacPet(cac[cachorro]));
    }
    
}
