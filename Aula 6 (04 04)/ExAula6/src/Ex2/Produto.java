/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class Produto {
    protected String nome;
    protected float custo;

    public Produto() {
    }
    
    public Produto(String nome, float custo){
        this.nome = nome;
        this.custo = custo;
    }
    
    public void relatorio(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
    public String getNome(){
        return nome;
    }

    public float getCusto() {
        return custo;
    }
    
    
}


