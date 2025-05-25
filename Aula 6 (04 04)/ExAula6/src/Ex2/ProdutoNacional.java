/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class ProdutoNacional extends ProdutoEstadual{
    protected float taxa;
    
    public ProdutoNacional(String nome, float custo, float imposto, float taxa){
        super(nome, custo, imposto);
        this.taxa = 0.05f;
    }

    public float getTaxa() {
        return taxa;
    }
    
    @Override
    protected float calcularValor(){
        return (custo + (custo*imposto)+ (custo*taxa));
    }
    
    
}
