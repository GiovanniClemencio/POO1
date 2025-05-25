/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class Peca {
    protected String nome;
    protected float custo;
    protected float lucro;

    public Peca(String nome, float custo, float lucro) {
        this.nome = nome;
        this.custo = custo;
        this.lucro = lucro;
    }

    public Peca() {
    }

    public String getNome() {
        return nome;
    }

    public float getCusto() {
        return custo;
    }

    public float getLucro() {
        return lucro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }
    
    public float calcularPreco(){
        return custo+lucro;
    }
    
    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Custo: "+custo);
        System.out.println("Preco: "+calcularPreco());
        System.out.println("Lucro: "+lucro);
    }
    
}
