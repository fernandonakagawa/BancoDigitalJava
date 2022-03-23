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
public abstract class Conta implements IConta {
    private int agencia;
    private int numero;
    private String nome;
    private String cpf;
    private float valor;
    
    public Conta(int agencia, int numero, String nome,
            String cpf, float valor){
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.valor = valor;
    }
    @Override
    public int getAgencia(){
        return this.agencia;
    }
    @Override
    public int getNumero(){
        return this.numero;
    }
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    @Override
    public float getValor(){
        return this.valor;
    }
    @Override
    public void setValor(float valor){
        this.valor = valor;
    }
    @Override
    public boolean sacar(float valor){
        if(this.valor >= valor && valor > 0){
            this.valor -= valor;
            return true;
        }
        return false;
    }
    @Override
    public boolean depositar(float valor){
        if(valor > 0){
            this.valor += valor;
            return true;
        }
        return false;
    }
}
