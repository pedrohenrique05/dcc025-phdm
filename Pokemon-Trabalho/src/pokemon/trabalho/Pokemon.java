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
public  class Pokemon extends Pokedex{
    
    private String nomePokemon, sexoPokemon, habilidade, fraqueza, descricao;
    private int altura, peso, numId = 0, numIdEvolucao = 0;
    private boolean evolucao = false;
    
    @Override
    public void setPokemon(){
        super.setPokemon();;
    }
    /** 
     * setando o nome do pokemon
     * @param nomePokemon
     */
    public void setNomePokemon(String nomePokemon){
        this.nomePokemon = nomePokemon;
    }
    
    public void setSexoPokemon(String sexoPokemon){
        this.sexoPokemon = sexoPokemon;
    }
    
    public void setHabilidade(String habilidade){
        this.habilidade = habilidade;
    }
    
    public void setFraqueza(String fraqueza){
        this.fraqueza = fraqueza;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    public void setNumId(){
        this.numId++;
    }
    
    public void setNumIdEvolucao(int numIdEvolucao){
        this.numIdEvolucao = numIdEvolucao;
    }
    
    public void setEvolucao(boolean evolucao){
        this.evolucao = evolucao;
    }
    
    public boolean getEvolucao(){
        return this.evolucao;
    }
    /**
     * exclui pokemon
     */
    @Override
    public void excluiPokemon(int numId) {
        //...
    }
}
