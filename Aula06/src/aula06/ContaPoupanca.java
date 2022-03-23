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
public class ContaPoupanca extends Conta{
    private float juros;

    public ContaPoupanca(int agencia, int numero, String nome,
            String cpf, float valor) {
        super(agencia, numero, nome, cpf, valor);
    }
    
    public void render(int meses){
        setValor(getValor() + getValor() * this.juros);
    }
    
    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }
    
}
