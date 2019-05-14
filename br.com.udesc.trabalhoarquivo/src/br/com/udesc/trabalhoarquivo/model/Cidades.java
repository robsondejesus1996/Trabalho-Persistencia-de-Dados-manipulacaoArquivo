/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.model;

/**
 *
 * @author Robson de Jesus
 */
public class Cidades {
    
    //atributos principais da model cidade
    private String nome;
    private int cep;
    private String uf;
    private long left;
    private long right;

    //construtor cidades vazio 
    public Cidades() {
    }

     //construtor cidades com seus atributos da classe
    public Cidades(String nome, int cep, String uf, long left, long right) {
        this.nome = nome;
        this.cep = cep;
        this.uf = uf;
        this.left = left;
        this.right = right;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public long getLeft() {
        return left;
    }

    public void setLeft(long left) {
        this.left = left;
    }

    public long getRight() {
        return right;
    }

    public void setRight(long right) {
        this.right = right;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
