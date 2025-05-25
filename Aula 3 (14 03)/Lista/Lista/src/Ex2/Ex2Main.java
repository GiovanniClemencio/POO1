/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class Ex2Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Fabio",19, 78.4f, 1.69f);
        
        if(a1.menorDeIdade()){
            System.out.println("Menor de idade");
        }else{
            System.out.println("Maior de idade");
        }
        
        System.out.println("IMC: "+a1.imc());
    }
}
