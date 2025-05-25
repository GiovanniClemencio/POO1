/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Portu
 */
public class Conta {
    private String numero;
    private String cliente;
    private double saldo;
    
    void setNumero(String numero){
        this.numero = numero;
    }
    
    void setCliente(String cliente){
        this.cliente = cliente;
    }
    
    void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    void depositar(double valor){
        if(valor>0){
            this.saldo = saldo + valor;
            System.out.println("Novo saldo: "+saldo);
        }else{
            System.out.println("Valor invalido");
        }
    }
    
    void sacar(double valor){
        if(saldo>0 && valor<=saldo){
            saldo = saldo - valor;
            System.out.println("Novo saldo: "+saldo);
        }else{
            System.out.println("Negado o saque - Saldo: "+saldo);
        }
    }
}
