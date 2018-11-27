/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemons;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/**
 *
 * @author pedro
 */


public class MenuBDP {
    /**
     * construtor da classe.
     */
    public MenuBDP(){
        
    }
    /**
     * Tratamento de erro de valor digitado.
     * @param valor
     * @return 
     */
    public static int erro(String valor){
        int valorInt;
        try{
            
            valorInt  = Integer.parseInt(valor);
            
            
        }catch(NumberFormatException e){
           System.out.println("Comando inválido");
           Scanner teste = new Scanner(System.in); 
           valorInt = erro(teste.next());
        }
        return valorInt;
    }
    /**
     * Salva os objetos pokedex instanciados em um arquivo no disco
     * @param obj 
     */
    public void salvarObjeto(Pokedex obj){
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("gravObj.dat");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(obj);
            objGravar.flush();
            objGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        }catch(Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }
    }
    /**
     * Retorna o objeto pokedex que está salvo no disco
     * @return 
     */
    public Pokedex getObjecto(){
        
        try{
            
            //Carrega o arquivo
 
            FileInputStream arquivoLeitura = new FileInputStream("gravObj.dat");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            Pokedex pok = (Pokedex)objLeitura.readObject();
            System.out.println("Leitura finalizada com sucesso");
            objLeitura.close();
            arquivoLeitura.close();
            return pok;
            
        }catch(Exception e) {
 
            System.out.println("Erro ao ler arquivo");
            return null;
        }
    }
    
    
    /**
     * Salva os objetos jogador instanciados em um arquivo no disco
     * @param obj 
     */
    public void salvarObjetoJg(Jogador obj){
        try{
            FileOutputStream arquivoGrav = new FileOutputStream("gravObjJg.dat");
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            objGravar.writeObject(obj);
            objGravar.flush();
            objGravar.close();
            System.out.println("Objeto gravado com sucesso!");
        }catch(Exception e) {
            System.out.println("Erro ao salvar arquivo");
        }
    }
    /**
     * Retorna o objeto jogador que está salvo no disco
     * @return 
     */
    public Jogador getObjectoJg(){
        
        try{
            
            //Carrega o arquivo
 
            FileInputStream arquivoLeitura = new FileInputStream("gravObjJg.dat");
            ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
            Jogador jg = (Jogador)objLeitura.readObject();
            System.out.println("Leitura finalizada com sucesso");
            objLeitura.close();
            arquivoLeitura.close();
            return jg;
            
        }catch(Exception e) {
 
            System.out.println("Erro ao ler arquivo");
            return null;
        }
    }
    /**
     * Menu do banco de dados de pokemons
     */
    public void menuInicio(){
        Jogador jg = null;
        Pokedex pokedex;
        /**
         * If else que tem como objetivo solicitar ao usuário informar se quer abrir um
         * arquivo já existente ou inicializar um do zero.
         */
        int arq = 0;
        System.out.println("(0) - Iniciar novo arquivo\n"
                + "(1) - abrir arquivo salvo");
        Scanner lerArq = new Scanner(System.in);
        arq = erro(lerArq.next());
        if(arq == 0){
            jg = new Jogador();
            System.out.println("Iniciando o Sistema!\nPara prosseguir, cadastre um jogador!");
            String auxStr;
            int auxInt;
            Scanner str = new Scanner(System.in);
            System.out.println("Digite o nome do jogador!");
            auxStr = str.nextLine();
            jg.setNomeJogador(auxStr);
            System.out.println("Digite o sexo do jogador!");
            auxStr = str.nextLine();
            jg.setSexoJogador(auxStr);
            System.out.println("Digite a insigna do jogador ou 'sair' p/ sair");
            auxStr = str.nextLine();
            for(int aux = 0 ; aux < 10 ; aux++){
                if("sair".equals(auxStr)){
                    aux = 10;
                }else{
                    System.out.println("Proxima insigna ou 'sair");
                    jg.setInsignia(auxStr);
                }
            }
            System.out.println("Digite a idade do jogador!");
            Scanner inte = new Scanner(System.in);
            auxInt = erro(inte.next());
            jg.setIdade(auxInt);
            System.out.println("Informe a quantidade de pokebolas que o jogador tem!");
            auxInt = erro(inte.next());
            jg.setPokebola(auxInt);
            pokedex = new Pokedex();
        }else{
            pokedex = getObjecto();
            jg = getObjectoJg();
            if(pokedex == null){
                pokedex = new Pokedex();
            }
            if(jg == null){
                            jg = new Jogador();
            System.out.println("Iniciando o Sistema!\nPara prosseguir, cadastre um jogador!");
            String auxStr;
            int auxInt;
            Scanner str = new Scanner(System.in);
            System.out.println("Digite o nome do jogador!");
            auxStr = str.nextLine();
            jg.setNomeJogador(auxStr);
            System.out.println("Digite o sexo do jogador!");
            auxStr = str.nextLine();
            jg.setSexoJogador(auxStr);
            System.out.println("Digite a insigna do jogador ou 'sair' p/ sair");
            auxStr = str.nextLine();
            for(int aux = 0 ; aux < 10 ; aux++){
                if("sair".equals(auxStr)){
                    aux = 10;
                }else{
                    System.out.println("Proxima insigna ou 'sair");
                    jg.setInsignia(auxStr);
                }
            }
            System.out.println("Digite a idade do jogador!");
            Scanner inte = new Scanner(System.in);
            auxInt = erro(inte.next());
            jg.setIdade(auxInt);
            System.out.println("Informe a quantidade de pokebolas que o jogador tem!");
            auxInt = erro(inte.next());
            jg.setPokebola(auxInt);
            }
        }
        
        
        int menu;
        /**
         * Inicio da estrutura de menu do sistema.
         */
        do{
                        System.out.println("\n### Sistema de informações de pokemons! - Pokedex ###");
			System.out.println("                  =============================");
			System.out.println("                  |   1 - Adicionar pokemon   |");
			System.out.println("                  |   2 - Listar BD pokemons  |");
			System.out.println("                  |   3 - Deletar pokemon     |");
			System.out.println("                  |   4 - Adicionar Ginasio   |");
			System.out.println("                  |   5 - Listar BD Ginasio   |");
			System.out.println("                  |   6 - Deletar Ginasio     |");
                        System.out.println("                  |   7 - Imprime Jogador     |");
                        System.out.println("                  |   8 - Salvar BD Pokemons  |");
			System.out.println("                  |   0 - Sair                |");
			System.out.println("                  =============================\n");
			
            Scanner auxMenu = new Scanner(System.in);
            menu = erro(auxMenu.next());
            
            switch(menu){
                case 0:
                    System.out.println("Finalizando o sistema!");
                    break;
                case 1:
                    System.out.println("\n### Tipos existentes de pokemons! ###");
                    System.out.println("            ================");
                    System.out.println("            |  1 - Agua    |");
                    System.out.println("            |  2 - Fogo    |");
                    System.out.println("            |  3 - Normal  |");
                    System.out.println("            |  4 - Terra   |");
                    System.out.println("            |  5 - Voador  |");
                    System.out.println("            ================\n");
                    int tipoPok;
                    Scanner tipo = new Scanner(System.in);
                    tipoPok = erro(tipo.next());
                    String str;
                    int val;
                    switch(tipoPok){
                        case 1:
                            Agua ag = new Agua();
                            //setando o tipo
                            ag.setTipo();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStr = new Scanner(System.in);
                            str = auxStr.nextLine();
                            ag.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStr.nextLine();
                            ag.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStr.nextLine();
                            ag.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStr.nextLine();
                            ag.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStr.nextLine();
                            ag.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStr.nextLine();
                            ag.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxInt = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxInt.next());
                            ag.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxInt.next());
                            ag.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxInt.next());
                            ag.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(ag.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxInt.next());
                                    ag.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(ag);
                            break;
                        case 2:
                            Fogo fg = new Fogo();
                            //setando o tipo
                            fg.setTipo();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrF = new Scanner(System.in);
                            str = auxStrF.nextLine();
                            fg.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrF.nextLine();
                            fg.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrF.nextLine();
                            fg.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntF = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntF.next());
                            fg.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntF.next());
                            fg.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntF.next());
                            fg.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(fg.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntF.next());
                                    fg.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(fg);
                            break;
                        case 3:
                            Normal nmr = new Normal();
                            //setando o tipo
                            nmr.setTipo();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrN = new Scanner(System.in);
                            str = auxStrN.nextLine();
                            nmr.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrN.nextLine();
                            nmr.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntN = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntN.next());
                            nmr.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntN.next());
                            nmr.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntN.next());
                            nmr.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(nmr.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntN.next());
                                    nmr.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(nmr);
                            break;
                        case 4:
                            Terra tr = new Terra();
                            //setando o tipo
                            tr.setTipo();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrT = new Scanner(System.in);
                            str = auxStrT.nextLine();
                            tr.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrT.nextLine();
                            tr.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrT.nextLine();
                            tr.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntT = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntT.next());
                            tr.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntT.next());
                            tr.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntT.next());
                            tr.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(tr.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntT.next());
                                    tr.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(tr);
                            break;
                        case 5:
                            Voador vd = new Voador();
                            //setando o tipo
                            vd.setTipo();
                            //Setando o nome do pokemon
                            System.out.println("Digite o nome do Pokemon!");
                            Scanner auxStrV = new Scanner(System.in);
                            str = auxStrV.nextLine();
                            vd.setNome(str);
                            //setando o sexo do pokemon
                            System.out.println("Digite o sexo do Pokemon!");
                            str = auxStrV.nextLine();
                            vd.setSexo(str);
                            //setando a habilidade
                            System.out.println("Digite a habilidade do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setHabilidade(str);
                            //setando a fraqueza do pokemon
                            System.out.println("Digite a fraqueza do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setFraqueza(str);
                            //Setando a vantagem do pokemon
                            System.out.println("Digite a vantagem do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setVantagem(str);
                            //setando a descrição do pokemon
                            System.out.println("Digite a descrição do pokemon!");
                            str = auxStrV.nextLine();
                            vd.setDescricao(str);
                            //setando a altura do pokemon
                            Scanner auxIntV = new Scanner(System.in);
                            System.out.println("Digite a altura do pokemon!");
                            val = erro(auxIntV.next());
                            vd.setAltura(val);
                            //setando o peso do pokemon
                            System.out.println("Digite o peso do pokemon!");
                            val = erro(auxIntV.next());
                            vd.setPeso(val);
                            //setando a evolução do pokemon
                            System.out.println("O pokemon é uma evolução?\n (1)Sim ou (0)Não");
                            val = erro(auxIntV.next());
                            vd.setEvolucao(val);
                            //Setando o id do pokemon pai, se existir
                            if(vd.getEvolucao()!= 0){
                                if(pokedex.getNumPokemon() > 0){
                                    System.out.println("Digite o id(identificador"
                                            + "do pokemon 'pai'!");
                                    val = erro(auxIntV.next());
                                    vd.setNumIdEvolucao(val);
                                }else{
                                    System.out.println("Não possui pokemons registrado "
                                            + "na pokedex");
                                }
                            }
                            pokedex.setObjetoPokemon(vd);
                            break;
                        default:
                            System.out.println("Tipo de pokemon informado não existe!");
                    }
                    break;
                case 2:
                    pokedex.getObjetoPokemonLista();
                    break;
                case 3:
                    if(pokedex.getNumPokemon() != 0){
                        int auxInd;
                        System.out.println("Digite o id do pokemon");
                        Scanner indDelete = new Scanner(System.in);
                        auxInd = erro(indDelete.next());
                        pokedex.excluiPokemon(auxInd);
                    }else{
                        System.out.println("Não possui pokemons na pokedex!!");
                    }
                    break;
                case 4:
                    Ginasio gin = new Ginasio();
                    String strGin;
                    int auxInt;
                    /**
                     * setando nome Ginásio
                    */
                    System.out.println("Digite o nome do Ginásio: ");
                    Scanner auxStrGin = new Scanner(System.in);
                    strGin = auxStrGin.nextLine();
                    gin.setNomeGinasio(strGin);
                    /**
                     * setando nome Mestre do ginasio
                    */
                    System.out.println("Digite o nome do Mestre Ginásio: ");
                    strGin = auxStrGin.nextLine();
                    gin.setMestreGinasio(strGin);
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
                                if(pokedex.getNumPokemon() == 0){
                                    System.out.println("Não existe pokemons registrados na pokedex!");
                                    sair = -1;
                                }else if(auxInt >= 0 && auxInt < pokedex.getNumPokemon()){
                                    gin.setPokemons(pokedex.getObjetoPokemon(auxInt));
                                    System.out.println("Digite um id  ou -1 p/ sair");
                                    auxInt = erro(idPokemon.next());
                                if(auxInt == -1){
                                    sair = auxInt;
                                }
                                }else{
                                    System.out.println("Digite um id válido ou -1 p/ sair");
                                    auxInt = erro(idPokemon.next());
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }
                                }
                            }
                        }
                    pokedex.setObjetoGinasio(gin);
                    break;
                case 5:
                    //Ginasio gin1 = new Ginasio();
                    pokedex.getObjetoGinasioLista();
                    break;
                case 6:
                    Ginasio gin2 = new Ginasio();
                    if(pokedex.getNumGinasio() != 0){
                        int intAux;
                        System.out.println("Digite o id do ginasio!");
                        Scanner idGinasio = new Scanner(System.in);
                        intAux = erro(idGinasio.next());
                        pokedex.excluiGinasio(intAux);
                        
                    }
                    break;
                case 7:
                    jg.imprimeJogador();
                    break;
                case 8:
                    salvarObjeto(pokedex);
                    salvarObjetoJg(jg);
                    break;
                default:
                    System.out.println("Comando não encontrado!");
                    
            }
        }while(menu != 0);
    }
        
    
}
