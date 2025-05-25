/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex6;

/**
 *
 * @author Portu
 */
public class Eletrodomestico {
    private String nome;
    private float potencia;
    private float tempoDeUtilizacao;
    
    public Eletrodomestico(){};
    
    public Eletrodomestico(String nome, float potencia, float tempo){
        this.nome = nome;
        this.potencia = potencia;
        tempoDeUtilizacao = tempo;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setPotencia(float potencia){
        this.potencia = potencia;
    }
    
    void setTempo(float tempo){
        tempoDeUtilizacao = tempo;
    }
    
    String getNome(){
        return nome;
    }
    
    float getPotencia(){
        return potencia;
    }
    
    float getTempo(){
        return tempoDeUtilizacao;
    }
    
    float wattsDia(){
        return potencia*tempoDeUtilizacao;
    }
    
    float wattsMes(){
        return (wattsDia() * 30);
    }
    
    float wattsAno(){
        return (wattsMes() * 12);
    }
    
    float gastosMes(float precoKwatts){
        return (wattsMes()/1000)*precoKwatts;
    }
}
