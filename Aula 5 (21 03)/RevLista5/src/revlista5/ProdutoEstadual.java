/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revlista5;

/**
 *
 * @author Portu
 */
public class ProdutoEstadual extends Produto {
    public ProdutoEstadual(String nome, double custo){
        super(nome, custo);
        calcularValorFinal();
    }
    
    @Override
    public void exibir(){
        System.out.println("Nome do Produto: "+this.nome);
        System.out.println("Custo do Produto: "+this.custo);
        System.out.println("Valor final: "+this.valor);
        System.out.println("Tipo: Produto Estadual\n");
    }
    
    @Override
    protected void calcularValorFinal(){
        this.valor = (custo + (custo*imposto));
    }
}
