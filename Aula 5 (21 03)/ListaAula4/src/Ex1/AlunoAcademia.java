/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class AlunoAcademia {
    private String identificador;
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public void exibir(){
        System.out.println("Identificador: "+identificador);
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
    
    public float calcularIMC(){
        float IMC = peso/(altura * altura);
        return IMC;
    }
    
    public AlunoAcademia(String identificador, String nome, int idade, float peso, float altura) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public AlunoAcademia() {
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    

    
    
    
}
