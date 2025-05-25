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
public class Principal {

    public static void main(String[] args) {
        Conta c = new Conta("1111", "Cliente 111");
        c.exibir();
        c.depositar(100);
        c.exibir();
        c.sacar(50);
        c.exibir();
        c.sacar(100);
        c.exibir();
        System.out.println("");
        
        System.out.println("CONTA ESPECIAL");
        c = new ContaEspecial("2222","Cliente 222", 200);
        c.exibir();
        c.depositar(100);
        c.exibir();
        c.sacar(50);
        c.exibir();
        c.sacar(100);
        c.exibir();
        System.out.println("");
    }
}
