/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;

/**
 *
 * @author alansouza
 */

/**
 * Construtor da classe Influenza, que chama o construtor da classe Virus
 */

public class Influenza extends Virus{
    
    Virus b = new Virus();

	public Influenza(int x, int y, int vel, String cor, boolean cell) { 
            super(x, y, vel, cor, cell);
	}

	Random direcao = new Random();

        /**
         * Função para movimentar o influenza para posições aleatórias na Matriz
         */
	public void movimento(Influenza vinv) {  
		desloc = direcao.nextInt(4);

		if(desloc == 0) {
			int x=vinv.getX();
			x=x+1;
			vinv.movvX(modX(x));
		}
		if(desloc == 1) {
			int x=vinv.getX();
			x=x-1;
			vinv.movvX(modX(x));
		}
		if(desloc == 2) {
			int y=vinv.getY();
			y=y+1;
			vinv.movvY(modY(y));
		}
		if(desloc == 3) {
			int y=vinv.getY();
			y=y-1;
			vinv.movvY(modY(y));
		}
	}
        
        /**
         * Funções para verificar se o influenza chegou ao limite do mapa em X e Y
         */
	public int modX(int x) {    
		if (x>=29) {
			x=1;
		}
		if(x<=0) {
			x=28;
		}
		return x;
	}
	public int modY(int y) {   
		if (y>=59) {
			y=1;
		}
		if(y<=0) {
			y=58;
		}
		return y;
	}
	private int desloc;
    
}
