/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

/**
 *
 * @author Danilo Medeiros Eler (FCT-UNESP) - https://daniloeler.github.io/
 */
public class ContaEspecial extends Conta {

    private float limite;

    public ContaEspecial() {
        super();
        limite = 100;
    }
    
    public ContaEspecial(String numero, String cliente, float limite){
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        if (valor > 0) {
            if (saldo + limite - valor >= 0) {
                saldo = saldo - valor;
            }
        }
    }

    public void exibir() {
        super.exibir();
        System.out.println("Limite: " + limite);
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

}
