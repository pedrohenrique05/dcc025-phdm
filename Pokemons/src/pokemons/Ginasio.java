package pokemons;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Juarez
 */
//estender de informações//sobrecarga de construtorres
public class Ginasio {

//private static ArrayList <Ginasio> arrayGinasio = new ArrayList();
private String nomeGinasio, mestreGinasio;
private ArrayList <Informacoes> arrayPokemons = new ArrayList();

    
    //public static int contador =0;

    /*public void setObjetoGinasio(Ginasio gin){
        super.setNumGinasio();
        Ginasio.arrayGinasio.add(gin);
        
    }*/

    /*public static ArrayList<Ginasio> getArrayGinasio() {
        return arrayGinasio;
    }*/
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
        arrayPokemons.add(pokemons);
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

    /*public static void setArrayGinasio(ArrayList<Ginasio> arrayGinasio) {
        Ginasio.arrayGinasio = arrayGinasio;
    }*/

    /*public static void contar(){
        contador++;
    }*/
    
    
    
    
    /**
    * função menu para adicionar ginasio
    */
    public void menu() { // menu principal
        Scanner leituraOpcao= new Scanner(System.in); 
        int opcao = 0;
            do {
                System.out.println("Deseja cadastrar um Ginásio?");
                System.out.println("\n                  -------------------");
                System.out.println("                  |     0 - Não     |");
                System.out.println("                  |     1 - Sim     |");
                System.out.println("                  -------------------\n");
                opcao = leituraOpcao.nextInt();
                System.out.print("\n");
                switch (opcao) {
                    case 0:
                        System.out.println("Finalizando...");
                        break;
                    case 1:
                        Pokedex pok = new Pokedex();
			String auxString;
                        int auxInt = 0;
                        Ginasio ginAux = new Ginasio();
			/**
                         * setando nome GinÃ¡sio
                         */
                        Scanner nomeGin = new Scanner(System.in);
			System.out.println("Digite o nome do Ginásio: ");
			auxString = nomeGin.nextLine();
                        ginAux.setNomeGinasio(auxString);
                        /**
                         * setando nome Mestre do ginasio
                         */
                        Scanner nomeMestre = new Scanner(System.in);
			System.out.println("Digite o nome do Mestre Ginásio: ");
			auxString = nomeMestre.nextLine();
                        ginAux.setMestreGinasio(auxString);
                        /**
                         * Setando o pokemon no ginasio
                         */
                        Scanner adcPokemon = new Scanner(System.in);
                        System.out.println("Digite 1 - p/ adicionar pokemon.\n"
                                + "Digite 0 - p/ nao adicionar pokemon. ");
                        auxInt = adcPokemon.nextInt();
			/**
                         * setandoPokemons
                         */
                        if(auxInt == 1){
                            Scanner idPokemon = new Scanner(System.in);
                            System.out.println("Digite o id do pokemon");
                            System.out.println("Digite -1 p/ sair!");
                            auxInt = idPokemon.nextInt();
                            int sair = 0;
                            
                            while(sair != -1){
                                if(pok.getNumPokemon() == 0){
                                    System.out.println("Não existe pokemons registrados na pokedex!");
                                    sair = -1;
                                }else if(auxInt >= 0 && auxInt < pok.getNumPokemon()){
                                    ginAux.setPokemons(pok.getObjetoPokemon(auxInt));
                                    System.out.println("Digite um id  ou -1 p/ sair");
                                auxInt  = idPokemon.nextInt();
                                if(auxInt == -1){
                                    sair = auxInt;
                                }
                                }else{
                                    System.out.println("Digite um id válido ou -1 p/ sair");
                                    auxInt  = idPokemon.nextInt();
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }
                                }
                                
                                /*if(pok.getNumPokemon() == 0){
                                    System.out.println("Não existe pokemons registrados na pokedex!");
                                    sair = -1;
                                }else if(auxInt <= pok.getNumPokemon()){
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }else if(auxInt >= 0 && auxInt <= pok.getNumPokemon()) {
                                        ginAux.setPokemons(pok.getObjetoPokemon(auxInt));
                                        System.out.println("Digite outro id!\n"
                                            + "ou digite -1 p/ sair");
                                        auxInt = idPokemon.nextInt();
                                    }else{
                                        System.out.println("Id de pokemon nao existente!");
                                        sair = 0;
                                    }
                                    
                                    
                                }else{
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }else if(auxInt >= 0 && auxInt <= pok.getNumPokemon()) {
                                        ginAux.setPokemons(pok.getObjetoPokemon(auxInt));
                                        System.out.println("Digite outro id!\n"
                                            + "ou digite -1 p/ sair");
                                        auxInt = idPokemon.nextInt();
                                    }else{
                                        System.out.println("Id de pokemon nao existente!");
                                        sair = 0;
                                    }
                                }*/
                                //auxInt = idPokemon.nextInt();
                            }
                        }
                        /**
                         * setandoGinasio
                         */
                        pok.setObjetoGinasio(ginAux);
                        break;
                    default:
                        System.out.println("Opção está inválida!");
                        /**
                         * tratamento do erro (chamar/executar).
                         */
                        break;
			}
		} while (opcao != 0);
                
            }
}
