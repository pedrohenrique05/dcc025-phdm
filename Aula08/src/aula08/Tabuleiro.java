/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Tabuleiro {
   private int tabuleiro[] = new int[10];
   Tabuleiro(){
       for(int aux = 0 ; aux < 10; aux++){
           this.tabuleiro[aux] = -1;
       }
   }
    /**
     * 
     * @param ind
     * @param val 
     *  seta a pontuação
     */
   public void pontuacao(int [] tb){
       int as = 0, duas = 0, tres = 0 , quadra = 0, quina = 0, sena = 0;
       for(int aux  = 0 ; aux < 5 ; aux++){
           switch(tb[aux]){
               case 1:
                   as++;
                   break;
               case 2:
                   duas++;
                   break;
               case 3:
                   tres++;
                   break;
               case 4:
                   quadra++;
                   break;
               case 5:
                   quina++;
                   break;
               case 6:
                   sena++;
                   break;
           }
    }
           System.out.print("Você possui: AS: DUAS: TRES: QUADRA: QUINA: SENA: repectivamente  ");
           System.out.print(as);
           System.out.print(" ");
           System.out.print(duas);
           System.out.print(" ");
           System.out.print(tres);
           System.out.print(" ");
           System.out.print(quadra);
           System.out.print(" ");
           System.out.print(quina);
           System.out.print(" ");
           System.out.println(sena);
           System.out.println("Deseja marca qual opção(entre 1 a 10)? ");
           int indAux;
           Scanner ind = new Scanner(System.in);
           indAux = ind.nextInt();
           switch(indAux){
               case 1:
                   setPontRodada(1,as*1);
                   break;
               case 2:
                   setPontRodada(2,duas*2);
                   break;
               case 3:
                   setPontRodada(3,tres*3);
                   break;
               case 4:
                   setPontRodada(4,quadra*4);
                   break;
               case 5:
                   setPontRodada(5,quina*5);
                   break;
               case 6:
                   setPontRodada(6,sena*6);
                   break;
               case 7:
                   if((as == 3 && (duas == 2 || tres == 2 || quadra == 2 || quina == 2 || sena ==2)) ||
                     (duas == 3 && (as == 2 || tres == 2 || quadra == 2 || quina == 2 || sena == 2)) ||
                     (tres == 3 && (as == 2 || duas == 2 || quadra == 2 || quina == 2 || sena == 2)) ||
                     (quadra == 3 && (as == 2 || duas == 2 || tres == 2 || quina == 2 || sena == 2)) ||
                     (quina == 3 && (as == 2 || duas == 2 || tres == 2 || quadra == 2 || sena == 2)) ||
                     (sena == 3 & (as == 2 || duas == 2 || tres == 2 || quadra == 2 || quina == 2))){
                       setPontRodada(7,10);
                   }
                   break;
               case 8:
                   if(as == 1 && duas == 1 && tres == 1 && quadra == 1 && quina == 1 ||
                           duas == 1 && tres == 1 && quadra == 1 && quina == 1 && sena ==1){
                       setPontRodada(8,20);
                   }break;
               case 9:
                   if(as == 4 || duas == 4 || tres == 4 || quadra == 4 || quina == 4 || sena == 4){
                       setPontRodada(9,30);
                   }break;
               case 10:
                   if(as == 5 || duas == 5 || tres == 5 || quadra == 5 || quina == 5 || sena == 5){
                       setPontRodada(9,40);
                   }break;
           }
           
   }
    public void setPontRodada(int ind, int val){
        int auxInd = ind;
        
            if(this.tabuleiro[ind] == -1){
                this.tabuleiro[ind] = val;
            }else{
                while(this.tabuleiro[auxInd] != -1){
                    if(auxInd <= 10){
                    if(this.tabuleiro[auxInd] == -1){
                        this.tabuleiro[auxInd] = 0;
                    }
                    auxInd++;
                }
                if(auxInd == 11){
                    auxInd = 1;
                }
                }
                
                
            }
        
    }
    /**
     * 
     * @return retorna a pontuação adquerida
     */
    public int getPontTotal(){
        int pontTotal = 0;
        for(int aux = 0 ; aux < 10 ; aux++){
            pontTotal+= this.tabuleiro[aux];
        }
        return pontTotal;
    }
}
