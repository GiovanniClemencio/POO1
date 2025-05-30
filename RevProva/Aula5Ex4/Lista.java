/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex4;

/**
 *
 * @author Portu
 */
public class Lista {
    protected int[] numeros;
    protected int tamanho;
    
    public Lista(int tamanhoTotal){
        numeros = new int[tamanhoTotal];
        this.tamanho = 0;
    }
    
    public void inserir(int valor){
        if(tamanho < numeros.length){
            numeros[tamanho++] = valor;
        }else{
            System.out.println("Lista cheia");
        }
    }
    
    public void remover(int valor){
        if(tamanho == 0){
            System.out.println("Lista vazia");
        }else{
            for(int i=0; i< tamanho ; i++){
                if(numeros[i] == valor){
                    for(int j = i; j < tamanho - 1; j++){
                        numeros[j] = numeros[j+1];
                    }
                    i = 100;
                    tamanho--; 
                }
            }
        }
    }
    
    public int quantosElementos(){
        return (tamanho);
    }
    
    public void exibirElemento(int posicaoAnalisada){
        System.out.println("Elemento na posicao "+ posicaoAnalisada +": "+ numeros[posicaoAnalisada]);
    }
    
}
