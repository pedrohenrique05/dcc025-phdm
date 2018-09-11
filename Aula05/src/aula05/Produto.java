/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author pedro
 */
public class Produto {
   private String nome;
   private int id;
   private int validade,fabricacao;
   
   Produto(){

   }
   public void setNome(String nome){
       this.nome = nome;
   }
   public String getNome(){
       return this.nome;
   }
   public void setId(int id){
       this.id = id;
   }
   public int getId(){
       return this.id;
   }
   public void setFabricacao(int fabricacao){
       this.fabricacao = fabricacao;
   }
   public int getFabricacao(){
       return this.fabricacao;
   }
   public void setValidade(int validade){
       this.validade = validade;
   }
   public int getValidade(){
       return this.validade;
   }
   
}
