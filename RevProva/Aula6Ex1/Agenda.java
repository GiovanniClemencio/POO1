/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex1;

/**
 *
 * @author Portu
 */
public class Agenda {
    private String propietario;
    private Pessoa pessoas[];
    private int max;
    private int cont;
    
    public Agenda (String propietario, int max){
        this.propietario = propietario;
        this.max = max;
        this.cont = 0;
        pessoas = new Pessoa[max];
    }
    
    public void addPessoa(Pessoa p){
        pessoas[cont++] = p;
    }
    
    public Pessoa buscarPessoa(String nome){
        for(int i=0; i<cont; i++){
            if(pessoas[i].nome.equals(nome)){
                return pessoas[i];
            }
        }
        return null;
    }
    
    public void addContato(String nome, Contato c){
        Pessoa exemplo = buscarPessoa(nome);
        exemplo.adicionarContato(c);
    }
    
    public void exibirTodasPessoas(){
        for(int i=0; i<cont; i++){
            System.out.println("Nome: "+ pessoas[i].nome);
            pessoas[i].exibirContatos();
        }
    }
    
    public void exibirContatosPessoa(String nome){
        Pessoa teste = buscarPessoa(nome);
        
        System.out.println("Nome: "+nome);
        System.out.print("Contatos: ");
        teste.exibirContatos();
    }
    
    public void exibirPessoasComEmail(){
        for(int i=0; i<cont; i++){
            if(pessoas[i].possuiEmail()){
                System.out.println(pessoas[i].nome);
            }
        }
    }
    
    public void recuperarPessoaPorEmail(String email){
        for(int i=0; i<cont; i++){
            if(pessoas[i].possuiEmail()){
                Contato test[] = pessoas[i].getContatos("Email");
                for(int j = 0; j < test.length; j++){
                    if(((Email)test[j]).getEmail().equals(email)){
                        System.out.println(pessoas[i].getNome());
                    }
                }
            }
        }
    }
    
    public void recuperarPessoaPorTelefone(String telefone){
        for(int i=0; i<cont; i++){
            if(pessoas[i].possuiTelefone()){
                Contato test[] = pessoas[i].getContatos("Telefone");
                for(int j = 0; j < test.length; j++){
                    if(((Telefone)test[j]).getTelefone().equals(telefone)){
                        System.out.println(pessoas[i].getNome());
                    }
                }
            }
        }
    }
}
