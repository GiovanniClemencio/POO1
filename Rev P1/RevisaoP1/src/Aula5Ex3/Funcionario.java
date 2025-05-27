/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex3;

/**
 *
 * @author Portu
 */
public class Funcionario {
    protected String cod;
    protected String nome;
    protected double salario;
    
    public Funcionario(){
        this.salario = 0;
    }
    
    public Funcionario(String cod, String nome, double salario){
        this.cod = cod;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void exibir(){
        System.out.println("Funcionario "+ cod +":");
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
}
