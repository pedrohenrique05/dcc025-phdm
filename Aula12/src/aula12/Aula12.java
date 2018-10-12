/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Aula12 {

    /**
     * @param valor
     * @param args the command line arguments
     */
    
    public static void erro(String valor){
        try{
            int valorInt;
            valorInt  = Integer.parseInt(valor);
            
        }catch(NumberFormatException e){
           Scanner teste = new Scanner(System.in); 
           erro(teste.next());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("\n\n### SISCOM - Sistema Comercial de Controle de Compras e Vendas ###");
			System.out.println("\n                  =========================");
			System.out.println("                  |     1 - Venda         |");
			System.out.println("                  |     2 - Vendedor      |");
			System.out.println("                  |     3 - Compra        |");
			System.out.println("                  |     4 - Produto       |");
			System.out.println("                  |     5 - Cliente       |");
			System.out.println("                  |     6 - Fornecedor    |");
			System.out.println("                  |     0 - Sair          |");
			System.out.println("                  =========================\n");
			//opcao = Console.readInt("Opção -> ");
			System.out.print("\n");
        
        
        ArrayList<ObjetoTeste> remover = new ArrayList();
        ObjetoTeste obj1 = new ObjetoTeste();
        ObjetoTeste obj2 = new ObjetoTeste();
        ObjetoTeste obj3 = new ObjetoTeste();
        ObjetoTeste obj4 = new ObjetoTeste();
        ObjetoTeste obj5 = new ObjetoTeste();
        obj1.setInd();
        obj1.setNome(" 01");
        obj2.setInd();
        obj2.setNome(" 02");
        obj3.setInd();
        obj3.setNome(" 03");
        obj4.setInd();
        obj4.setNome(" 04");
        obj5.setInd();
        obj5.setNome(" 05");
        remover.add(obj1);
        remover.add(obj2);
        remover.add(obj3);
        remover.add(obj4);
        remover.add(obj5);
        System.out.println("Tamanho do ArrayList: "+remover.size());
        Object a;
        a = remover.indexOf(obj3);
        remover.remove(1);
        System.out.println("Tamanho do ArrayList: "+remover.size());
        /*
        for(int aux = 0 ; aux < remover.size(); aux++){
            remover.get(aux).getId();
            remover.get(aux).getNome();
        }
        remover.remove(obj2);
        System.out.println("Objeto removido");
        System.out.println("Tamanho do ArrayList: "+remover.size());
        for(int aux = 0 ; aux < remover.size(); aux++){
            remover.get(aux).getId();
            remover.get(aux).getNome();
        }*/
        obj5.recebeObjeto(remover.get(3));
        /*Scanner teste1 = new Scanner(System.in);
        erro(teste1.next());*/
        //erro(teste1.next());
    }
    
}
