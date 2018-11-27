package pokemons;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Juarez
 */
//estender de informações//sobrecarga de construtorres
public class Ginasio implements Serializable {

//private static ArrayList <Ginasio> arrayGinasio = new ArrayList();
private String nomeGinasio, mestreGinasio;
private ArrayList <Informacoes> arrayPokemons = new ArrayList();
    
    /**
     * construtor
     */
    public Ginasio(){
    
    }
    /**
    * Seta o nome do mestre do ginasio
    * @param mestreGinasio 
    */
    public void setMestreGinasio(String mestreGinasio) {
        this.mestreGinasio = mestreGinasio;
    }
    /**
     *
     * @return nome do mestre do ginasio
     */
    public String getMestreGinasio() {
        return this.mestreGinasio;
    }
    /**
     * Seta o pokemom no Array de pokemons que tem no ginasio
     * @param pokemons 
     */
    public void setPokemons(Informacoes pokemons) {
        this.arrayPokemons.add(pokemons);
    }
    /**
     * 
     * @return retorna array de pokemons do ginasio
     */
    public ArrayList getPokemons() {
        return this.arrayPokemons;
    }
    /**
     * Setando o nome do ginasio
     * @param nomeGinasio 
     */
    public void setNomeGinasio(String nomeGinasio) {
        this.nomeGinasio = nomeGinasio;
    }
    /**
     * 
     * @return o nome do ginasio
     */
    public String getNomeGinasio() {
        return this.nomeGinasio;
    }
}
