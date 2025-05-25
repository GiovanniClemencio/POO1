/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4;

/**
 *
 * @author Portu
 */
public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Relogio(){}
    
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    void setHora(int hora){
        this.hora = hora;
    }
    
    void setMin(int minuto){
        this.minuto = minuto;
    }
    
    void setSeg(int segundo){
        this.segundo = segundo;
    }
    
    int getHora(int hora){
        return hora;
    }
    
    int getMin(int minuto){
        return minuto;
    }
    
    int getSeg(int segundo){
        return segundo;
    }
    
    void exibir(){
        System.out.println(hora+" : "+minuto+" : "+segundo);
    }
    
    int calcularSegundos(){
        int soma = segundo;
        soma = soma + (60 * minuto);
        soma = soma + (60 * (60 * hora));
        
        return soma;
    }
}
