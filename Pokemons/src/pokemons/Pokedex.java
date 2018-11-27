/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import java.io.Serializable;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author pedro
 */

public class Pokedex implements Serializable{
    private static  int numPokemons = 0;
    private static  int numGinasio = 0;
    
    private ArrayList <Informacoes> arrayPokemon = new ArrayList();
    private ArrayList <Informacoes> arrayTeste = new ArrayList();
    private ArrayList <Ginasio> arrayGinasio = new ArrayList();
    
    /**
     * Construtor da classe
     */
    public Pokedex(){
        
    }
    /**
     * Adicionando o objeto ginasio no ArrayList e somando a qtd de ginasio
     * @param gin 
     */
    public void setObjetoGinasio(Ginasio gin){
        System.out.println("Ginasio salvo!");
        this.arrayGinasio.add(gin);
    }
    
    /**
     * criando o metodo setPokemon, que usará os metodos set's da classe filha
     * 'Pokemon'
     * @param pokk
     */
    public void setObjetoPokemon(Informacoes pokk){
        System.out.println("Pokemon salvo!");
        this.arrayPokemon.add(pokk);
    }
    /**
     * 
     * @param ind indece do objeto no array Pokemon
     * @return o objeto referente ao ind passado por parametro
     */
    public Informacoes getObjetoPokemon(int ind){
     return this.arrayPokemon.get(ind);
    } 

    /**
     *Imprime todas as informações do array Pokemon
     */
    public void getObjetoPokemonLista(){
        String pokemon;
        if(this.arrayPokemon.isEmpty()){
            System.out.println("Não há nenhum pokemon registrado na pokedex!");
        }else{
            
            for(int aux = 0 ; aux< this.arrayPokemon.size(); aux++){
                pokemon = "| Tipo: "+((InfoPok)this.arrayPokemon.get(aux)).getTipo()+
                        "\n| Nome do pokemon: " +this.arrayPokemon.get(aux).getNome()+ 
                        "\n| Sexo: "+this.arrayPokemon.get(aux).getSexo()+
                        "\n| Habilidade: "+this.arrayPokemon.get(aux).getHabilidade()+"\n| Fraqueza: "+
                        ((InfoPok)this.arrayPokemon.get(aux)).getFraqueza()+"\n| Vantagem: "
                        +((InfoPok)this.arrayPokemon.get(aux)).getVantagem()+"\n| Descrição: "
                        +this.arrayPokemon.get(aux).getDescricao()+"\n| Altura: "
                        +this.arrayPokemon.get(aux).getAltura()+"\n| Peso: "+
                        this.arrayPokemon.get(aux).getAltura()+"\n| Seu id: "+
                        aux+"\n| Id do seu pokemon de origem: "+
                        this.arrayPokemon.get(aux).getNumIdEvolucao();
                System.out.println(pokemon+"\n ---------- ");


            }
        
        }
        
    }
     /**
     *Imprime todas as informações do array Pokemon
     */
    public void getObjetoGinasioLista(){
        String ginasio;
        if(this.arrayGinasio.isEmpty()){
            System.out.println("Não há nenhum ginasio registrado na pokedex!");
        }else{
            
            for(int aux = 0 ; aux< this.arrayGinasio.size(); aux++){
                ginasio = " | Nome do Ginasio: "+this.arrayGinasio.get(aux).getNomeGinasio()+"\n | "
                        + "Nome do mestre de ginasio: "+this.arrayGinasio.get(aux).getMestreGinasio();
                System.out.println(ginasio);
                ArrayList <Informacoes> auxArray = new ArrayList();
                auxArray = this.arrayGinasio.get(aux).getPokemons();
                for(int aux1 = 0 ; aux1 < auxArray.size()/*Pokedex.arrayGinasio.get(aux).getPokemons().size()*/ ;aux1++){
                    System.out.println(" | Nome do Pokemon: "+auxArray.get(aux1).getNome());
                }
                System.out.println("\n ----------");
            }
        
        }
        
    }
    
    /** 
     * @param ind indece do objeto no array Ginasio
     * @return o objeto referente ao ind passado por parametro
     */
    public Ginasio getObjetoGinasio(int ind){
     return this.arrayGinasio.get(ind);
    } 
    /**
     * 
     * @return o numero de pokemons que possui na pokedex.
     */
    public int getNumPokemon(){
        return this.arrayPokemon.size();
        //return Pokedex.numPokemons;
    }
    
    /**
     * 
     * @return o numero de ginasio que possui na pokedex.
     */
    public int getNumGinasio(){
        return arrayGinasio.size();
        //return Pokedex.numGinasio;
    }
    /**
     * atualiza o numero de pokemon
     * @param numId
     * excluindo o pokemon da lista de acordo com o id passado.
     */
    public void excluiPokemon(int numId){
        try{
        this.arrayPokemon.remove(numId);
        System.out.println("Pokemon deletado com sucesso!");
        }catch(Exception e){
                if(numId+1 > this.arrayPokemon.size() || numId < 0){
                    System.out.println("Pokemon não encontrado!"); 
                }
                }
    }
    /**
     * exclui o ginásio de acordo com o id passado.
     * @param ind 
     */
  
    public void excluiGinasio(int ind){
        if(ind+1 > this.arrayGinasio.size() || ind < 0){
                    System.out.println("Ginasio não encontrado!");
        }else{
            this.arrayGinasio.remove(ind);
            System.out.println("Ginasio deletado com sucesso!");
        }
        
    }
    

}
