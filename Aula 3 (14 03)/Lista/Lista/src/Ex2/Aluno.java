/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class Aluno {
    public String nome;
    public int idade;
    public float peso;
    public float altura;
    
    public Aluno(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    boolean menorDeIdade(){
        if(idade<18){
            return true;
        }
        return false;
    }
    
    float imc(){
        return peso/(altura*altura);
    }
    
}
