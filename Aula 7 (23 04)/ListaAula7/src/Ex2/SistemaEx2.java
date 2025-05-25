/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class SistemaEx2 {
    int seletor = 0;
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        System.out.println("1- Criar o livro");
        System.out.println("2- Cadastrar novo capitulo");
        System.out.println("3- Relatorio do livro");
        System.out.println("4- Sair");
        System.out.print("Selecione uma das opcoes: ");
        seletor = sc.nextInt();
        sc.nextLine();
        
        return seletor;
    }
    
    public void executar(){
        String NovoTitulo,
               novoCap;
        int CodigoISBM,
            pagCap;
        Livro novoLivro = null;
        while(seletor != 9){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    NovoTitulo = sc.nextLine();
                    System.out.print("Digite o codigo ISBM do livro: ");
                    CodigoISBM = sc.nextInt();
                    sc.nextLine();
                    
                    novoLivro = new Livro(CodigoISBM, NovoTitulo);
                    break;
                case 2:
                    if(novoLivro == null){
                        System.out.println("Livro nao foi criado");
                        break;
                    }
                    System.out.print("Digite o nome do capitulo: ");
                    novoCap = sc.nextLine();
                    System.out.print("Digite o numero de paginas do capitulo: ");
                    pagCap = sc.nextInt();
                    sc.nextLine();
                    
                    novoLivro.addCap(novoCap, pagCap);
                    break;
                case 3: 
                    novoLivro.relatorio();
                    break;
                case 4:
                    seletor = 9;
                    break;
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }
    }
}
