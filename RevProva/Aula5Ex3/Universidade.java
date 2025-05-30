/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula5Ex3;

/**
 *
 * @author Portu
 */
public class Universidade {
    protected String nome;
    protected Departamento[] cadastroDepartamentos;
    protected int contDepartamento = 0;
    
    public Universidade(){
        this.cadastroDepartamentos = new Departamento[20];
    }
    
    public Universidade(String nome){
        this.nome = nome;
        this.cadastroDepartamentos = new Departamento[20];
    }

    public String getNome() {
        return nome;
    }

    public Departamento[] getCadastroDepartamentos() {
        return cadastroDepartamentos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCadastroDepartamentos(Departamento cadastroDepartamentos) {
        this.cadastroDepartamentos[contDepartamento++] = cadastroDepartamentos;
    }
    
    public void exibir(){
        System.out.println("Universidade "+ nome + ":");
        System.out.println("Departamentos: ");
        for(int i=0; i < cadastroDepartamentos.length; i++){
            cadastroDepartamentos[i].exibir();
        }
    }
}
