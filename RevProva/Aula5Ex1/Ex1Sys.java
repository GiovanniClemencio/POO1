/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex1;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Ex1Sys {
    Scanner sc = new Scanner(System.in);
    Peca[] vetor;
    private int cont = 0;
    
    public int menu(){
        int seletor;
        System.out.println("MENU");
        System.out.println("1- Cadastrar Produto");
        System.out.println("2- Cadastrar Produto Importado");
        System.out.println("3- Exibir Produtos normais");
        System.out.println("4- Exibir Produtos importados");
        System.out.println("5- Exibir todos os Produtos");
        System.out.println("6- Sair");
        
        seletor = Integer.parseInt(sc.nextLine());
        return seletor;
    }
    
    public void executar(){
        vetor = new Peca[15];
        String nome;
        double custo,
               lucro,
               taxaImportacao,
               frete;
        
        int seletor = 0;
        while(seletor != 9){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o custo: ");
                    custo = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite o lucro: ");
                    lucro = Double.parseDouble(sc.nextLine());
                    vetor[cont++] = new Peca(nome, custo, lucro);
                    break;
                case 2:
                    System.out.print("Digite o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o custo: ");
                    custo = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite o lucro: ");
                    lucro = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite a taxa de importacao: ");
                    taxaImportacao = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite o frete: ");
                    frete = Double.parseDouble(sc.nextLine());
                    vetor[cont++] = new PecaImportada(nome, custo, lucro, taxaImportacao, frete);
                    break;
                case 3:
                    for(int i=0 ; i<cont; i++){
                        if(!(vetor[i] instanceof PecaImportada)){
                            vetor[i].exibir();
                        }
                    }
                    break;
                case 4:
                    for(int i=0 ; i<cont; i++){
                        if(vetor[i] instanceof PecaImportada){
                            vetor[i].exibir();
                        }
                    }
                    break;
                case 5:
                    for(int i=0 ; i<cont; i++){
                        vetor[i].exibir();
                    }
                    break;
                case 6:
                    seletor = 9;
                    break;
                default:
                    System.out.println("Selecao invalida");
                    break;
            }
        }
    }
}
