/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.view;

import br.com.udesc.trabalhoarquivo.controller.CadastroCidade;
import br.com.udesc.trabalhoarquivo.model.Cidades;

/**
 *
 * @author Robson de Jesu
 */
public class App {

    public static void main(String[] args) {
        CadastroCidade cadastro = new CadastroCidade();

        Cidades c1 = new Cidades("Robson ", "sc", "1111-1111");

        Cidades c2 = new Cidades("Joao ", "or", "2111-1111");
        
        if(cadastro.create(c1)){
            System.out.println("Salvo com sucesso");
        }
        if(cadastro.create(c2)){
            System.out.println("Salvo com sucesso");
        }
        System.out.println(cadastro.read());
    }

}
