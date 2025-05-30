/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex2;

/**
 *
 * @author Portu
 */
public abstract class ED {
    protected int elementos[];
    
    public abstract void adicionar(int elemento);
    public abstract void remover();

    public ED(int tamanho){
        elementos = new int[tamanho];
    }
    
    public int[] getElementos() {
        return elementos;
    }
    
    
}
