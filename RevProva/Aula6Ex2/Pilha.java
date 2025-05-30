/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex2;

/**
 *
 * @author Portu
 */
public class Pilha extends ED{
    private int cont;
    
    public Pilha(int tamanho){
        super(tamanho);
        this.cont = 0;
    }
    
    @Override
    public void adicionar(int valor){
        if(cont < elementos.length){
            elementos[cont++] = valor;
        }else{
            System.out.println("Pilha cheia!");
        }
        
    }
    
    @Override
    public void remover(){
        if(cont > 0){
            int popped = elementos[--cont];
            System.out.println("Elemento retirado: "+popped);
        }else{
            System.out.println("Pilha vazia");
        }
        
    }
}
