/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula7Ex2;

/**
 *
 * @author Portu
 */
public class Livro {
    private int ISBN;
    private String titulo;
    private int qtdCap;
    private Capitulo[] vetorCap;
    
    public Livro(int ISBN, String titulo){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.vetorCap = new Capitulo[30];
        this.qtdCap = 0;
    }
    
    public void cadastrarCap(String titulo, int numPag){
        if(qtdCap < 30){
            vetorCap[qtdCap++] = new Capitulo(titulo, numPag);
        }
    }
    
    private int calculaPaginas(){
        Capitulo contador = vetorCap[0];
        int soma = 0,
                i = 1;
        while(contador != null){
            soma += contador.getQtdPaginas();
            contador = vetorCap[i++];
        }
        return soma;
    }
    
    public void relatorio(){
        System.out.println("Livro: "+titulo);
        System.out.println("Cod ISBN: "+ISBN);
        System.out.println("Editora: "+Constantes.EDITORA);
        System.out.println("Quantidade de capitulos: "+qtdCap);
        System.out.println("Numero de paginas: "+calculaPaginas());
        System.out.println("\nCAPITULOS: ");
        for(int i=0; i< vetorCap.length; i++){
            if(vetorCap[i] != null){
                vetorCap[i].relatorio();
            }
        }
    }
}
