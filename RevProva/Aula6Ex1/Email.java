/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex1;

/**
 *
 * @author Portu
 */
public class Email extends Contato{
    private String email;
    
    public Email(String email){
        super("Email");
        this.email = email;
    }
    
    @Override
    public void exibir(){
        System.out.println("Email: "+this.email);
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }
}
