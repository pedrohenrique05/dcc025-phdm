/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author pedro
 */
public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    public static int qtdCac = 0;
    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        qtdCac++;
    }
    
    public Cachorro venderCachorro(){
        qtdCac--;
        return null;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setIdade(int idade){
        this. idade = idade;
    }
    public void getNome(){
        System.out.println(this.nome);
    }
    public void getRaca(){
        System.out.println(this.raca);
    }
    public void getIdade(){
        System.out.println(this.idade);
    }
}
