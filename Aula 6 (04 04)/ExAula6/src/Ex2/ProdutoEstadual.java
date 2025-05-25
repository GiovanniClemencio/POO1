/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

import java.util.logging.Logger;

/**
 *
 * @author Portu
 */
public class ProdutoEstadual extends Produto{
    protected float imposto;
    
    public ProdutoEstadual(){
    }
    
    public ProdutoEstadual(String nome, float custo, float imposto){
        super(nome, custo);
        this.imposto = 0.10f;
    }

    public float getImposto() {
        return imposto;
    }
    
    protected float calcularValor(){
        return(custo + (custo*imposto));
    }
    
    @Override
    public void relatorio(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        System.out.println("Imposto: "+imposto);
        System.out.println("Valor total: "+calcularValor());
    }
}
