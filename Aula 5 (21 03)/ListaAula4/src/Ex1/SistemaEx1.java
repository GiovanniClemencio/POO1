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
    private AlunoAcademia vetor[];
    int contador = 0;
    int tamanho = 100;
    
    private int menu(){
        int op;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu -");
        System.out.println("1- CADASTRAR ALUNO");
        System.out.println("2- LISTAR ALUNOS");
        System.out.println("3- RELATORIO GERAL");
        System.out.println("9- SAIR");
        System.out.print("Selecione a opcao: ");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    
    public void executar(){
        vetor = new AlunoAcademia[tamanho];
        Scanner sc = new Scanner(System.in);
        int op;
        String iden, nome;
        int idade;
        float peso, altura;
        
        System.out.println("Sistema da academia:");
        
        do{
            op = menu();
            switch(op){
                case 1:
                    System.out.println("CADASTRO NOVO");
                    System.out.print("Identificador: ");
                    iden = sc.nextLine();
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Idade: ");
                    idade = sc.nextInt();
                    System.out.print("Peso: ");
                    peso = sc.nextFloat();
                    System.out.print("Altura: ");
                    altura = sc.nextFloat();
                    sc.nextLine();
                    
                    vetor[contador++] = new AlunoAcademia(iden, nome, idade, peso, altura);
                    
                    break;
                case 2:
                    for(int i=0; i<contador; i++){
                        System.out.println("Aluno "+(i+1)+": "+vetor[i].getNome());
                    }
                    break;
                case 3:
                    for(int i=0; i<contador; i++){
                        System.out.println("Aluno "+(i+1)+": ");
                        System.out.println("Id: "+vetor[i].getIdentificador());
                        System.out.println("Nome: "+vetor[i].getNome());
                        System.out.println("Idade: "+vetor[i].getIdade());
                        System.out.println("Peso: "+vetor[i].getPeso());
                        System.out.println("Altura: "+vetor[i].getAltura());
                        System.out.println("");
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Selecao invalida");
            }
        }while(op!=9);
        
    }
    
}
