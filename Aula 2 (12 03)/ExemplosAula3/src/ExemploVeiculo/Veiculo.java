/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploVeiculo;

/**
 *
 * @author Portu
 */
public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean disponivel = true;
    
    void emprestar(){
        disponivel = false;
    }
    
    void devolver(){
        disponivel = true;
    }
    
    boolean estaDisponivel(){
        return disponivel;
    }
    
    void setAno(int ano){
        if (ano >= 200)
            this.ano = ano;
    }
    
    void setMarca(String marca){
        this.marca = marca;
    }
    
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    String getMarca(){
        return marca;
    }
    
    String getModelo(){
        return modelo;
    }
    
    int getAno(){
        return ano;
    }
}
