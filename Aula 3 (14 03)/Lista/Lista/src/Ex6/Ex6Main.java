/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex6;

/**
 *
 * @author Portu
 */
public class Ex6Main {
    public static void main(String[] args) {
        Eletrodomestico ex = new Eletrodomestico("Telefone", 3, 24);
        
        System.out.println("Watts por dia : "+ex.wattsDia());
        System.out.println("Watts por mes : "+ex.wattsMes());
        System.out.println("Watts por ano : "+ex.wattsAno());
        
        System.out.println("Gasto mensal: "+ex.gastosMes(0.27f));
    }
}
