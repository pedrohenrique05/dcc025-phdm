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
public class ChegarAtrasadoException extends RuntimeException{
    ChegarAtrasadoException(String msg){
        super(msg);
    }
}
//RunTimeException -  excessão não verificada.
//Exception há necessidade de verificação
//abaixo de throw não executa nenhum comando.