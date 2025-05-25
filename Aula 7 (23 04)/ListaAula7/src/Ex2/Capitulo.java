/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author Portu
 */
public class Capitulo {
    private static int CapAtual = 1;
    private int Numero;
    private String Titulo;
    private int NumPaginas;

    public Capitulo() {
        this.Numero = CapAtual++;
    }
    
    public Capitulo(String Titulo, int NumPaginas){
        this.Numero = CapAtual++;
        this.Titulo = Titulo;
        this.NumPaginas = NumPaginas;
    }

    public int getNumero() {
        return Numero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }
    
    
}
