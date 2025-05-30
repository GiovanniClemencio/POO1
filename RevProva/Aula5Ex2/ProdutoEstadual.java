/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex2;

/**
 *
 * @author Portu
 */
public class ProdutoEstadual extends Produto {
    
    public ProdutoEstadual(){
        super();
    }
    
    public ProdutoEstadual(String nome, double valor){
        super(nome, valor);
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

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
}
