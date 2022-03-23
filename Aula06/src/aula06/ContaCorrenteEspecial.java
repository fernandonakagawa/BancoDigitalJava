/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Professor
 */
public class ContaCorrenteEspecial extends ContaCorrente{
    private float limiteChequeEspecial;
    
    public ContaCorrenteEspecial(int agencia, int numero, 
            String nome, String cpf, float valor,
            float limiteChequeEspecial) {
        
        super(agencia, numero, nome, cpf, valor);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    @Override 
    public boolean sacar(float valor){
        if(this.getValor() + this.limiteChequeEspecial >= valor 
                && valor > 0){
            this.setValor(getValor() - valor);
            return true;
        }
        return false;
    }
    
}
