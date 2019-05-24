/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.view;

import br.com.udesc.trabalhoarquivo.controller.CadastroCidade;
import br.com.udesc.trabalhoarquivo.controller.CadastroCidadeArquivo;
import br.com.udesc.trabalhoarquivo.model.Cidades;
import java.io.IOException;

/**
 *
 * @author Robson de Jesu
 */
public class App {
    
    
    
    //sempre teste aqui antes de jogar para a interface

    public static void main(String[] args) {
        try {
            CadastroCidadeArquivo cadastro = new CadastroCidadeArquivo();
            
            //cadastro.create(new Cidades("Curitiba", "0000-0000", "PR"));
            System.out.println(cadastro.read());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
