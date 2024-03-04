/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Lucas
 */
public class Porta {
    boolean aberta;
    String cor;
    int dX, dY, dZ;
    
    void dimensao(int x,int y,int z){
        this.dX = x;
        this.dY = y;
        this.dZ = z;
    }
    void abre(){
        this.aberta = true;
    }
    void fecha(){
        this.aberta = false;
    }
    void pinta(String s){
        this.cor = s;
    }
    
    boolean estaAberta(){
        return this.aberta;
    }
    
}
