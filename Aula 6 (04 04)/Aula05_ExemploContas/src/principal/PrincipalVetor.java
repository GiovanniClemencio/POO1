/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import exemplos.Conta;
import exemplos.ContaEspecial;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class PrincipalVetor {

    public static void main(String[] args) {
        Conta contas[] = new Conta[50];
        contas[0] = new Conta("11111", "Cliente 1");
        contas[1] = new ContaEspecial("22222", "Cliente 222", 200);
        contas[2] = new Conta("33333", "Cliente 3");
        int cont = 3;
        for (int i = 0; i < cont; i++) {
            contas[i].depositar(10 * i);
        }
        System.out.println("===TODAS AS CONTAS===");
        for (int i = 0; i < cont; i++) {
            contas[i].exibir();
            System.out.println("");
        }

        System.out.println("===TODAS AS CONTAS ESPECIAIS===");
        for (int i = 0; i < cont; i++) {
            if (contas[i] instanceof ContaEspecial) {
                contas[i].exibir();
                System.out.println("");
            }
        }
        System.out.println("===TODAS AS CONTAS (simples)===");
        for (int i = 0; i < cont; i++) {
            if (contas[i].getClass().equals(Conta.class)) {
                contas[i].exibir();
                System.out.println("");
            }
        }
         System.out.println("===TODAS AS CONTAS ESPECIAIS===");
        for (int i = 0; i < cont; i++) {
            if (contas[i].getClass().equals(ContaEspecial.class)) {
                //ContaEspecial ce = (ContaEspecial) contas[i]; outra alternativa pro que está abaixo
                
                ((ContaEspecial) contas[i]).setLimite(500);
                contas[i].exibir();
                System.out.println("");
            }
        }
        System.out.println(Conta.class);
        System.out.println(contas[0].getClass());
    }
}
