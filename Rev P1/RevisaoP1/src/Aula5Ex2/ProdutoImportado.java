/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex2;

/**
 *
 * @author Portu
 */
public class ProdutoImportado extends Produto {
    protected double taxa;
    protected double taxaImportacao;
    
    public ProdutoImportado(){
        super();
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;
    }
    
    public ProdutoImportado(String nome, double valor){
        super(nome, valor);
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
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

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
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
        total = total + (total * taxaImportacao);
        return total;
    }
    
    @Override
    public void exibir(){
        System.out.println("Produto "+ nome +":");
        System.out.println("Valor: "+ valor);
        System.out.println("Preco final: "+ calculaPreco());
        System.out.println("Imposto: "+ imposto);
        System.out.println("Taxa: "+ taxa);
        System.out.println("Taxa importacao: "+ taxaImportacao);
    }
}
