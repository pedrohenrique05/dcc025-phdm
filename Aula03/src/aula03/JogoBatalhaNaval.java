/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author pedro
 */
public class JogoBatalhaNaval {
    
    Jogador jg1 = new Jogador();
    Jogador jg2 = new Jogador();
    int jg1certo = 0 ,jg2certo = 0;
    void iniciaJogador(){
        jg1.setNome();
        jg1.setPosNavioJogador();
        
        jg2.setNome();
        jg2.setPosNavioJogador();
    }
    void iniciaJogadas(){
        jg1.getImpPosNav();
        jg2.getImpPosNav();
        while(jg1certo != 3 && jg2certo != 3)
        {
           int pal1, pal2;
           /*System.out.println("teste 01: ");
           System.out.println(jg1certo);*/
           System.out.println("Palpite jg1: ");
           jg1.setPalpite();
           pal1 = jg1.getPalpite();
           if(jg2.getPosNav(pal1)){
               jg1certo++;
               System.out.println(jg1certo);
           }
           /*System.out.println("teste 02: ");
           System.out.println(jg2certo);*/
           System.out.println("Palpite jg2: ");
           jg2.setPalpite();
           pal2 = jg2.getPalpite();
           if(jg1.getPosNav(pal2)){
               jg2certo++;
               System.out.println(jg2certo);
           }
        }
        fimPartida();
    }
    void fimPartida(){
        if(jg1certo==3){
            jg1.getNomeJogador();
            //System.out.println("afundou o navio: ");
            jg2.getNomeNavio();
            jg1.getNumJogadas();
        }else if(jg2certo==3){
            jg2.getNomeJogador();
            //System.out.println("afundou o navio: ");
            jg1.getNomeNavio();
            jg2.getNumJogadas();
        }
    }
}
