/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revlista5;

/**
 *
 * @author Portu
 */
public class ProdutoImportado extends Produto{
    private final double taxa;
    private final double taxaImportacao;
    
    public ProdutoImportado(String nome, double custo){
        super(nome, custo);
        this.taxa = 0.05;
        this.taxaImportacao = 0.05;
        calcularValorFinal();
    }
    
    @Override
    public void exibir(){
        System.out.println("Nome do Produto: "+this.nome);
        System.out.println("Custo do Produto: "+this.custo);
        System.out.println("Valor final: "+this.valor);
        System.out.println("Tipo: Produto Importado\n");
    }
    
    @Override
    protected void calcularValorFinal(){
        this.valor = custo + (custo*imposto);
        this.valor = valor + (valor*taxa);
        this.valor = valor + (valor*taxaImportacao);
    }
}
