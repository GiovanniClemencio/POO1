/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

/**
 *
 * @author Portu
 */
public class Exercicios {
    public static void main(String[] args) {
        System.out.println("Exercicio 1: ");
        //Ex 1
        AlunoEx1 pessoa = new AlunoEx1();
        
        pessoa.setT1((float) 7.3);
        pessoa.setT2((float)3.5);
        pessoa.setP1((float)8.1);
        pessoa.setP2((float)6.2);
        
        pessoa.calcularMedia();
        
        System.out.println("Exercicio 2: ");
        
        //Ex 2
        AlunoEx2 atleta = new AlunoEx2();
        
        atleta.setNome("Claudio");
        atleta.setIdade(23);
        atleta.setPeso((float)67.3);
        atleta.setAltura((float)1.67);
        
        atleta.ehMenor();
        atleta.imc();
        
        System.out.println("Exercicio 3: ");
        //Ex 3
        Conta exemplo = new Conta();
        
        exemplo.setNumero("1234");
        exemplo.setCliente("Roger");
        exemplo.setSaldo(1399.75);
        
        exemplo.depositar(132.05);

        exemplo.sacar(800.50);
        
        System.out.println("Exercicio 4: ");
        //Ex 4
        Lista estatica = new Lista();
        estatica.inicializar(5);
        estatica.add(1);
        estatica.add(4);
        estatica.add(3);
        
        if(estatica.estaVazia()){
            System.out.println("Lista Vazia");
        }else{
            System.out.println("Lista nao vazia");
        }
        
        System.out.println("Posicao do numero 3: "+estatica.buscar(3));
        
        estatica.remover(3);
        
        System.out.println("Posicao do numero 3: "+estatica.buscar(3));
        
        System.out.println("Exercicio 5: ");
        //Ex 5
        
        
    }
    
}
