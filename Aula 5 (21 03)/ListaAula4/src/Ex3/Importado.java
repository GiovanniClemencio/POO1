/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author Portu
 */
public class Importado {
    private String descricao;
    private float valor;
    private float imposto;
    private float taxa;
    private float taxaImportacao;

    public Importado(String descricao, float valor, float imposto, float taxa, float taxaImportacao) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
        this.taxa = taxa;
        this.taxaImportacao = taxaImportacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public float getImposto() {
        return imposto;
    }

    public float getTaxa() {
        return taxa;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    
    
}
