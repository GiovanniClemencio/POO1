/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex3;

/**
 *
 * @author Portu
 */
public class ProdutoEstadual {
    private String nome;
    private double valor;
    private final double imposto; //final é da aula de constantes
    
    public ProdutoEstadual(){
        this.imposto = 0.1;
    }

    public ProdutoEstadual(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.imposto = 0.1;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void relatorio(){
        System.out.println("ProdutoE "+nome+":");
        System.out.println("Valor inicial: "+valor);
        System.out.println("Valor após taxas e impostos: "+(valor + (valor*imposto)));
    }
    
}
