/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author Lucas
 */
public class TesteReferencia {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        //Cliente cli1 = new Cliente();
        //c1.objCliente = cli1;
        
        c1.objCliente.setNome("Gabizinha!");
        //cli1.setNome("Gabizinha");
        c1.deposita(1000);
       
        System.out.println("Saldo da Conta: "+c1.getSaldo());
        //System.out.println("Cliente: "+cli1.getNome());
        System.out.println("Cliente: "+c1.objCliente.getNome());
        
        
    }
}
