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
public interface IConta {
    
    public int getAgencia();
    public int getNumero();
    public void setNome(String nome);
    public String getNome();
    public String getCpf();
    public float getValor();
    public void setValor(float valor);
    
    public boolean sacar(float valor);
    public boolean depositar(float valor);
}
