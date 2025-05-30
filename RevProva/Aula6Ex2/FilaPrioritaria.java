/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula6Ex2;

/**
 *
 * @author Portu
 */
public class FilaPrioritaria extends Fila{
    private int cont;
    
    public FilaPrioritaria(int tamanho){
        super(tamanho);
        this.cont = 0;
    }
    
    @Override
    public void adicionar(int valor){
        boolean inseriu = false;
        if(cont >= elementos.length){
            System.out.println("Fila Prioritária Cheia");
        }else{
            int aux = 0;
            while(aux < cont){
                if(valor < elementos[aux]){
                    for(int i = cont; i > aux; i--){
                        elementos[i] = elementos[i - 1];
                    }
                    elementos[aux] = valor;
                    inseriu = true;
                    break;
                }
                aux++;
            }
            if(!inseriu){
                elementos[cont] = valor;
            }
            cont++;
        }
    }
    
    @Override
    public void remover(){
        if(cont == 0){
            System.out.println("Fila vazia");
        }else{
            int popped = elementos[0];
            int aux = 0;
            while(aux < cont){
                elementos[aux] = elementos[aux + 1];
                aux++;
            }
            
            System.out.println("Elemento retirado: "+popped);
            cont--;
        }
    }
}
