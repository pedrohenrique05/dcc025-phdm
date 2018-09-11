/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;
import java.util.Scanner;
//import java.util.Random;
/**
 *
 * @author pedro
 */
public class Navio {
    String nomeNavio;
    int posNavio[] = new int[100];
    
    void setNomeNavio(){
        System.out.println("Digite o nome do navio: ");
        Scanner nomeNav = new Scanner(System.in);
        nomeNavio = nomeNav.next();
    }
    void setPosNavio(){
        int pos;
        System.out.println("Digite a primeira posição do navio (de 0 a 99) ");
        Scanner posicao = new Scanner(System.in);
        pos = posicao.nextInt();
        for(int i = 0; i < 99; i++){
            posNavio[i] = 0;
        }
        for(int i = 0 ; i < 3 ; i++){
            if(pos == 99){
                posNavio[pos] = 1;
                pos = 0;
            }else{
                posNavio[pos] = 1;
                pos++;
            }
        }
    }
    void getImpPosNavio(){
        System.out.println("A posição do navio é: ");
        for(int i = 0 ; i < 100 ; i++)
        {
            System.out.print(posNavio[i]);
        }
        System.out.println();
    }
    
    void getNomeNavio(){
        System.out.println("O nome do navio é: ");
        System.out.println(nomeNavio);
    }
    
    boolean  getPosNavio(int j){
        boolean comp = false;
        for(int i = 0; i < 100 ; i++)
        {
            if(posNavio[i] == j)
            {
                comp = true;
            }else{
                comp = false;
            }
        }
        return comp;
    }
            
            
}
