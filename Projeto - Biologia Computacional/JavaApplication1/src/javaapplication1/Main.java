/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author alansouza
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cabeca c = new Cabeca();
            c.criaGlobulos();
            c.criaVirus();
            c.criaSistema();
		
            int i = 0;
		
            while (i == 0) {
                c.updateSistema();
                Thread.sleep(300);  
            }
    }
    
}
