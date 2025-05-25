/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revlista5;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class SistemaEx2 {
    Scanner sc = new Scanner(System.in);
    Produto[] vetor = new Produto[15];
    
    private int menu(){
        int seletor;
        
        System.out.println("1- Cadastrar Produto Estadual");
        System.out.println("2- Cadastrar Produto Nacional");
        System.out.println("3- Cadastrar Produto Importado");
        System.out.println("4- Exibir Produtos Estaduais");
        System.out.println("5- Exibir Produtos Nacionais");
        System.out.println("6- Exibir Produtos Importados");
        System.out.println("7- Exibir todos os Produtos");
        System.out.println("8- Sair");
        System.out.print("Selecione: ");
        seletor = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        return seletor;
    }
    
    public void executar(){
        int seletor = 1,
            indexVetor =0,
            contador;
        String nome;
        double custo;
        
        
        while(seletor != 9){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor base do produto: ");
                    custo = sc.nextDouble();
                    sc.nextLine();
                    vetor[indexVetor++] = new ProdutoEstadual(nome, custo);
                    break;
                case 2:
                    System.out.print("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor base do produto: ");
                    custo = sc.nextDouble();
                    sc.nextLine();
                    vetor[indexVetor++] = new ProdutoNacional(nome, custo);
                    break;
                case 3:
                    System.out.print("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor base do produto: ");
                    custo = sc.nextDouble();
                    sc.nextLine();
                    vetor[indexVetor++] = new ProdutoImportado(nome, custo);
                    break;
                case 4:
                    contador = 1;
                    for(int i=0; i< indexVetor; i++){
                        if(vetor[i] instanceof ProdutoEstadual){
                            System.out.println("Produto "+ contador +": ");
                            vetor[i].exibir();
                            contador++;
                        }
                    }
                    break;
                case 5:
                    contador = 1;
                    for(int i=0; i< indexVetor; i++){
                        if(vetor[i] instanceof ProdutoNacional){
                            System.out.println("Produto "+ contador +": ");
                            vetor[i].exibir();
                            contador++;
                        }
                    }
                    break;
                case 6:
                    contador = 1;
                    for(int i=0; i< indexVetor; i++){
                        if(vetor[i] instanceof ProdutoImportado){
                            System.out.println("Produto "+ contador +": ");
                            vetor[i].exibir();
                            contador++;
                        }
                    }
                    break;
                case 7:
                    contador = 1;
                    for(int i=0; i< indexVetor; i++){
                        System.out.println("Produto "+ contador +": ");
                        vetor[i].exibir();
                        contador++;
                    }
                    break;
                case 8:
                    seletor = 9;
                    break;
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }
    }
}
