/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author Portu
 */
public class Nacional {
    private String descricao;
    private float valor;
    private float imposto;
    private float taxa;

    public Nacional(String descricao, float valor, float imposto, float taxa) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
        this.taxa = taxa;
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
    
    
}
