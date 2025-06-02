/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula7Ex2;

/**
 *
 * @author Portu
 */
public class Capitulo {
    private static int CapAtual = 1;
    private int numero;
    private String titulo;
    private int qtdPaginas;

    public Capitulo(String titulo, int qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.numero = CapAtual++;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    
    public void relatorio(){
        System.out.println("CAPITULO "+numero);
        System.out.println("Titulo: "+titulo);
        System.out.println("Numero de paginas: "+qtdPaginas);
    }
}
