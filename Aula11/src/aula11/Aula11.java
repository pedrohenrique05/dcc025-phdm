/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;
import java.util.ArrayList;
/**
 *
 * @author pedro
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro car = new Cachorro();
        car.comer("Ração");
        car.comer("Osso", 10);
        ArrayList <Animal> animal = new ArrayList();
        animal.add(new Gato());
        animal.add(new Cachorro());
        
        
        for(int i = 0 ; i < animal.size() ; i++){
            animal.get(i).tipo();
            animal.get(i).comer("Ração");
            animal.get(i).comer("Osso", i);
        }
        
        CachorroRobo robo = new CachorroRobo();
        robo.limpaPoeira();
    }
    
}
