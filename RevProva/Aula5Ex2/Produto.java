/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex2;

/**
 *
 * @author Portu
 */
public class Produto {
    protected String nome;
    protected double valor;
    protected double imposto;
    
    public Produto(){
        this.imposto = 0.1;
    }
    
    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
        this.imposto = 0.1;
    }
    
    public double calculaPreco(){
        return (valor + (valor*imposto));
    }
    
    public void exibir(){
        System.out.println("Produto "+ nome +":");
        System.out.println("Valor: "+ valor);
        System.out.println("Preco final: "+ calculaPreco());
        System.out.println("Imposto: "+ imposto);
    }
}
