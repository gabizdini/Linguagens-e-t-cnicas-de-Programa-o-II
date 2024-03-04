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
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Rafael";
        p1.idade = 27;
        
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("Idade: "+p1.idade);
    }

}
