/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author Portu
 */
public class AlunoEx1 {
    private String nome;
    private int ra;
    private float t1;
    private float t2;
    private float p1;
    private float p2;
    private boolean aprovado;
    
    void calcularMedia(){
        float media = (t1 + t2 + p1 + p2)/4;
        
        if(media>=5){
            aprovado= true;
            System.out.println("Aprovado");
        }else{
            aprovado = false;
            System.out.println("Reprovado");
        }
        System.out.println("Nota: "+media);
    }
    
    void setT1(float t1){
        this.t1 = t1;
    }
    
    void setT2(float t2){
        this.t2 = t2;
    }
    
    void setP1(float p1){
        this.p1 = p1;
    }
    
    void setP2(float p2){
        this.p2 = p2;
    }
}
