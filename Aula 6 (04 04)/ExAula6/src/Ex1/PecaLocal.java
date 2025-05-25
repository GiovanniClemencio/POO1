/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class PecaLocal extends Peca{
    private float taxaCorreios;
    
    public PecaLocal(){
    }
    
    public PecaLocal(String nome, float custo, float lucro, float taxaCorreios){
        super(nome, custo, lucro);
        this.taxaCorreios = taxaCorreios;
    }

    public void setTaxaCorreios(float taxaCorreios) {
        this.taxaCorreios = taxaCorreios;
    }
    
    public float getTaxaCorreios(){
        return taxaCorreios;
    }
    
    @Override
    public float calcularPreco(){
        return (custo + lucro + taxaCorreios);
    }
    
    @Override
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        System.out.println("Preco: "+calcularPreco());
        System.out.println("Lucro: "+lucro);
        System.out.println("Taxa de entrega: "+taxaCorreios);
    }
}
