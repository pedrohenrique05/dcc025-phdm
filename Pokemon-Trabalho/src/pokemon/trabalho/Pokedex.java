/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.trabalho;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Pokedex extends Jogador {
    private static  int numPokemons = 0;
    private static  int numGinasio = 0;
    
    //Pokemon pok = new Pokemon();
    ArrayList <Pokemon> arrayPokemon = new ArrayList();
    
    
    public void setPokemon(){
        String auxString;
        int auxNum;
        boolean auxBool;
        //Set nome pokemon
        System.out.println("Digite o nome do pokemon");
        Scanner nomePok = new Scanner(System.in);
        auxString = nomePok.next();
        arrayPokemon.get(numPokemons).setNomePokemon(auxString);
        //set sexo pokemon
        System.out.println("Digite o sexo do pokemon");
        Scanner sexoPok = new Scanner(System.in);
        auxString = sexoPok.next();
        arrayPokemon.get(numPokemons).setSexoPokemon(auxString);
        //set habilidade pokemon
        System.out.println("Digite a habilidade do pokemon");
        Scanner habilidadePok = new Scanner(System.in);
        auxString = habilidadePok.next();
        arrayPokemon.get(numPokemons).setHabilidade(auxString);
        //set fraqueza pokemon
        System.out.println("Digite a fraqueza do pokemon");
        Scanner fraquezaPok = new Scanner(System.in);
        auxString = fraquezaPok.next();
        arrayPokemon.get(numPokemons).setFraqueza(auxString);
        //set descrição pokemon
        System.out.println("Digite descricao do pokemon");
        Scanner descricaoPok = new Scanner(System.in);
        auxString = descricaoPok.next();
        arrayPokemon.get(numPokemons).setDescricao(auxString);
        //set altura pokemon
        System.out.println("Digite a altura do pokemon");
        Scanner alturaPok = new Scanner(System.in);
        auxNum = alturaPok.nextInt();
        arrayPokemon.get(numPokemons).setAltura(auxNum);
        //set peso pokemon
        System.out.println("Digite o peso do pokemon");
        Scanner pesoPok = new Scanner(System.in);
        auxNum = pesoPok.nextInt();
        arrayPokemon.get(numPokemons).setPeso(auxNum);
        //set idNum pokemon
        arrayPokemon.get(numPokemons).setNumId();
        //set evolucao pokemon
        System.out.println("O pokemon é uma evolução? Sim(1) ou Não(0)");
        Scanner evolucaoPok = new Scanner(System.in);
        auxBool = evolucaoPok.nextBoolean();
        arrayPokemon.get(numPokemons).setEvolucao(auxBool);
        //set numIdEvolução pokemon
        if(arrayPokemon.get(numPokemons).getEvolucao()){
            System.out.println("Digite id(identificador) do pokemon 'pai'");
            Scanner idPok = new Scanner(System.in);
            auxNum = idPok.nextInt();
            arrayPokemon.get(numPokemons).setNumIdEvolucao(auxNum);
        }
        //arrayPokemon.remove(numId);
    }
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
    /**
     * atualiza o numero de pokemon
     */
    public void excluiPokemon(int numId){
        //...
    }
    public void excluiGinasio(){
        //...
    }
}
