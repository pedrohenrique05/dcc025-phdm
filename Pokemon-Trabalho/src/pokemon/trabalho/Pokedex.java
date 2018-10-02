/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.trabalho;

/**
 *
 * @author pedro
 */
public abstract class Pokedex extends Jogador {
    private static  int numPokemons = 0;
    private static  int numGinasio = 0;
    
    /**
     * adicionando o numero de pokemons na pokedex.
     */
    public void setNumPokemon(){
        this.numPokemons++;
    }
    
    /**
     * adicionando o numero de ginasio que está na pokedex.
     */
    public void setNumGinasio(){
        this.numGinasio++;
    }
    /**
     * 
     * @return o numero de pokemons que possui na pokedex.
     */
    public int getNumPokemon(){
        return this.numPokemons;
    }
    /**
     * 
     * @return o numero de ginasio que possui na pokedex.
     */
    public int getNumGinasio(){
        return this.numGinasio;
    }
}
