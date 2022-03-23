/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Professor
 */
public class Agencia {
    private ArrayList<Conta> contas;
    
    public Agencia(){
        this.contas = new ArrayList<Conta>();
    }
    public void AdicionarConta(Conta c){
        contas.add(c);
    }
    public void AdicionarConta(int agencia, int numero, 
            String nome, String cpf, float valor){
        ContaCorrente cc = new ContaCorrente(
                agencia, numero, nome, cpf, valor);
        AdicionarConta(cc);
    }
    public boolean FecharConta(Conta c){
        return contas.remove(c);
    }
    public boolean FecharConta(String cpf){
        for(Conta c: this.contas){
            if(c.getCpf().equals(cpf))
                return FecharConta(c);
        }
        return false;
    }
    public ArrayList<Conta> getContas(){
        return this.contas;
    }
}
