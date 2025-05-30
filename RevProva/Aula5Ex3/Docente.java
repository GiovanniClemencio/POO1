/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex3;

/**
 *
 * @author Portu
 */
public class Docente extends Funcionario{
    protected String titulacao;
    
    public Docente(){
        super();
        this.titulacao = "Professor";
    }
    
    public Docente(String cod, String nome, double salario, int tipo){
        super(cod, nome, salario);
        if(tipo == 0){
            this.titulacao = "Professor";
        }else{
            if(tipo == 1){
                this.titulacao = "Mestre";
            }else{
                this.titulacao = "Doutor";
            }
        }
    }

    public String getTitulacao() {
        return titulacao;
    }

    @Override
    public String getCod() {
        return cod;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void exibir(){
        System.out.println("Docente "+ titulacao + " " + cod +":");
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salario);
    }
}
