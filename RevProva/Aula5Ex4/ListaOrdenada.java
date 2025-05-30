/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex4;

/**
 *
 * @author Portu
 */
public class ListaOrdenada extends Lista{
    
    public ListaOrdenada(int tamanhoTotal){
        super(tamanhoTotal);
    }
    
    @Override
    public void inserir(int valor){
        if(tamanho == numeros.length){
            System.out.println("Lista ordenada cheia");
            return;
        }
        
        int buscador = 0;
        for(int i=0 ; i < tamanho; i++){
            if(numeros[i] < valor){
                buscador++;
            }
        }
        if(buscador == tamanho && numeros[buscador] > valor){
            numeros[tamanho++] = valor;
        }else{
            for(int i = tamanho; i > buscador; i--){
                numeros[i] = numeros[i-1];
            }
            numeros[buscador] = valor;
            tamanho++;
        }
    }
}

