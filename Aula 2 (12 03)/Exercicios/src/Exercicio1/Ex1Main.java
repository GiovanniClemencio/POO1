/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

/**
 *
 * @author Portu
 */
public class Ex1Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Aluno 1");
        a1.setRA("1111");
        a1.setNotas(5,6,7,8);
        System.out.println("Media: "+a1.calcularMedia());
        if(a1.aprovado()){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
        Aluno a2 = new Aluno("Aluno 2", "2222");
        System.out.println("Media: "+a2.calcularMedia());
        if(a2.aprovado()){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
    }
    
}
