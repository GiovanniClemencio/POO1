/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex2;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Ex2Sys {
    Produto[] vetor;
    Scanner sc = new Scanner(System.in);
    
    private int menu(){
        int seletor;
        
        System.out.println("MENU");
        System.out.println("1- Cadastrar Produto Estadual");
        System.out.println("2- Cadastrar Produto Nacional");
        System.out.println("3- Cadastrar Produto Importado");
        System.out.println("4- Exibir Produtos Estaduais");
        System.out.println("5- Exibir Produtos Nacionais");
        System.out.println("6- Exibir Produtos importados");
        System.out.println("7- Exibir todos os Produtos");
        System.out.println("8- Sair");
        
        seletor = Integer.parseInt(sc.nextLine());
        return seletor;
    }
    
    public void executar(){
        vetor = new Produto[20];
        int seletor=0,
                cont = 0;
        String nome;
        double valor;
        
        while(seletor != 9){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor: ");
                    valor = Double.parseDouble(sc.nextLine());
                    vetor[cont++] = new ProdutoEstadual(nome, valor);
                    break;
                case 2:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor: ");
                    valor = Double.parseDouble(sc.nextLine());
                    vetor[cont++] = new ProdutoNacional(nome, valor);
                    break;
                case 3:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor: ");
                    valor = Double.parseDouble(sc.nextLine());
                    vetor[cont++] = new ProdutoImportado(nome, valor);
                    break;
                case 4:
                    for(int i=0 ; i<cont; i++){
                        if(vetor[i] instanceof ProdutoEstadual){
                            vetor[i].exibir();
                        }
                    }
                    break;
                case 5:
                    for(int i=0 ; i<cont; i++){
                        if(vetor[i] instanceof ProdutoNacional){
                            vetor[i].exibir();
                        }
                    }
                    break;
                case 6:
                    for(int i=0 ; i<cont; i++){
                        if(vetor[i] instanceof ProdutoImportado){
                            vetor[i].exibir();
                        }
                    }
                    break;
                case 7:
                    for(int i=0 ; i<cont; i++){
                        vetor[i].exibir();
                    }
                    break;
                default:
                    System.out.println("Selecao invalida");
                    break;
            }
        }
    }
}
