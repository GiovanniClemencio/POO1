/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex1;

/**
 *
 * @author Portu
 */
public class AlunoAcademia {
    private String identificador;
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public AlunoAcademia() {
    }
    
    public AlunoAcademia(String identificador, String nome, int idade, double peso, double altura){
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getIdentificador(){
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    
    public double getPeso(){
        return peso;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    private double calcularIMC(){
        double IMC;
        
        IMC = peso / (altura*altura);
        
        return IMC;
    }
    
    public void exibir(){
        System.out.println("Aluno "+ identificador +": ");
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+ altura);
        System.out.println("IMC: "+ calcularIMC());
    }
}
