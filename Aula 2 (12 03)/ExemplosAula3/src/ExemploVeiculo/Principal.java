/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExemploVeiculo;

/**
 *
 * @author Portu
 */
public class Principal {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setAno(2003);
        v1.setMarca("Nissan");
        v1.setModelo("Versa");
        
        if (v1.estaDisponivel()){
            System.out.println("Disponivel");
        }
        else{
            System.out.println("Indisponivel");
        }
        v1.emprestar();
        if (v1.estaDisponivel()){
            System.out.println("Disponivel");
        }
        else{
            System.out.println("Indisponivel");
        }
        
        v1.devolver();
        if (v1.estaDisponivel()){
            System.out.println("Disponivel");
        }
        else{
            System.out.println("Indisponivel");
        }
        System.out.println("Marca: "+v1.getMarca());
        System.out.println("Modelo: "+v1.getModelo());
        System.out.println("Ano: "+v1.getAno());
        
    }
}
