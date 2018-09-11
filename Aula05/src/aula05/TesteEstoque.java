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
public class TesteEstoque {
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean veri, veri1,veri2;
        Estoque prod = new Estoque();
        Estoque prod1 = new Estoque();
        Estoque prod2 = new Estoque();
        Estoque prod3 = new Estoque();
        
        prod.setNomeProduto("Impressora Jato de tinta");
        prod.setUnidade(13);
        prod.setQtdMin(6);
        
        prod1.setNomeProduto("Monitor LCD 17 polegadas;");
        prod1.setUnidade(11);
        prod1.setQtdMin(13);
        
        prod2.setNomeProduto("Mouse óptico;");
        prod2.setUnidade(6);
        prod2.setQtdMin(2);
        
        prod3.setNomeProduto("Teclado;");
        prod3.setUnidade(10);
        prod3.setQtdMin(8);
        
        prod.setBaixa(5);
        prod1.setUnidade(7);
        prod2.setBaixa(4);
        
        veri = prod.verifica();
        veri1 = prod1.verifica();
        veri2 = prod2.verifica();
        
        if(veri){
            System.out.println("É preciso repor o estoque do produto 1");
        }else{
            System.out.println("Não é preciso repor o estoque do produto 1");
        }
        if(veri1){
            System.out.println("É preciso repor o estoque do produto 2");
        }else{
            System.out.println("Não é preciso repor o estoque do produto 2");
        }
        if(veri2){
            System.out.println("É preciso repor o estoque do produto 3");
        }else{
            System.out.println("Não é preciso repor o estoque do produto 3");
        }
        
        prod.getInfo();
        prod1.getInfo();
        prod2.getInfo();
    }
}
