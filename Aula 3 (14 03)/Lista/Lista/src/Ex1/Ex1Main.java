/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class Ex1Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Claudio", "1234");
        
        a1.setNotas(5, 3, 8, 7);
        
        System.out.println("Media: "+a1.calcularMedia());
        if(a1.aprovado())
            System.out.println("Aprovado!");
        else{
            System.out.println("Reprovado!");
        }
    }
}
