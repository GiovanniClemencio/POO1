/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class ContaCorrEspecial {
    private String numero;
    private String titular;
    private float saldo;
    private float limite;

    public ContaCorrEspecial() {
    }

    public ContaCorrEspecial(String numero, String titular, float saldo, float limite) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    public void exibir(){
        System.out.println("Numero: "+numero);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite da conta: "+limite);
    }
    
    public void depositar(float valor){
        saldo = saldo + valor;
    }
    
    public void saque(float valor){
        if(valor<= saldo+limite){
            saldo = saldo - valor;
        }else{
            System.out.println("Saldo insuficiente para saque");
        }
    }
}
