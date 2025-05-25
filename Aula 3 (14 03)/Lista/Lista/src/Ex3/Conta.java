/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author Portu
 */
public class Conta {
    private String numero;
    private String nome;
    private double saldo;
    
    public Conta(String numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    void depositar(double valor){
        if(valor>0){
            this.saldo = saldo + valor;
        }else{
            System.out.println("Valor de deposito invalido");
        }
    }
    
    void sacar(double valor){
        if(saldo > 0){
            this.saldo = saldo - valor;
        }else{
            System.out.println("Fundos insuficientes");
        }
    }
    
    double getSaldo(){
        return saldo;
    }
}
