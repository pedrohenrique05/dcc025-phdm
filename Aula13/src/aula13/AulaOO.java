/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author pedro
 */
public class AulaOO {
    public void chegarNaAula(int horario){
        if(horario > 19){
            throw new ChegarAtrasadoException("Você foi reprovado");
        }
    }

}