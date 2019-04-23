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
     * Construtor da classe Celulas
     */
public class Celulas {
    Random aleatorio = new Random();    


    /**
     * Construtor da classe Celulas
     */
    
    public Celulas() {      
        x = 0;
        y = 0; 
        vel = 0;
        cell = false; 
        cor = null; 
    }

    public Celulas(int x, int y, int vel, String cor, boolean cell) {
        this.x = x;
        this.y = y;
        this.vel = vel;
        this.cor = cor;
        this.cell = cell;
    }

    /**
     * Cria um valor aleatório para o X do celula
     */
    public int setX() {
        x = aleatorio.nextInt(28);
        return x;
    }

    /**
     * Altera o valor de X para cada celula
     */
    public void movX(int x) {
        this.x = x;
    }

    /**
     * Altera o valor de Y para cada celula
     */
    public void movY(int y) {
        this.y = y;
    }

    public int setY() {
        y = aleatorio.nextInt(58);
        return y;
    }
	
    public int getX() {
        return x;
    }
	
    public int getY() {
        return y;
    }
    
    /**
     * velocidade para cada celula
     */
    public int getVel() {
        return vel;
    }
    
    /**
     * cor para cada celula
     */
    public String getCor() {
        return cor;
    }
	
    public void setCell(boolean status) {
        cell = status;
    }
	
    public boolean getCell() {   
        return cell;
    }
	
private int x;
private int y;
private int vel;
private boolean cell;
private String cor;

}

