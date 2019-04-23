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
 * Construtor da classe Leucocito, que chama o construtor da classe Celulas
 */
public class Leucocito extends Celulas{
    
    Celulas a = new Celulas();

	public Leucocito(int x, int y, int vel, String cor, boolean cell) { 
            super(x, y, vel, cor, cell);
	}

	Random direcao = new Random();

        /**
         * Função para movimentar o leucocito para posições aleatórias na Matriz
         */
	public void movimento(Leucocito vinl) {  
		desloc = direcao.nextInt(4);

		if(desloc == 0) {
			int x=vinl.getX();
			x=x+2;
			vinl.movX(modX(x));
		}
		if(desloc == 1) {
			int x=vinl.getX();
			x=x-2;
			vinl.movX(modX(x));
		}
		if(desloc == 2) {
			int y=vinl.getY();
			y=y+2;
			vinl.movY(modY(y));
		}
		if(desloc == 3) {
			int y=vinl.getY();
			y=y-2;
			vinl.movY(modY(y));
		}
	}
        
        /**
         * Funções para verificar se o leucócito chegou ao limite do mapa em X e Y
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
