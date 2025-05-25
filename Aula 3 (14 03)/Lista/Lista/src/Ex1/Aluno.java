/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author Portu
 */
public class Aluno {
    private String nome;
    private String ra;
    private float t1;
    private float t2;
    private float p1;
    private float p2;
    
    public Aluno(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }
    
    void setNotas(float t1, float t2,float p1, float p2){
        this.t1 = t1;
        this.t2 = t2;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    float calcularMedia(){
        return (t1+t2+p1+p2)/4.0f;
    }
    
    boolean aprovado(){
        if(calcularMedia()>=5){
            return true;
        }
        return false;
    }
}
