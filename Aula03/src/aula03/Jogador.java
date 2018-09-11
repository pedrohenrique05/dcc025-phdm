/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Jogador {
    Navio nav = new Navio();
    String nome;
    int palpite, qtdJogada = 0;
    
    //setando o nome do jogador
    void setNome(){
        System.out.println("Digite o seu nome: ");
        Scanner nome1 = new Scanner(System.in);
        nome = nome1.next();
    }
    //setando o nome e a posição do Navio
    void setPosNavioJogador(){
        
        nav.setNomeNavio();
        nav.setPosNavio();
        
    }
    //setando o palpite e somando as jogadas;
    void setPalpite(){
        System.out.println("Digite um palpite (de 0 a 99)");
        Scanner palpite1 = new Scanner(System.in);
        palpite = palpite1.nextInt();
        qtdJogada++;
    }
    
    void getNomeJogador(){
        System.out.println("Nome do jogador: ");
        System.out.println(nome);
    }
    void getNumJogadas(){
        System.out.println("Fez x jogadas: ");
        System.out.println(qtdJogada);
    }
    void getNomeNavio(){
        nav.getNomeNavio();
    }
    void getImpPosNav()
    {
        nav.getImpPosNavio();
    }
    boolean getPosNav(int j){
         return nav.getPosNavio(j);
    }
    int getPalpite(){
        return palpite;
    }
}
