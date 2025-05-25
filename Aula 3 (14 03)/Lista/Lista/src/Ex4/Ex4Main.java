/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4;

/**
 *
 * @author Portu
 */
public class Ex4Main {
    public static void main(String[] args) {
        Relogio test1 = new Relogio();
        
        Relogio test2 = new Relogio(1, 30, 10);
        
        test1.setHora(06);
        test1.setMin(45);
        test1.setSeg(25);
        
        test1.exibir();
        test2.exibir();
        
        System.out.println("Segundos do primeiro relogio: "+test1.calcularSegundos());
        System.out.println("Segundos do segundo relogio: "+test2.calcularSegundos());
    }
}
