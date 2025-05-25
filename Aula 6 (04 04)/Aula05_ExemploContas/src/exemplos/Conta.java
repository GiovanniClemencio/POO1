/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class Conta {
    private String numero;
    private String cliente;
    protected float saldo;

    public Conta() {
        saldo = 0;
    }

    public Conta(String numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        saldo = 0;
    }

    public void depositar(float valor){
        if (valor >=0){
            saldo = saldo + valor;
        }
    }
    
    public void sacar(float valor){
        if (valor>0){
            if (saldo-valor>=0){
                saldo = saldo - valor;
            }
        }
    }
    
    public void exibir(){
        System.out.println("Numero: "+numero);
        System.out.println("Cliente: "+cliente);
        System.out.println("Saldo: R$ "+saldo);
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }
}
