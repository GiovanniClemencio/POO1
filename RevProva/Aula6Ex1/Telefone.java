/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex1;

/**
 *
 * @author Portu
 */
public class Telefone extends Contato{
    private String telefone;
    
    public Telefone(String telefone){
        super("Telefone");
        this.telefone = telefone;
    }
    
    @Override
    public void exibir(){
        System.out.println("Telefone: "+telefone);
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipo() {
        return tipo;
    }
    
    
}
