/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
/**
 *
 * @author alansouza
 */

/**
     * Classe Cabeça
     */

public class Cabeca {
    
    /**
     * Instanciando as classes 
     */
    
    Celulas a = new Celulas();
    Virus b = new Virus();
    
    ArrayList <Leucocito> globs = new ArrayList<>();
    ArrayList <Influenza> gripe = new ArrayList<>();
   
    /**
     * Gerando a Cabeça
     */
    public int mapa[][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    /**
     * Função que gera Leucocitos aleatóriamente
     */
    public void criaGlobulos(){
        for(int i=0;i<10;i++){
            globs.add(new Leucocito((a.setX()+1), (a.setY()+1), 2, "amarelo", false));
            while(mapa[globs.get(i).getX()][globs.get(i).getY()] == 2){
                globs.get(i).setX();
                globs.get(i).setY();
            }
        }
    }

    /**
     * Função que gera Influenza aleatóriamente
     */
    public void criaVirus(){
        for(int i=0;i<5;i++){
            gripe.add(new Influenza((b.setX()+1), (b.setY()+1), 1, "azul", false));
            while(mapa[gripe.get(i).getX()][gripe.get(i).getY()] == 2){
                gripe.get(i).setX();
                gripe.get(i).setY();
            }
        }
    }
    
    /**
     * Função que refaz o sistema do zero
     */
    public void rmCabeca(){
        for(int i=0;i<30;i++){
            for(int j=0;j<60;j++){
                if(mapa[i][j] !=1 && mapa[i][j] !=2){
                    mapa[i][j] = 0;
                }
            }
        }
        
        /**
	 * Adicionando os novos leucocitos a cabeça
	 */
        
        
        for (int c=0;c<globs.size();c++){
            int xa = globs.get(c).getX();
            int ya = globs.get(c).getY();
            
            for(int i=0;i<30;i++){
                for(int j=0;j<60;j++){
                    if(i==xa && j==ya){
                        if(mapa[i][j] == 2){
                            mapa[i][j] = 2;
                        }
                        else{
                            mapa[i][j] = 3;
                        }
                    }
                }
            }
        }
        
        /**
	 * Adicionando os novos virus a cabeça
	 */
        
        
        for (int d=0;d<gripe.size();d++){
            int ba = gripe.get(d).getX();
            int ca = gripe.get(d).getY();
            
            for(int i=0;i<30;i++){
                for(int j=0;j<60;j++){
                    if(i==ba && j==ca){
                        if(mapa[i][j] == 2){
                            mapa[i][j] = 2;
                        }
                        else{
                            mapa[i][j] = 4;
                        }
                    }
                }
            }
        }
        
    }
    
    /**
     * Função que desenha a cabeça, exibindos os contadores com suas respectivas cores
     */
    public void criaSistema(){
        int leucocitos = 0;
        int influenzas = 0;
        
            for(int i=0;i<30;i++){
                for(int j=0; j<60;j++){
                    if(mapa[i][j] == 1) {
			System.out.print("\u001b[47m \033[0m");
                    }
                    else if(mapa[i][j] == 0) {
			System.out.print(" ");
                    }
                    else if(mapa[i][j] == 2) {
			System.out.print("\u001b[42m \033[0m");
                    }
                    else if(mapa[i][j] == 3){
			System.out.print("\u001b[44m \033[0m");
                    }
                    else if(mapa[i][j] == 4){
			System.out.print("\u001b[43;1m \033[0m");
                    }  
                }
                System.out.println("");
            }
            System.out.print("\u001b[44m \033[0m");
            System.out.print(" leucocitos   ");
            System.out.print("\u001b[43;1m \033[0m");
            System.out.print(" influenzas   ");
    
            for(int a=0; a< globs.size(); a++) {
		leucocitos++;
            }
            for(int b=0; b< gripe.size(); b++) {
		influenzas++;
            }
            System.out.println("Número de leucocitos: " + leucocitos);
            System.out.println("Número de influenza: " + influenzas);
    }

    /**
     * Função que realiza as movimentações dos leucocitos e virus
     */
    public void updateSistema(){
        for(int i=0; i<globs.size(); i++){
            globs.get(i).movimento(globs.get(i));
        }
        for(int i=0; i<gripe.size(); i++){
            gripe.get(i).movimento(gripe.get(i));
        }
    
        criaMVirus();
	ckCura();
	rmCabeca();
	criaSistema();
        
    }
    
    /**
     * Função que realiza a "cura" quando um leucocito encontra um virus
     */
    public void ckCura(){
        for(int i=0; i<globs.size(); i++){
            for(int j=0; j<gripe.size(); j++){
                if(gripe.get(j).getX() == globs.get(i).getX() && gripe.get(j).getY() == globs.get(i).getY()){
                    if(globs.size()>gripe.size()){
                    }
                    else{
                        gripe.remove(gripe.get(i));
                        globs.add(new Leucocito((a.setX()+1), (a.setY()+1), 2, "verde", false));
                    }
                }
            }
        }
    }

    /**
     * Função que cria um virus quando o mesmo passa em alguma celula
     */
    public void criaMVirus() {
	for(int c=0; c<gripe.size();c++) {
            int x = gripe.get(c).getX();
            int y = gripe.get(c).getY();
		for(int i = 0; i < 30; i ++) {
                    for(int j = 0; j < 60; j++) {
			if(i == x && j == y) {
                            if(mapa[i][j] == 2 && gripe.get(c).getCell() == false) {
				gripe.get(c).setCell(true); 
				gripe.add(new Influenza((b.setX()+1), (b.setY()+1), 2, "verde", false));
                            }
			}
                    }
		}
	}
    }
    
}
