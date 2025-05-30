/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex3;

/**
 *
 * @author Portu
 */
public class ProdutoImportado {
    private String nome;
    private double valor;
    private final double imposto; //final é da aula de constantes
    private final double taxa;
    private final double taxaImportacao;

    public ProdutoImportado() {
        this.imposto = 0.1;
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;
    }

    public ProdutoImportado(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.imposto = 0.1;
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;
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

    public double getTaxa() {
        return taxa;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void relatorio(){
        double total = valor;
        System.out.println("ProdutoN "+nome+":");
        System.out.println("Valor inicial: "+valor);
        total = total + (total*imposto);
        total = total + (total*taxa);
        total = total + (total*taxaImportacao);
        System.out.println("Valor após taxas e impostos: "+total);
    }
}
