/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex3;

import java.util.Scanner;
/**
 *
 * @author Portu
 */
public class Ex3Sistema {
    Scanner sc = new Scanner(System.in);
    ProdutoEstadual vetorE[];
    ProdutoNacional vetorN[];
    ProdutoImportado vetorI[];
    int contE=0,
        contN = 0,
        contI = 0;
    
    public int menu(){
        int seletor;
        System.out.println("MENU");
        System.out.println("1- Cadastrar ProdEstadual ");
        System.out.println("2- Cadastrar ProdNacional");
        System.out.println("3- Cadastrar ProdImportado");
        System.out.println("4- Exibir ProdEstaduais");
        System.out.println("5- Exibir ProdNacionais");
        System.out.println("6- Exibir ProdImportados");
        System.out.println("7- Exibir todos Prod");
        System.out.println("8- Sair");
        System.out.print("Selecione: ");
        
        seletor = Integer.parseInt(sc.nextLine());
        
        return seletor;
    }
    
    public void executar(){
        vetorE = new ProdutoEstadual[12];
        vetorN = new ProdutoNacional[12];
        vetorI = new ProdutoImportado[12];
        int seletor = 0;
        
        String nome;
        double valor;
        
        while(seletor != 9){
            seletor = menu();
            
            switch(seletor){
                case 1:
                    System.out.println("Cadastro Prod Estadual");
                    System.out.print("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor inicial do produto: ");
                    valor = Double.parseDouble(sc.nextLine());
                    
                    vetorE[contE++] = new ProdutoEstadual(nome, valor);
                    break;
                case 2:
                    System.out.println("Cadastro Prod Nacional");
                    System.out.print("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor inicial do produto: ");
                    valor = Double.parseDouble(sc.nextLine());
                    
                    vetorN[contN++] = new ProdutoNacional(nome, valor);
                    break;
                case 3:
                    System.out.println("Cadastro Prod Importado");
                    System.out.print("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    System.out.print("Digite o valor inicial do produto: ");
                    valor = Double.parseDouble(sc.nextLine());
                    
                    vetorI[contI++] = new ProdutoImportado(nome, valor);
                    break;
                case 4:
                    for(int i= 0; i<contE; i++){
                        vetorE[i].relatorio();
                    }
                    break;
                case 5:
                    for(int i= 0; i<contN; i++){
                        vetorN[i].relatorio();
                    }
                    break;
                case 6:
                    for(int i= 0; i<contI; i++){
                        vetorI[i].relatorio();
                    }
                    break;
                case 7:
                    for(int i= 0; i<contE; i++){
                        vetorE[i].relatorio();
                    }
                    System.out.println("");
                    for(int i= 0; i<contN; i++){
                        vetorN[i].relatorio();
                    }
                    System.out.println("");
                    for(int i= 0; i<contI; i++){
                        vetorI[i].relatorio();
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
