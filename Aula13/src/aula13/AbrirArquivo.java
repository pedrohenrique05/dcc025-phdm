package aula13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class AbrirArquivo {
   public void abrirArquivoo() throws FileNotFoundException{
       File arq = new File("Qualquer Coisa.txt");
       FileInputStream fi = new FileInputStream(arq);
       //arq.
   } 
}


/*
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AbrirArquivo {
   public void abrirArquivoo(){
       File arq = new File("Qualquer Coisa.txt");
       try {
           FileInputStream fi = new FileInputStream(arq);
           //arq.
       } catch (FileNotFoundException ex) {
           Logger.getLogger(AbrirArquivo.class.getName()).log(Level.SEVERE, null, ex);
       }
   } 
}

*/
