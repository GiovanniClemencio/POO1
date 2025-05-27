/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex3;

/**
 *
 * @author Portu
 */
public class Departamento {
    protected String cod;
    protected String nome;
    protected Funcionario[] cadastroFuncionarios;
    protected int contCadastroF;
    
    public Departamento(){
        this.cadastroFuncionarios = new Funcionario[20];
        this.contCadastroF = 0;
    }
    
    public Departamento(String cod, String nome){
        this.cod = cod;
        this.nome = nome;
        this.cadastroFuncionarios = new Funcionario[20];
        this.contCadastroF = 0;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public int getContCadastroF() {
        return contCadastroF;
    }

    public Funcionario[] getCadastroFuncionarios() {
        return cadastroFuncionarios;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCadastroFuncionarios(Funcionario cadastroFuncionarios) {
        this.cadastroFuncionarios[contCadastroF++] = cadastroFuncionarios;
    }
    
    public void exibir(){
        System.out.println("Departamento "+ cod +" :");
        System.out.println("Nome: "+nome);
        System.out.println("Funcionarios: ");
        for(int i = 0; i < contCadastroF; i++){
            cadastroFuncionarios[i].exibir();
        }
    }
}
