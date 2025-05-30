/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula6Ex2;

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

        //ED estrutura = new Pilha(10); //uma pilha com 10 posições
        //ED estrutura = new Fila(10); //uma fila com 10 posições
        ED estrutura = new FilaPrioritaria(10); //uma fila com prioridade com 10 posições
        estrutura.adicionar(10);
        estrutura.adicionar(5);
        estrutura.adicionar(7);
        estrutura.adicionar(2);
        estrutura.adicionar(4);

        estrutura.remover();
        estrutura.remover();
        estrutura.remover();
        estrutura.remover();
        estrutura.remover();
    }

}
