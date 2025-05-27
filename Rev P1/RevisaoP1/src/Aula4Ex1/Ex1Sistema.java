/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex1;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Ex1Sistema {
    private Scanner sc = new Scanner(System.in);
    AlunoAcademia vetor[];
    
    private int menu(){
        int selecionador;
        System.out.println("MENU");
        System.out.println("1- Cadastrar Aluno");
        System.out.println("2- Listar alunos (somente nome)");
        System.out.println("3- Relatorio geral");
        System.out.println("4- Sair");
        System.out.print("Selecione: ");
        selecionador = sc.nextInt();
        sc.nextLine();
        
        return selecionador;
    }
    
    public void executar(){
        int contadorCadastro = 0,
            contLoop = 0,
            tamanho = 15,
            idade;
        String identificador,
               nome;
        double peso,
               altura;
        
        vetor = new AlunoAcademia[tamanho];
        
        int selecionador = 0;
        while(selecionador != 9){
            selecionador = menu();
            switch(selecionador){
                case 1:
                    System.out.println("Cadastro de Aluno: ");
                    System.out.println("Digite o identificador  :");
                    identificador = sc.nextLine();
                    System.out.println("Digite o nome :");
                    nome = sc.nextLine();
                    System.out.println("Digite a idade :");
                    idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o peso :");
                    peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a altura :");
                    altura = sc.nextDouble();
                    sc.nextLine();
                    
                    vetor[contadorCadastro++] = new AlunoAcademia(identificador, nome, idade, peso, altura);
                    
                    break;
                case 2:
                    while(vetor[contLoop] != null){
                        System.out.print("Aluno "+ vetor[contLoop].getIdentificador()+": ");
                        System.out.println(vetor[contLoop++].getNome());
                    }
                    contLoop = 0;
                    break;
                case 3:
                    while(vetor[contLoop] != null){
                        vetor[contLoop++].exibir();
                    }
                    break;
                case 4:
                    selecionador = 9;
                    break;
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }
    }
}
