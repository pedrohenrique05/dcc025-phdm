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
public class Jogador {
    Dado dd = new Dado();
    Tabuleiro tb = new Tabuleiro();
    private int jogada = 0;
    private int valDados[] = new int[5];

    public void setValDados(int ver){
        if(ver == 1){
            int qtd,aux = 0;
            System.out.println("digites o quantidade de dados que deseja modificar");
            Scanner qtdMod = new Scanner(System.in);
            qtd = qtdMod.nextInt();
            while(aux < qtd){
                int ind;
                System.out.println("Digite o indice equivalente");
                Scanner indAux = new Scanner(System.in);
                ind = indAux.nextInt();
                valDados[ind] = dd.geraAleatorio();
                aux++;
            }
        }else{
            for(int aux1 = 0 ; aux1 < 5 ; aux1++){
                this.valDados[aux1] = dd.geraAleatorio();
            }
            this.jogada++;
        }
        
    }
    public void getValDados(){
        for(int aux = 0 ; aux < 5 ; aux++){
           System.out.println( (valDados[aux]) );
        }
    }
    public void armazenaPontuacao(){
        tb.pontuacao(valDados);
    }
    
    public int pontFinal(){
        return tb.getPontTotal();
    }
}
