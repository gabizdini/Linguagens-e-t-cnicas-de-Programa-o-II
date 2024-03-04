/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

public class Programa {
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        
        //minhaConta.cliente = "gabizinha"; // enviando valor para o atributo no objeto
        //minhaConta.setCliente("Gabizinha");
        
        //minhaConta.saldo = minhaConta.saldo - 1000.0;
        minhaConta.setLimite(20000);
        minhaConta.deposita(1000);
        minhaConta.saca(2000);
        
        

        System.out.println("Saldo atual: " + minhaConta.getSaldo());
    }
}
