/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */

public class Jogador implements Serializable{

private String nomeJogador, sexoJogador;
String [] insignia = new String[10];
private int idade, pokebola = 0;
private int ind = 0;

/**
 * construtor da classe
 */
public Jogador(){
    
}
/**
 * Imprime os dados do jogador
 */
public void imprimeJogador(){
    String info = "|Nome: "+this.getNomeJogador()+"\n"
                + "|Sexo: "+this.getSexoJogador()+"\n"
                + "|Idade: "+this.getIdade()+"\n"
                + "|N° de pokebolas: "+this.getNumPokebolas();
        String insigna = "|Insignas: ";
        for(int aux1 = 0 ; aux1 < this.ind; aux1++){
            insigna += getInsigniaJogador(aux1)+", ";
        }
        System.out.println("\n"+info+"\n"+insigna);
}

/**
 * metodo que seta o nome do jogador. não há retorno.
 * @param nomeJogador - nome do jogador.
 */
public void setNomeJogador(String nomeJogador){
    this.nomeJogador = nomeJogador;
}
/**
 * metodo que seta o sexo do jogador. não há retorno.
 * @param sexoJogador sexo do jogador.
 */
public void setSexoJogador(String sexoJogador){
    this.sexoJogador = sexoJogador;
}
/**
 * metodo que seta insignia do jogador. não há retorno.
 * @param insignia insignia que o jogador tem.
 */
public void setInsignia(String insignia){
    if(this.ind < 10){
        this.insignia[this.ind] = insignia;
        this.ind++;
    }else{
        System.out.println("Não pode haver mais insignia");
    }
    
}
/**
 * metodo que seta a idade do jogador. não há retorno.
 * @param idade idade que o jogador possui.
 */
public void setIdade(int idade){
    this.idade = idade;
}
/**
 * metodo que seta numero de pokebolas que o jogador tem. não há retorno.
 * @param pokebola numero que o jogador possui de pokebolas.
 */
public void setPokebola(int pokebola){
    this.pokebola = pokebola;
}
/**
 * 
 * @return Nome do jogador.
 */
public String getNomeJogador(){
    return this.nomeJogador;
}
/**
 * 
 * @return o sexo do jogador.
 */
public String getSexoJogador(){
    return this.sexoJogador;
}
/**
 * 
 * @param ind indice que a insignia está no vetor de insignia.
 * @return retorna a insignia que está na posição informada.
 */
public String getInsigniaJogador(int ind){
    return this.insignia[ind];
}
/**
 * 
 * @return retorna a idade que o jogador possui. 
 */
public int getIdade(){
    return this.idade;
}
/**
 * 
 * @return o numero de pokebolas que o jogador possui.
 */
public int getNumPokebolas(){
    return this.pokebola;
}
/**
 * Esse metodo atualiza o numero de pokebolas que o jogador possui.
 * @param pokebola - o numero de pokebolas que ele ganhou ou perdeu.
 */
public void atualizaNumPokebolas(int pokebola){
    this.pokebola =+ pokebola;
}
}
