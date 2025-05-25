/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Sistema {
    private Scanner sc = new Scanner(System.in);
    
    private float vetor[] = {1.7f, 2.0f, 3.82f, 8.12f};
    
    private int menu(){
        int seletor;
        System.out.println("1- Calcule a media do vetor");
        System.out.println("2- Calcule a soma do vetor");
        System.out.println("3- Encontre o maior numero do vetor");
        System.out.println("4- Encontre o menor numero do vetor");
        System.out.println("5- Encontre o maior detre dois valores");
        System.out.println("6- Sair");
        System.out.print("Selecione: ");
        
        seletor = sc.nextInt();
        sc.nextLine();
        
        return seletor;
    }
    
    public void executar(){
        int seletor = 0;
        float resposta;
        
        while(seletor != 9){
            seletor = menu();
            
            switch(seletor){
                case 1:
                    resposta = Utilidade.media(vetor);
                    System.out.println("Vetor: ");
                    for(int i=0; i< vetor.length; i++){
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.println("Media: "+ resposta);
                    break;
                case 2:
                    resposta = Utilidade.soma(vetor);
                    System.out.println("Vetor: ");
                    for(int i=0; i< vetor.length; i++){
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.println("Soma: "+ resposta);
                    break;
                case 3:
                    resposta = Utilidade.maior(vetor);
                    System.out.println("Vetor: ");
                    for(int i=0; i< vetor.length; i++){
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.println("Maior: "+ resposta);
                    break;
                case 4:
                    resposta = Utilidade.menor(vetor);
                    System.out.println("Vetor: ");
                    for(int i=0; i< vetor.length; i++){
                        System.out.print(vetor[i]+" ");
                    }
                    System.out.println("Menor: "+ resposta);
                    break;
                case 5:
                    int A, B;
                    System.out.print("Digite o primeiro valor inteiro: ");
                    A = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite o segundo valor inteiro: ");
                    B = sc.nextInt();
                    sc.nextLine();
                
                    resposta = Utilidade.max(A, B);
                    
                    System.out.println("Maior valor dentre "+ A + " e "+ B + " : "+resposta);
                    break;
                case 6:
                    seletor = 9;
                    break;
                default:
                    System.out.println("Entrada Invalida");
                    break;
            }
        }
    }
}
