/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Portu
 */
public class Lista {
    
    private int[] vetor;
    private int cont;
    
    void inicializar(int tamanho){
        vetor = new int[tamanho];
        cont = 0;
    }
    
    boolean estaVazia(){
        if(cont == 0){
            return true;
        }else{
            return false;
        }
    }
    
    void add(int elemento){
        vetor[cont++] = elemento;
    }
    
    int buscar(int elemento){
        int cont2=0;
        while(cont2 <= cont){
            if(elemento == vetor[cont2]){
                return cont2;
            }
            cont2++;
        }
        System.out.println("Entrada nao encontrada");
        return -1;
    }
    
    void remover(int elemento){
        int posicao = buscar(elemento);
        if(posicao == -1){
            return;
        }
        
        while(posicao<= cont){
            vetor[posicao++] = vetor[posicao];
        }
    }
    
}
