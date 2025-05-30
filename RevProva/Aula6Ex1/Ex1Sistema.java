/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex1;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Ex1Sistema {
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        int seletor;
        
        System.out.println("1- Crie uma nova agenda");
        System.out.println("2- Cadastre uma nova pessoa");
        System.out.println("3- Buscar pessoa por nome");
        System.out.println("4- Adicionar um novo contato");
        System.out.println("5- Exibir todas pessoas da agenda");
        System.out.println("6- Exibir contatos de uma pessoa");
        System.out.println("7- Exibir pessoas com um email cadastrado");
        System.out.println("8- Buscar pessoa por email");
        System.out.println("9- Buscar pessoa por telefone");
        System.out.println("10- Sair");
        
        seletor = Integer.parseInt(sc.nextLine());
        return seletor;
    }
    
    public void executar(){
        int seletor = 0,
            contAgenda = 0,
            qualAgenda;
        String proprietario,
                nome;
        int max;
        Agenda teste[] = new Agenda[5];
        Pessoa novaPessoa;
        Contato exemplo;
        
        while(seletor != 99){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o nome do dono da agenda: ");
                    proprietario = sc.nextLine();
                    System.out.print("Digite o numero máximo de pessoas para a agenda: ");
                    max = Integer.parseInt(sc.nextLine());
                    teste[contAgenda++] = new Agenda(proprietario, max);
                    break;
                case 2:
                    System.out.print("Digite o nome da pessoa:");
                    nome = sc.nextLine();
                    System.out.print("Digite o numero max de contatos para essa pessoa: ");
                    max = Integer.parseInt(sc.nextLine());
                    novaPessoa = new Pessoa(nome, max);
                    teste[0].addPessoa(novaPessoa);
                    break;
                case 3:
                    System.out.print("Digite o nome da pessoa:");
                    nome = sc.nextLine();
                    novaPessoa = teste[0].buscarPessoa(nome);
                    if(novaPessoa != null){
                        System.out.println(novaPessoa.getNome() + " encontrada!");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome da pessoa:");
                    nome = sc.nextLine();
                    System.out.print("Digite 1 se for add telefone e 2 se for email: ");
                    seletor = Integer.parseInt(sc.nextLine());
                    if(seletor == 1){
                        System.out.print("Digite o novo telefone: ");
                        proprietario = sc.nextLine();
                        exemplo = new Telefone(proprietario);
                    }else{
                        if(seletor == 2){
                            System.out.print("Digite o novo email");
                            proprietario = sc.nextLine();
                            exemplo = new Email(proprietario);
                        }else{
                            System.out.println("Selecao invalida");
                            break;
                        }
                    }
                    teste[0].addContato(nome, exemplo);
                    break;
                case 5:
                    teste[0].exibirTodasPessoas();
                    break;
                case 6:
                    System.out.print("Digite o nome da pessoa:");
                    nome = sc.nextLine();
                    teste[0].exibirContatosPessoa(nome);
                    break;
                case 7:
                    teste[0].exibirPessoasComEmail();
                    break;
                case 8:
                    System.out.print("Digite o email da pessoa:");
                    nome = sc.nextLine();
                    teste[0].recuperarPessoaPorEmail(nome);
                    break;
                case 9:
                    System.out.print("Digite o telefone da pessoa:");
                    nome = sc.nextLine();
                    teste[0].recuperarPessoaPorTelefone(nome);
                    break;
                case 10:
                    seletor = 99;
                    break;
                default:
                    System.out.println("Entrada invalida!");
                    break;
            }
        }
    }
}
