/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex1;

/**
 *
 * @author Portu
 */
public class Peca {
    protected String nome;
    protected double custo;
    protected double lucro;
    
    public Peca(){
        
    }
    
    public Peca(String nome, double custo, double lucro){
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }
    
    public String getNome(){
        return nome;
    }

    public double getCusto() {
        return custo;
    }

    public double getLucro() {
        return lucro;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
    
    public double calculaPreco(){
        return (custo + lucro);
    }
    
    public void exibir(){
        System.out.println("Produto "+ nome +":");
        System.out.println("Custo: "+custo);
        System.out.println("Lucro: "+lucro);
        System.out.println("Preco final: "+ calculaPreco());
    }
}
