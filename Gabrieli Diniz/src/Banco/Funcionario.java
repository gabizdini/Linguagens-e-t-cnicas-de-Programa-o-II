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
public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;
    boolean ativo;

    void bonifica(double aumento){
        if (this.ativo == true){
            this.salario= this.salario + aumento;
            System.out.println("Aumento aplicado com sucesso!");
        }else
            System.out.println("Não é possível aumantar o salário de um não-funcionário");
    }
    
    void demite(){
        if (this.ativo == true){
            this.ativo = false;
            System.out.println("Demissão concluída!");
        }else
            System.out.println("Impossível demitir esse funcionário. Já está com cadastro inativo!");
        
    }
    
    void mostra(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("RG: " + this.rg);
        System.out.println("Data de Entrada: " + this.dataEntrada);
        System.out.println("Situação: " + this.ativo);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
