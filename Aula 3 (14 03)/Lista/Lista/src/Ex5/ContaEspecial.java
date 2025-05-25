/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5;

/**
 *
 * @author Portu
 */
public class ContaEspecial {
    private String titular;
    private float saldo;
    private float limite;
    
    public ContaEspecial(){}
    
    public ContaEspecial(String titular, float saldo, float limite){
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    void setTitular(String titular){
        this.titular = titular;
    }
    
    void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    void setLimite(float limite){
        this.limite = limite;
    }
    
    String getTitular(){
        return titular;
    }
    
    float getSaldo(){
        return saldo;
    }
    
    float getLimite(){
        return limite;
    }
    
    void imprimeConta(){
        System.out.println("Titular: "+titular+"\nSaldo: "+saldo+"\nLimite: "+limite);
    }
    
    void depositar(float valor){
        if(valor>=0)
            saldo = saldo + valor;
    }
    
    void sacar(float valor){
        if(valor<= (saldo + limite))
            saldo = saldo - valor;
        else{
            System.out.println("Saldo insuficiente para saque");
        }
    }
}
