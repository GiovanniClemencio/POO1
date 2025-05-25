/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class Utilidade {
    public static float media(float vetor[]){
        float soma = 0;
        for(int i=0; i< vetor.length; i++){
            soma += vetor[i];
        }
        
        return (soma/vetor.length);
    }
    
    public static float soma(float vetor[]){
        float soma = 0;
        for(int i=0; i< vetor.length; i++){
            soma += vetor[i];
        }
        
        return soma;
    }
    
    public static float maior(float vetor[]){
        float maior = 0;
        
        for(int i=0; i< vetor.length; i++){
            if(i == 0 || vetor[i] > maior){
                maior = vetor[i];
            }
        }
        
        return maior;
    }
    
    public static float menor(float vetor[]){
        float menor = 0;
        
        for(int i=0; i< vetor.length; i++){
            if(i == 0 || vetor[i] < menor){
                menor = vetor[i];
            }
        }
        
        return menor;
    }
    
    public static int max(int A, int B){
        if(A > B){
            return A;
        }
        return B;
    }
}
