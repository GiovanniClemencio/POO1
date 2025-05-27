/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex3;

import java.util.Scanner;

/**
 *
 * @author Portu
 */
public class Ex3Sys {
    Scanner sc = new Scanner(System.in);
    
    public int menu(){
        int seletor;
        
        System.out.println("MENU");
        System.out.println("1- Cadastrar Departamento");
        System.out.println("2- Cadastrar Tecnico");
        System.out.println("3- Cadastrar Docente");
        System.out.println("4- Buscar Departamento por nome ");
        System.out.println("5- Buscar Funcionario por nome");
        System.out.println("6- Exibir Departamentos com funcionarios com uma faixa salarial especifica");
        System.out.println("7- Exibir Funcionarios com faixa salarial especifica");
        System.out.println("8- Exibir Departamentos com um gasto até um maximo");
        System.out.println("9- Exibir Todos os funcionarios da universidade");
        System.out.println("10- Exibir todos os departamentos da universidade");
        System.out.println("11- Exibir todos os departamentos e deus funcionarios");
        System.out.println("12- Exibir todos Docentes");
        System.out.println("13- Exibir todos Tecnicos");
        System.out.println("14- Sair");
        
        seletor = Integer.parseInt(sc.nextLine());
        return seletor;
    }
    
    public void executar(){
        Universidade cadastro = new Universidade("Yale");
        Departamento preenchedorDpt;
        Tecnico preenchedorTcn;
        Docente preenchedorDoce;
        String cod,
                nome,
                aux;
        double salario,
                faixaMin,
                faixaMax;
        int nivel,
                tipoTitulacao,
                seletor = 0;
        boolean passouDaFaixa = false,
                leitura = false;
        
        
        while(seletor != 99){
            seletor = menu();
            switch(seletor){
                case 1:
                    System.out.print("Digite o codigo:");
                    cod = sc.nextLine();
                    System.out.print("Digite o nome:");
                    nome = sc.nextLine();
                    preenchedorDpt = new Departamento(cod, nome);
                    cadastro.setCadastroDepartamentos(preenchedorDpt);
                    break;
                case 2:
                    System.out.print("Digite o codigo:");
                    cod = sc.nextLine();
                    System.out.print("Digite o nome:");
                    nome = sc.nextLine();
                    System.out.print("Digite o salario:");
                    salario = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite o nivel:");
                    nivel = Integer.parseInt(sc.nextLine());
                    preenchedorTcn = new Tecnico(cod, nome, salario, nivel);
                    System.out.print("Digite o departamento que ele pertence:");
                    aux = sc.nextLine();
                    
                    for(int i = 0; i < cadastro.cadastroDepartamentos.length; i++){
                        if(cadastro.cadastroDepartamentos[i].getNome().equals(aux)){
                            cadastro.cadastroDepartamentos[i].setCadastroFuncionarios(preenchedorTcn);
                            i = 10000;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o codigo:");
                    cod = sc.nextLine();
                    System.out.print("Digite o nome:");
                    nome = sc.nextLine();
                    System.out.print("Digite o salario:");
                    salario = Double.parseDouble(sc.nextLine());
                    System.out.print("Selecione o titulo (0- Professor, 1- Mestre, 2- Doutor):");
                    tipoTitulacao = Integer.parseInt(sc.nextLine());
                    preenchedorDoce = new Docente(cod, nome, salario, tipoTitulacao);
                    System.out.print("Digite o departamento que ele pertence:");
                    aux = sc.nextLine();
                    
                    for(int i = 0; i < cadastro.cadastroDepartamentos.length; i++){
                        if(cadastro.cadastroDepartamentos[i].getNome().equals(aux)){
                            cadastro.cadastroDepartamentos[i].setCadastroFuncionarios(preenchedorDoce);
                            i = 10000;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Digite nome do departamento que deseja buscar: ");
                    nome = sc.nextLine();
                    for(int i = 0; i < cadastro.contDepartamento; i++){
                        if(cadastro.cadastroDepartamentos[i].nome.equals(nome)){
                            System.out.println("Departamento encontrado!");
                            cadastro.cadastroDepartamentos[i].exibir();
                            leitura = true;
                        }
                        if(!leitura){
                            System.out.println("Departamento Inexistente");
                            leitura = false;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite nome do funcionario que deseja buscar: ");
                    nome = sc.nextLine();
                    for (int i = 0; i < cadastro.contDepartamento; i++) {
                        for (int j = 0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++) {
                            if (cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].nome.equals(nome)) {
                                System.out.println("Funcionario encontrado!");
                                cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].exibir();
                                leitura = true;
                            }
                            if(!leitura){
                                System.out.println("Departamento Inexistente");
                                leitura = false;
                            }

                        }
                    }
                    break;
                case 6:
                    System.out.print("Digite minimo de salario da faixa: ");
                    faixaMin = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite maximo de salario da faixa: ");
                    faixaMax = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("Departamentos com funcionarios com o salario entre "+ faixaMin +" e "+ faixaMax +" :");
                    for (int i = 0; i < cadastro.contDepartamento; i++) {
                        for (int j = 0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++) {
                            if (cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].salario < faixaMin || cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].salario > faixaMax) {
                                passouDaFaixa = true;
                            }
                        }
                        if(!passouDaFaixa){
                            System.out.println("Departamento "+ cadastro.cadastroDepartamentos[i].cod +" "+ cadastro.cadastroDepartamentos[i].nome);
                        }
                        passouDaFaixa = false;
                    }
                    passouDaFaixa = false;
                    break;
                case 7:
                    System.out.print("Digite minimo de salario da faixa: ");
                    faixaMin = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite maximo de salario da faixa: ");
                    faixaMax = Double.parseDouble(sc.nextLine());
                    
                    System.out.println("Funcionarios com o salario entre "+ faixaMin +" e "+ faixaMax +" :");
                    for (int i = 0; i < cadastro.contDepartamento; i++) {
                        for (int j = 0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++) {
                            if (cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].salario >= faixaMin && cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].salario <= faixaMax) {
                                System.out.println("Funcionario "+ cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].cod +": "+cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].nome);
                            }
                        }
                    }
                    break;
                case 8:
                    double custoTotal = 0;
                    System.out.print("Digite minimo de custo para o departamento: ");
                    faixaMin = Double.parseDouble(sc.nextLine());
                    System.out.print("Digite maximo de custo para o departamento: ");
                    faixaMax = Double.parseDouble(sc.nextLine());
                    
                    for (int i = 0; i < cadastro.contDepartamento; i++) {
                        for (int j = 0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++) {
                            custoTotal += cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].salario;
                        }
                        if(custoTotal >= faixaMin && custoTotal <= faixaMax){
                            System.out.println("Departamento "+ cadastro.cadastroDepartamentos[i].getCod() +" "+ cadastro.cadastroDepartamentos[i].getNome());
                        }
                    }
                    break;
                case 9:
                    for(int i=0 ; i < cadastro.contDepartamento; i++){
                        for(int j=0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++){
                            cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].exibir();
                        }
                    }
                    break;
                case 10:
                    for(int i=0 ; i < cadastro.contDepartamento; i++){
                        System.out.println("Departamento "+ cadastro.cadastroDepartamentos[i].getCod() +": "+ cadastro.cadastroDepartamentos[i].getNome());
                    }
                    break;
                case 11:
                    for(int i=0 ; i < cadastro.contDepartamento; i++){
                        cadastro.cadastroDepartamentos[i].exibir();
                    }
                    break;
                case 12:
                    for(int i=0 ; i < cadastro.contDepartamento; i++){
                        for(int j=0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++){
                            if(cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j] instanceof Docente){
                                cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].exibir();
                            }
                        }
                    }
                    break;
                case 13:
                    for(int i=0 ; i < cadastro.contDepartamento; i++){
                        for(int j=0; j < cadastro.cadastroDepartamentos[i].contCadastroF; j++){
                            if(cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j] instanceof Tecnico){
                                cadastro.cadastroDepartamentos[i].cadastroFuncionarios[j].exibir();
                            }
                        }
                    }
                    break;
                case 14:
                    seletor = 99;
                    break;
                default:
                    System.out.println("Entrada invalida");
                    break;
            }
        }
    }
}
