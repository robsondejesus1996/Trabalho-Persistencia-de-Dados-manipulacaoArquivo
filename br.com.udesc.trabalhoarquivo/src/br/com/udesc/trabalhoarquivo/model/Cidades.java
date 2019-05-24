/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.model;

import java.io.Serializable;//classes de entraga e saída de arquivo
import java.util.Objects;

/**
 * @versão 01 desenvolvimento rj
 * @author Robson de Jesus
 */
public class Cidades implements Serializable{//interface de marcação
    
    private String nome;
    private String uf;
    private String cep;

    public Cidades() {
    }

    public Cidades(String nome, String uf, String cep) {
        this.nome = nome;
        this.uf = uf;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.uf);
        hash = 17 * hash + Objects.hashCode(this.cep);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cidades other = (Cidades) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cidades{" + "nome=" + nome + ", uf=" + uf + ", cep=" + cep + '}';
    }

   
}
