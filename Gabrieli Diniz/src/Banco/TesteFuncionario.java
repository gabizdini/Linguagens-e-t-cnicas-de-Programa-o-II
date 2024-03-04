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
public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        
        func1.nome = "Julius";
        func1.salario = 1000.0;
        func1.departamento ="Financeiro";
        func1.rg = "MG-18.915.531";
        func1.dataEntrada = "04/03/2024";
        func1.ativo = true;
        
        func1.bonifica(200.0);
        func1.demite();
        func1.mostra();
    }
}
