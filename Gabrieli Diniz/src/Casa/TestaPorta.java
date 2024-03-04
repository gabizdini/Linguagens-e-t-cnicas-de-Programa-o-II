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
public class TestaPorta {
    public static void main(String[] args) {
        Porta porta1 = new Porta ();
        porta1.abre();
        porta1.fecha();
        porta1.pinta("Caramelo");
        porta1.pinta("Vermelho");
        porta1.pinta("Azul");
        porta1.pinta("Amarelo");
        porta1.dimensao(200, 80, 14);
        
        System.out.println("Cor: "+porta1.cor);
        System.out.println("Situação: "+porta1.estaAberta());
        System.out.println("Dimensão X: "+porta1.dX +"\nDimensão Y: "+porta1.dY+"\nDimensão Z: "+porta1.dZ);
    }
}
