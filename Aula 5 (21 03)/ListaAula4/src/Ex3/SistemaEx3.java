/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class SistemaEx3 {
    private Scanner sc = new Scanner(System.in);
    private int tamanho=30,
            contE=0,
            contN=0,
            contI=0;
    private Estadual vetorE[];
    private Nacional vetorN[];
    private Importado vetorI[];
    
    String descricao;
    float valor;
    float imposto;
    float taxa;
    float taxaImportacao;
    
    private Estadual cadastroE(){
        System.out.print("Descricao do produto: ");
        descricao = sc.nextLine();
        System.out.print("Valor do produto: ");
        valor = sc.nextFloat();
        imposto = 0.1f;
        sc.nextLine();
        Estadual novo = new Estadual(descricao, valor, imposto);
        return novo;
    }
    
    private Nacional cadastroN(){
        System.out.print("Descricao do produto: ");
        descricao = sc.nextLine();
        System.out.print("Valor do produto: ");
        valor = sc.nextFloat();
        imposto = 0.1f;
        taxa = 0.05f;
        sc.nextLine();
        Nacional novo = new Nacional(descricao, valor, imposto, taxa);
        return novo;
    }
    
    private Importado cadastroI(){
        System.out.print("Descricao do produto: ");
        descricao = sc.nextLine();
        System.out.print("Valor do produto: ");
        valor = sc.nextFloat();
        imposto = 0.1f;
        taxa = 0.05f;
        taxaImportacao = 0.05f;
        sc.nextLine();
        Importado novo = new Importado(descricao, valor, imposto, taxa, taxaImportacao);
        return novo;
    }
    
    private int menu(){
        int seletor;
        System.out.println("MENU\n");
        System.out.println("1- Cadastrar Produto Estadual");
        System.out.println("2- Cadastrar Produto Nacional");
        System.out.println("3- Cadastrar produto Importado");
        System.out.println("4- Exibir Produtos Estaduais");
        System.out.println("5- Exibir Produtos Nacionais");
        System.out.println("6- Exibir Produtos Importados");
        System.out.println("7- Exibir Todos Produtos");
        System.out.println("9- SAIR");
        seletor = sc.nextInt();
        sc.nextLine();
        return seletor;
    }
    
    private void exibirE(){
        System.out.println("Produtos Estaduais: ");
        for(int i=0; i<contE; i++){
            System.out.println("Descricao: "+vetorE[i].getDescricao());
            System.out.println("Valor: "+vetorE[i].getValor());
            System.out.println("Imposto: "+vetorE[i].getImposto()+"\n");
        }
    }
    
    private void exibirN(){
        System.out.println("Produtos Nacionais: ");
        for(int i=0; i<contN; i++){
            System.out.println("Descricao: "+vetorN[i].getDescricao());
            System.out.println("Valor: "+vetorN[i].getValor());
            System.out.println("Imposto: "+vetorN[i].getImposto());
            System.out.println("Taxa: "+vetorN[i].getTaxa()+"\n");
        }
    }
    
    private void exibirI(){
        System.out.println("Produtos Importados: ");
        for(int i=0; i<contI; i++){
            System.out.println("Descricao: "+vetorI[i].getDescricao());
            System.out.println("Valor: "+vetorI[i].getValor());
            System.out.println("Imposto: "+vetorI[i].getImposto());
            System.out.println("Taxa: "+vetorI[i].getTaxa());
            System.out.println("Taxa de importacao: "+vetorI[i].getTaxaImportacao()+"\n");
        }
    }
    
    private void exibirTudo(){
        exibirE();
        exibirN();
        exibirI();
    }
    
    public void executar(){
        int seletor = 0;
        
        vetorE = new Estadual[tamanho];
        vetorN = new Nacional[tamanho];
        vetorI = new Importado[tamanho];
                
        
        while(seletor != 9){
            seletor = menu();
            switch(seletor){
                case 1:
                    vetorE[contE++] = cadastroE();
                    break;
                case 2:
                    vetorN[contN++] = cadastroN();
                    break;
                case 3:
                    vetorI[contI++] = cadastroI();
                    break;
                case 4:
                    exibirE();
                    break;
                case 5:
                    exibirN();
                    break;
                case 6:
                    exibirI();
                    break;
                case 7:
                    exibirTudo();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }
    }
}
