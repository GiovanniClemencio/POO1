/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex2;

/**
 *
 * @author Portu
 */
public class ProdutoNacional extends Produto{
    protected double taxa;
    
    public ProdutoNacional(){
        super();
        this.taxa = 0.05;
    }
    
    public ProdutoNacional(String nome, double valor){
        super(nome, valor);
        this.taxa = 0.05;
    }

    public double getTaxa() {
        return taxa;
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

    public void setTaxa(double taxa) {
        this.taxa = taxa;
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
    
    @Override
    public double calculaPreco(){
        double total;
        total = valor + (valor * imposto);
        total = total + (total * taxa);
        return total;
    }
    
    @Override
    public void exibir(){
        System.out.println("Produto "+ nome +":");
        System.out.println("Valor: "+ valor);
        System.out.println("Preco final: "+ calculaPreco());
        System.out.println("Imposto: "+ imposto);
        System.out.println("Taxa: "+ taxa);
    }
}
