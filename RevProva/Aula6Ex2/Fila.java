/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex2;

/**
 *
 * @author Portu
 */
public class Fila extends ED{
    private int cont;
    
    public Fila(int tamanho){
        super(tamanho);
        this.cont = 0;
    }
    
    @Override
    public void adicionar(int valor){
        if(cont < elementos.length){
            elementos[cont++] = valor;
        }else{
            System.out.println("Fila cheia");
        }
    }
    
    @Override
    public void remover(){
        int popped;
        if(cont > 0){
            popped = elementos[0];
            for(int i=0; i < cont - 1; i++){
                elementos[i] = elementos[i+1];
            }
            cont--;
            System.out.println("Elemento Removido: "+ popped);
        }else{
            System.out.println("Fila cheia");
        }
    }
}
