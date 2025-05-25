/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author Portu
 */
public class Estadual {
    private String descricao;
    private float valor;
    private float imposto;

    public Estadual(String descricao, float valor, float imposto) {
        this.descricao = descricao;
        this.valor = valor;
        this.imposto = imposto;
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

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    
}
