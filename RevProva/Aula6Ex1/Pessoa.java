/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex1;

/**
 *
 * @author Portu
 */
public class Pessoa {
    private Contato[] contatos;
    protected String nome;
    private int max;
    private int cont;
    
    public Pessoa(String nome, int max){
        this.nome = nome;
        this.max = max;
        this.cont = 0;
        contatos = new Contato[max];
    }
    
    public void adicionarContato(Contato c){
        contatos[cont++] = c;
    }
    
    public Contato[] getContatos(){
        return contatos;
    }
    
    public Contato[] getContatos(String tipo){
        int contNovo = 0,
            quantidade = 0;
        for(int i=0; i<cont; i++){
            if(contatos[i].tipo.equals(tipo)){
                quantidade++;
            }
        }
        
        Contato[] novo = new Contato[quantidade];
        
        for(int i=0; i<cont; i++){
            if(contatos[i].tipo.equals(tipo)){
                novo[contNovo++] = contatos[i];
            }
        }
        
        return novo;
    }
    
    public boolean possuiEmail(){
        boolean tem = false;
        for(int i=0; i<cont; i++){
            if(contatos[i].tipo.equals("Email")){
                tem = true;
            }
        }
        
        return tem;
    }
    
    public boolean possuiTelefone(){
        boolean tem = false;
        for(int i=0; i<cont; i++){
            if(contatos[i].tipo.equals("Telefone")){
                tem = true;
            }
        }
        
        return tem;
    }
    
    public void exibirContatos(){
        for(int i=0; i<cont; i++){
            contatos[i].exibir();
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMax() {
        return max;
    }

    public int getCont() {
        return cont;
    }
    
    
}
