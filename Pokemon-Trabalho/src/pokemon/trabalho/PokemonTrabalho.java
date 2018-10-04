/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.trabalho;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class PokemonTrabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador jg = new Jogador();
        Pokemon pokPrincipal = new Pokemon();
        int menu;
        do{
            System.out.println("0 - para sair ; 1 - para adicionar um novo pokemon"
                    + " ; 2 - para listar BD da pokedex");
            Scanner auxMenu = new Scanner(System.in);
            menu = auxMenu.nextInt();
            switch(menu){
                case 0:
                    System.out.println("Finalizando o sistema!");
                    break;
                case 1:
                    Pokemon pokk = new Pokemon();
                    String auxString;
                    int auxNum;
                    boolean auxBool;
                    //Set nome pokemon
                    System.out.println("Digite o nome do pokemon");
                    Scanner nomePok = new Scanner(System.in);
                    auxString = nomePok.next();
                    pokk.setNomePokemon(auxString);
                    //set sexo pokemon
                    System.out.println("Digite o sexo do pokemon");
                    Scanner sexoPok = new Scanner(System.in);
                    auxString = sexoPok.next();
                    pokk.setSexoPokemon(auxString);
                    //set habilidade pokemon
                    System.out.println("Digite a habilidade do pokemon");
                    Scanner habilidadePok = new Scanner(System.in);
                    auxString = habilidadePok.next();
                    pokk.setHabilidade(auxString);
                    //set fraqueza pokemon
                    System.out.println("Digite a fraqueza do pokemon");
                    Scanner fraquezaPok = new Scanner(System.in);
                    auxString = fraquezaPok.next();
                    pokk.setFraqueza(auxString);
                    //set descrição pokemon
                    System.out.println("Digite descricao do pokemon");
                    Scanner descricaoPok = new Scanner(System.in);
                    auxString = descricaoPok.next();
                    pokk.setDescricao(auxString);
                    //set altura pokemon
                    System.out.println("Digite a altura do pokemon");
                    Scanner alturaPok = new Scanner(System.in);
                    auxNum = alturaPok.nextInt();
                    pokk.setAltura(auxNum);
                    //set peso pokemon
                    System.out.println("Digite o peso do pokemon");
                    Scanner pesoPok = new Scanner(System.in);
                    auxNum = pesoPok.nextInt();
                    pokk.setPeso(auxNum);
                    //set idNum pokemon
                    pokk.setNumId();
                    //set evolucao pokemon
                    System.out.println("O pokemon é uma evolução? Sim(1) ou Não(0)");
                    Scanner evolucaoPok = new Scanner(System.in);
                    auxNum = evolucaoPok.nextInt();
                    pokk.setEvolucao(auxNum);
                    //set numIdEvolução pokemon
                    if(pokk.getEvolucao() == 1){
                        System.out.println("Digite id(identificador) do pokemon 'pai'");
                        Scanner idPok = new Scanner(System.in);
                        auxNum = idPok.nextInt();
                        pokk.setNumIdEvolucao(auxNum);
                    }
                    pokPrincipal.setObjetoPokemon(pokk);
                    break;
                case 2:
                    pokPrincipal.getObjetoPokemon();
                    break;
                default:
                    System.out.println("Comando não encontrado!");
                    
            }
            /*pokk.setAltura(1);
            pokk.setDescricao("Descrição teste");
            pokk.setEvolucao(false);
            pokk.setFraqueza("fraqueza teste");
            pokk.setHabilidade("habilidade teste");
            pokk.setNomePokemon("nome teste");
            pokk.setSexoPokemon("sexo teste");
            pokk.setNumId();
            pokk.setNumIdEvolucao(0);
            pokk.setObjetoPokemon(pokk);
            pokk.getObjetoPokemon();
            menu++;*/
        }while(menu != 0);
        
}

}
