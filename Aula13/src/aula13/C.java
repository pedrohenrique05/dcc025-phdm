/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author pedro
 */
public class C {

    /**
     *
     * @throws FileNotFoundException
     */
    public static void m4() throws FileNotFoundException{
        File arq = new File("Qualquer Coisa.txt");
       FileInputStream fi = new FileInputStream(arq);
    }
}
