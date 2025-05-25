/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex5;

/**
 *
 * @author Portu
 */
public class Ex5Main {
    public static void main(String[] args) {
        ContaEspecial test1 = new ContaEspecial();
        
        test1.setTitular("Amanda");
        test1.setSaldo(1300.50f);
        test1.setLimite(500.43f);
        
        ContaEspecial test2 = new ContaEspecial("Claudio",1539.45f, 200f);
        
        test1.imprimeConta();
        test2.imprimeConta();
        
        test2.depositar(33.33f);
        
        System.out.println("Saldo da segunda conta: "+test2.getSaldo());
        
        test2.sacar(30343.34f);
        
        test2.sacar(1700.12f);
        
        System.out.println("Saldo da segunda conta: "+test2.getSaldo());
    }
}
