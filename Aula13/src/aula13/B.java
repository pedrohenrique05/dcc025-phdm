/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.io.FileNotFoundException;

/**
 *
 * @author pedro
 */
public class B {
    public static void m2() throws FileNotFoundException{
        m3();
        try{
            m3();
        }catch(ChegarAtrasadoException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void m3() throws FileNotFoundException, ChegarAtrasadoException{
        //C.m4();
        AulaOO aulaOO = new AulaOO();
        aulaOO.chegarNaAula(12);
        
    }
    public static void chegarAtradado(){
        
    }
}
