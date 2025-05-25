/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revlista5;

/**
 *
 * @author Portu
 */
public abstract class Produto {
    protected String nome;
    protected double custo;
    protected double valor;
    protected final double imposto;
    
    public Produto(){
        this.imposto = 0.1;
    }
    
    public Produto(String nome, double custo){
        this.imposto = 0.1;
        this.nome = nome;
        this.custo = custo;
    }
    
    public abstract void exibir();
    
    protected abstract void calcularValorFinal();
}
