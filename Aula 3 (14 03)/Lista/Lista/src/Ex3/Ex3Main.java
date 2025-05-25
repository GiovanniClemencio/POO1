/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author Portu
 */
public class Ex3Main {
    public static void main(String[] args) {
        Conta ex = new Conta("1234", "Claudio", 1349.37);
        
        System.out.println("Saldo inicial: "+ex.getSaldo());
        
        ex.depositar(300.54);
        
        System.out.println("Saldo inicial: "+ex.getSaldo());
        
        ex.sacar(730.24);
        
        System.out.println("Saldo inicial: "+ex.getSaldo());
    }
}
