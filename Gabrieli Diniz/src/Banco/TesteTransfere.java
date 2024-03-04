/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

public class TesteTransfere {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta outraConta = new Conta();
        
        minhaConta.deposita(1000);
        outraConta.deposita(1000);
        
        minhaConta.transfere(outraConta, 5000);
        System.out.println("Saldo minha conta: "+ minhaConta.getSaldo());
        System.out.println("Saldo outra conta: "+ outraConta.getSaldo());
    }
}
