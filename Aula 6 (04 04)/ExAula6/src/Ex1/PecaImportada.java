/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;
    
    @Override
    public float calcularPreco(){
        return (taxaImportacao + taxaFrete + custo + lucro);
    }

    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public PecaImportada() {
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }
    
    @Override
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        System.out.println("Preco: "+calcularPreco());
        System.out.println("Lucro: "+lucro);
        System.out.println("Taxa de importacao: "+taxaImportacao);
        System.out.println("Taxa de frete: "+taxaFrete);
    }
}
