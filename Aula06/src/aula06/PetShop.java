/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class PetShop {
    
    public Cachorro vendaCachorro(Cachorro cac){
        System.out.print("Nome: ");
        cac.getNome();
        System.out.print(" ; Raça: ");
        cac.getRaca();
        System.out.print(" ; Idade: ");
        cac.getIdade();
        return cac.venderCachorro();
    }
    public Cachorro adcCachorro(){
        
        System.out.println("Nome: ");
        Scanner nome1 = new Scanner(System.in);
        String nome = nome1.next();
        //cac.setNome(nome);
        
        System.out.println("Raça: ");
        Scanner raca1 = new Scanner(System.in);
        String raca = raca1.next();
        //cac.setRaca(raca);
        
        System.out.println("Idade: ");
        Scanner idade1 = new Scanner(System.in);
        int idade = idade1.nextInt();
        //cac.setIdade(idade);
        
        Cachorro cac = new Cachorro(nome,raca,idade);
        return cac;
    }
    public int numCacPet(Cachorro cac){
        return cac.qtdCac;
    }
   
}
