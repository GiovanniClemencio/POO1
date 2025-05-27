/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex4;

import java.util.Scanner;
/**
 *
 * @author Portu
 */
public class Ex4Sys {
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        int seletor;
        
        System.out.println("MENU");
        System.out.println("1- Inserir um numero na lista nao ordenada");
        System.out.println("2- Inserir um numero na lista ordenada");
        System.out.println("3- Remover um numero da lista nao ordenada");
        System.out.println("4- Remover um numero da lista ordenada");
        System.out.println("5- Dizer quantos elementos tem na lista nao ordenada");
        System.out.println("6- Dizer quantos elementos tem na lista ordenada");
        System.out.println("7- Exibir o valor em uma posicao na lista nao ordenada");
        System.out.println("8- Exibir o valor em uma posicao na lista ordenada");
        System.out.println("9- Exibir todos os elementos da lista nao ordenada");
        System.out.println("10- Exibir todos os elementos da lista nao ordenada");
        System.out.println("11- Sair");
        
        seletor = Integer.parseInt(sc.nextLine());
        return seletor;
    }
    
    public void executar(){
        int seletor = 0,
                leitor;
        Lista naoOrdenada = new Lista(5);
        ListaOrdenada ordenada = new ListaOrdenada(5);
        
        while(seletor != 99){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    leitor = Integer.parseInt(sc.nextLine());
                    naoOrdenada.inserir(leitor);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser inserido: ");
                    leitor = Integer.parseInt(sc.nextLine());
                    ordenada.inserir(leitor);
                    break;
                case 3:
                    System.out.print("Digite o valor a ser removido: ");
                    leitor = Integer.parseInt(sc.nextLine());
                    naoOrdenada.remover(leitor);
                    break;
                case 4:
                    System.out.print("Digite o valor a ser removido: ");
                    leitor = Integer.parseInt(sc.nextLine());
                    ordenada.remover(leitor);
                    break;
                case 5:
                    System.out.println("Tamanho da lista nao ordenada: "+naoOrdenada.tamanho);
                    break;
                case 6:
                    System.out.println("Tamanho da lista ordenada: "+ordenada.tamanho);
                    break;
                case 7:
                    System.out.print("Digite a posicao a ser verificada: ");
                    leitor = Integer.parseInt(sc.nextLine());
                    System.out.println("Valor: "+naoOrdenada.numeros[leitor]);
                    break;
                case 8:
                    System.out.print("Digite a posicao a ser verificada: ");
                    leitor = Integer.parseInt(sc.nextLine());
                    System.out.println("Valor: "+ordenada.numeros[leitor]);
                    break;
                case 9:
                    System.out.print("Lista nao ordenada: ");
                    for(int i= 0; i< naoOrdenada.tamanho; i++){
                        System.out.print(naoOrdenada.numeros[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 10:
                    System.out.print("Lista ordenada: ");
                    for(int i= 0; i< ordenada.tamanho; i++){
                        System.out.print(ordenada.numeros[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 11:
                    seletor = 99;
                    break;
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }
    }
}
