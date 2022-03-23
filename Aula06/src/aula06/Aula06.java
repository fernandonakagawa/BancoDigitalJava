/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.ArrayList;

/**
 *
 * @author Professor
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agencia a;
        a = new Agencia();
        ContaCorrente cc1 = new ContaCorrente(
                1, 1000, "Maycon", "0123456789", 100);
        a.AdicionarConta(cc1);
        ContaPoupanca cp1 = new ContaPoupanca(
            1, 1001, "Charles", "0123456788", 200);
        a.AdicionarConta(cp1);
        ContaCorrenteEspecial cce1 = new ContaCorrenteEspecial(
                1, 1002, "Bruno", "0123456777", 300, 100);
        a.AdicionarConta(cce1);
        mostrarContas(a);
        cc1.depositar(150);
        cp1.render(1);
        cce1.sacar(350);
        mostrarContas(a);
        cc1.sacar(250);
        mostrarContas(a);
    }
    public static void mostrarContas(Agencia a){
        ArrayList<Conta> contas = a.getContas();
        for(Conta c: contas){
            System.out.println(c.getCpf() + " " 
                    + c.getNome() + " " + c.getValor());
        }
        System.out.println("");
    }
    
}
