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
public class SistemaEx1 {
    private Scanner sc = new Scanner(System.in);
    
    private Peca vetor[];
    private int tamanho = 30,
            cont = 0;
    
    private String nome;
    private float custo,
            lucro,
            importacao,
            frete,
            correio;
    
    private int menu(){
        int seletor;
        System.out.println("MENU\n");
        System.out.println("1- Cadastrar peca");
        System.out.println("2- Cadastrar peca local");
        System.out.println("3- Cadastrar peca importada");
        System.out.println("4- Imprimir a registro de peca");
        System.out.println("9- Sair");
        
        seletor = sc.nextInt();
        sc.nextLine();
        return seletor;
    }
    
    private void cadastrarPeca(){
        System.out.println("Informe os dados da peca: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Custo: ");
        custo = sc.nextFloat();
        System.out.print("Lucro: ");
        lucro = sc.nextFloat();
        
        sc.nextLine();
        vetor[cont++] = new Peca(nome, custo, lucro);          
    }
    
    private void cadastrarLocal(){
        System.out.println("Informe os dados da peca: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Custo: ");
        custo = sc.nextFloat();
        System.out.print("Lucro: ");
        lucro = sc.nextFloat();
        System.out.print("Taxa do correio: ");
        correio = sc.nextFloat();
        
        sc.nextLine();
        vetor[cont++] = new PecaLocal(nome, custo,lucro,correio);
    }
    
    private void cadastrarImportado(){
        System.out.println("Informe os dados da peca: ");
        System.out.print("Nome: ");
        nome = sc.nextLine();
        System.out.print("Custo: ");
        custo = sc.nextFloat();
        System.out.print("Lucro: ");
        lucro = sc.nextFloat();
        System.out.print("Taxa de importacao: ");
        importacao = sc.nextFloat();
        System.out.print("Taxa de frete: ");
        frete = sc.nextFloat();
        
        sc.nextLine();
        vetor[cont++] = new PecaImportada(nome, custo, lucro, importacao, frete);
    }
    
    private void imprimir(){
        String buscador;
        System.out.print("Digite o nome da peca: ");
        buscador = sc.nextLine();
        for(int i=0; i<cont; i++){
            if(buscador.equals(vetor[i].nome)){
                vetor[i].exibir();
            }else{
                System.out.println("Peca nao encontrada");
            }
        }
    }
    
    public void executar(){
        vetor = new Peca[tamanho];
        int seletor = 0;
        
        while(seletor != 9){
            seletor = menu();
            
            switch(seletor){
                case 1:
                    cadastrarPeca();
                    break;
                case 2:
                    cadastrarLocal();
                    break;
                case 3: 
                    cadastrarImportado();
                    break;
                case 4:
                    imprimir();
                    break;
                case 9:
                    System.out.println("Saindo . . .");
                    break;
                default:
                    System.out.println("Entrada inválida");
            }
        }
    }
}
