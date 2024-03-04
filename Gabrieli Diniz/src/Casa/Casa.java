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
public class Casa {
    
    String cor;
    Porta p1;
    Porta p2;
    Porta p3;
    
    
        
    void pinta(String s){
        this.cor = s;
    }
    int quantasPortasEstaoAbertas(){
    int count=0;
    if(this.p1.aberta == true)
        count++;
    if(this.p2.aberta == true)
        count++;
    if(this.p3.aberta == true)
        count++;
    
    return count;
    }
}