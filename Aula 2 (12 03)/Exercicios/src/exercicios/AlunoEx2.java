/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Portu
 */
public class AlunoEx2 {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    void ehMenor(){
        if(idade<18){
            System.out.println(nome+" Menor de idade ("+idade+")");
        }else{
            System.out.println(nome+" Maior de idade");
        }
    }
    
    float imc(){
        float valor = peso/(altura * altura);
        System.out.println("IMC: "+valor);
        return valor;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setIdade(int idade){
        this.idade = idade;
    }
    
    void setPeso(float peso){
        this.peso = peso;
    }
    
    void setAltura(float altura){
        this.altura = altura;
    }
}
