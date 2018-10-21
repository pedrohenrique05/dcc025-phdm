/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class A {
    public static void m1(){
        try {
            B.m2();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Deu algum erro!");
        }
    }
}
