/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula4Ex2;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Ex2Sistema {
    private Scanner sc = new Scanner(System.in);
    private ContaEspecial vetor[];
    
    private int menu(){
        int seletor;
        
        System.out.println("MENU");
        System.out.println("1- Cadastro");
        System.out.println("2- Saque");
        System.out.println("3- Deposito");
        System.out.println("4- Listar Contas(posicao + nome)");
        System.out.println("5- Relatorio geral");
        System.out.println("6- Relatorio de contas c/ saldo abaixo de 0");
        System.out.println("7- Relatorio de uma conta especifica");
        System.out.println("9 - Sair");
        System.out.print("Selecione: ");
        seletor = Integer.parseInt(sc.nextLine());
        
        return seletor;
    }
    
    public void executar(){
        int contador = 0,
            seletor = 0,
            tamanhovetor = 30;
        String numero,
            titular;
        float saldo,
              limite;
        
        vetor = new ContaEspecial[tamanhovetor];
        
        while(seletor != 9){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.println("CADASTRO:");
                    System.out.print("Digite o numero da conta: ");
                    numero = sc.nextLine();
                    System.out.print("Digite o nome do titular: ");
                    titular = sc.nextLine();
                    System.out.print("Digite o saldo da conta: ");
                    saldo = Float.parseFloat(sc.nextLine());
                    System.out.print("Digite o limite da conta: ");
                    limite = Float.parseFloat(sc.nextLine());
                    
                    vetor[contador++] = new ContaEspecial(numero, titular, saldo, limite);
                    break;
                case 2:
                    System.out.println("SAQUE: ");
                    System.out.print("Digite o numero da conta a ser sacada: ");
                    numero = sc.nextLine();
                    System.out.print("Digite o valor a ser sacado: ");
                    saldo = Float.parseFloat(sc.nextLine());
                    for(int i = 0; i<contador; i++){
                        if(numero.equals(vetor[i].getNumero())){
                            vetor[i].sacar(saldo);
                            i = contador;
                        }else{
                            if(i == contador - 1){
                                System.out.println("Conta nao encontrada");
                            }
                        }
                        
                    }
                    break;
                case 3:
                    System.out.println("DEPOSITAR: ");
                    System.out.print("Digite o numero da conta a ser a: ");
                    numero = sc.nextLine();
                    System.out.print("Digite o valor a ser depositado: ");
                    saldo = Float.parseFloat(sc.nextLine());
                    for(int i = 0; i<contador; i++){
                        if(numero.equals(vetor[i].getNumero())){
                            vetor[i].depositar(saldo);
                            i = contador;
                        }else{
                            if(i == contador - 1){
                                System.out.println("Conta nao encontrada");
                            }
                        }
                        
                    }
                    break;
                case 4:
                    for(int i=0; i<contador; i++){
                        System.out.println("Conta "+ i +": "+ vetor[i].getTitular());
                    }
                    break;
                case 5:
                    for(int i = 0; i<contador; i++){
                        vetor[i].exibir();
                    }
                    break;
                case 6:
                    for(int i=0 ; i< contador; i++){
                        if(vetor[i].getSaldo() < 0){
                            vetor[i].exibir();
                        }
                    }
                    break;
                case 7:
                    System.out.print("Selecione a conta que deseja o relatorio: ");
                    titular = sc.nextLine();
                    
                    for(int i=0; i<contador; i++){
                        if(vetor[i].getTitular().equals(titular)){
                            vetor[i].exibir();
                        }
                    }
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
