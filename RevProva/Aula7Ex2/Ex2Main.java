/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula7Ex2;

/**
 *
 * @author Portu
 */
public class Ex2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro teste = new Livro(123, "Livro 1");
        
        teste.cadastrarCap("O inicio", 24);
        teste.cadastrarCap("O meio", 45);
        teste.cadastrarCap("O fim", 31);
        
        
        teste.relatorio();
        System.out.println("\n\n");
        
    }
    
}
