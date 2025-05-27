/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex1;

/**
 *
 * @author Portu
 */
public class PecaImportada extends Peca{
    private double taxaImportacao;
    private double frete;
    
    public PecaImportada(){
        super();
        this.taxaImportacao = 0;
        this.frete = 0;
    }
    
    public PecaImportada(String nome, double custo, double lucro, double taxaImportacao, double frete){
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.frete = frete;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public double getFrete() {
        return frete;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public double getCusto() {
        return custo;
    }
    
    @Override
    public double getLucro() {
        return lucro;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    @Override
    public void setLucro(double lucro) {
        this.lucro = lucro;
    }
    
    @Override
    public double calculaPreco(){
        return (custo + lucro + taxaImportacao + frete);
    }
    
    @Override
    public void exibir(){
        System.out.println("Produto Importado "+ nome +":");
        System.out.println("Custo: "+custo);
        System.out.println("Lucro: "+lucro);
        System.out.println("Taxa de importacao: "+taxaImportacao);
        System.out.println("Frete: "+frete);
        System.out.println("Valor Final: "+calculaPreco());
    }
}
