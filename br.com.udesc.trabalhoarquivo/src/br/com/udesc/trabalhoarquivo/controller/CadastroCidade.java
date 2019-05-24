/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.controller;

import br.com.udesc.trabalhoarquivo.model.Cidades;
import java.util.ArrayList;
import java.util.List;

/**
 * @versão 01 desenvolvimento rj
 * @author Robson de Jesus
 */
public class CadastroCidade {

    private final List<Cidades> cidades; // minha lista de cidades

    public CadastroCidade() {
        cidades = new ArrayList<>();
    }

    public boolean create(Cidades c) {
        for (Cidades ci : cidades) {
            if (ci.getCep().equals(c.getCep())) {
                return false;
            }

        }
        return cidades.add(c);
    }

    public List<Cidades> read() {
        return cidades;

    }

    public Cidades buscar(String nome) {
        for (Cidades c : cidades) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public Cidades buscarCEP(String cep) {
        for (Cidades c : cidades) {
            if (c.getCep().equals(cep)) {
                return c;
            }
        }
        return null;
    }

    public boolean update(Cidades c) {
        for (int i = 0; i < cidades.size(); i++) {
            if (cidades.get(i).getCep().equals(c.getCep())) {//depois arrumar isso aqui, trocar o tipo de atributo para int e comparar com o objeto c da List
                cidades.set(i, c);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Cidades c) {// não esquecer de sobreescrever o equals e hashCode
        return cidades.remove(c);// vai usar o metodo equalsda classe Object

    }
}
