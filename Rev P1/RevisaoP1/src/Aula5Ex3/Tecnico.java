/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex3;

/**
 *
 * @author Portu
 */
public class Tecnico extends Funcionario{
    protected int nivel;
    
    public Tecnico(){
        super();
        this.nivel = 0;
    }
    
    public Tecnico(String cod, String nome, double salario, int nivel){
        super(cod, nome, salario);
        this.nivel = nivel;
    }
    
    public int getNivel() {
        return nivel;
    }

    @Override
    public String getCod() {
        return cod;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void exibir(){
        System.out.println("Tecnico "+ cod +":");
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
        System.out.println("Nivel: "+nivel);
    }
}
