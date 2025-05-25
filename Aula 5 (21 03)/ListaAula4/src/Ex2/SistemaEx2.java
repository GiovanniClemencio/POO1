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
    private int tamanho = 30,
        cont = 0;
    private Scanner sc = new Scanner(System.in);
    private ContaCorrEspecial vetor[];
    
    private int menu(){
        int op;
        System.out.println("MENU");
        System.out.println("1- Cadastrar nova conta");
        System.out.println("2- Saque");
        System.out.println("3- Deposito");
        System.out.println("4- Listar Contas");
        System.out.println("5- Relatorio geral");
        System.out.println("6- Relatorio de contas cujo saldo está abaixo de zero");
        System.out.println("7- Relatorio da conta de um determinado cliente");
        System.out.println("9- Sair");
        System.out.print("Selecao: ");
        op = sc.nextInt();
        sc.nextLine();
        return op;
    }
    
    private ContaCorrEspecial cadastrar(){
        String numero, titular;
        float saldo, limite;
        System.out.print("Digite o numero da conta: ");
        numero = sc.nextLine();
        System.out.print("Digite o nome do titular: ");
        titular = sc.nextLine();
        System.out.print("Digite o saldo da conta: ");
        saldo = sc.nextFloat();
        System.out.print("Digite o limite da conta: ");
        limite = sc.nextFloat();
        sc.nextLine();
        
        ContaCorrEspecial nova = new ContaCorrEspecial(numero, titular, saldo, limite);
        
        return nova;
    }
    
    public void executar(){
        int op;
        int aux = -1;
        float intermediario;
        String receptor;
        vetor = new ContaCorrEspecial[tamanho];
        
        do{
            op = menu();
            switch(op){
                case 1:
                    vetor[cont++] = cadastrar();
                    break;
                case 2:
                    System.out.println("SAQUE");
                    System.out.print("Digite o numero da conta que sera sacada: ");
                    receptor = sc.nextLine();
                    for(int i=0; i<cont; i++){
                        if(vetor[i].getNumero().equals(receptor)){
                            aux = i;
                        }
                    }
                    if(aux == -1){
                        System.out.println("Numero de conta invalido");
                    }else{
                        System.out.print("Digite o quanto quer sacar: ");
                        intermediario = sc.nextFloat();
                        vetor[aux].saque(intermediario);
                    }
                    sc.nextLine();
                    aux = -1;
                    break;
                case 3:
                    System.out.println("DEPOSITO");
                    System.out.print("Digite o numero da conta: ");
                    receptor = sc.nextLine();
                    for(int i=0; i<cont; i++){
                        if(vetor[i].getNumero().equals(receptor)){
                            aux = i;
                        }
                    }
                    if(aux == -1){
                        System.out.println("Numero de conta invalido");
                    }else{
                        System.out.print("Digite o quanto depositar: ");
                        intermediario = sc.nextFloat();
                        vetor[aux].depositar(intermediario);
                    }
                    sc.nextLine();
                    aux =-1;
                    break;
                case 4:
                    System.out.println("Contas e titulares cadastrados: ");
                    for(int i=0; i<cont; i++){
                        System.out.println("Conta "+(i+1)+": "+vetor[i].getTitular());
                    }
                    break;
                case 5:
                    System.out.println("Relatorio geral: ");
                    for(int i=0; i<cont; i++){
                        System.out.println("Conta "+(i+1)+": ");
                        System.out.println("Numero da conta :"+vetor[i].getNumero());
                        System.out.println("Nome :"+vetor[i].getTitular());
                        System.out.println("Saldo :"+vetor[i].getSaldo());
                        System.out.println("Limite :"+vetor[i].getLimite());
                    }
                    break;
                case 6:
                    for(int i=0; i<cont; i++){
                        System.out.println("Contas com saldo negativo: ");
                        if(vetor[i].getSaldo() < 0){
                            System.out.println("Conta "+(i+1)+": ");
                            System.out.println("Numero da conta :"+vetor[i].getNumero());
                            System.out.println("Nome :"+vetor[i].getTitular());
                            System.out.println("Saldo :"+vetor[i].getSaldo());
                            System.out.println("Limite :"+vetor[i].getLimite());
                        }
                    }
                    break;
                case 7:
                    System.out.print("Digite o nome do cliente que procura: ");
                    receptor = sc.nextLine();
                    for(int i=0; i<cont; i++){
                        if(vetor[i].getTitular().equals(receptor)){
                            System.out.println("Conta "+(i+1)+": ");
                            System.out.println("Numero da conta :"+vetor[i].getNumero());
                            System.out.println("Nome :"+vetor[i].getTitular());
                            System.out.println("Saldo :"+vetor[i].getSaldo());
                            System.out.println("Limite :"+vetor[i].getLimite());
                        }
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Selecao invalida");
                    break;
            }
        }while(op != 9);
    }
}
