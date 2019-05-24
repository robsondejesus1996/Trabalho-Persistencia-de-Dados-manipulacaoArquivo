/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.udesc.trabalhoarquivo.controller;

import br.com.udesc.trabalhoarquivo.model.Cidades;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @versão 01 desenvolvimento rj
 * @author Robson de Jesus
 */
public class CadastroCidadeArquivo {

    private File arquivo;//criar um arquivo 

    public CadastroCidadeArquivo() throws IOException {
        //inicializar o arquivo
        arquivo = new File("Cidades.txt");

        if (!arquivo.exists()) {//se o arquivo não existir vai criar ele.
            arquivo.createNewFile();
        }
    }

    public boolean create(Cidades c) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Cidades> cidades = read();
        
        for(Cidades ci: cidades){
            if(ci.getCep().equalsIgnoreCase(ci.getCep())){
                return false;
            }
        }
        //pegar a minha lista e jogar dentro do arquivo, vai ter que gravar no arquivo output
        cidades.add(c);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
        out.writeObject(cidades);
        return true;
    }

    //para ler o arquivo 
    public List<Cidades> read() throws FileNotFoundException, IOException, ClassNotFoundException {
        //abrir o arquivo "ler"
        //entrada de dados input

        if (arquivo.length() > 0) {//verificar se o arquivo tem alguma coisa, se tiver ler ele
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo));
            return (List<Cidades>) in.readObject();
        } else {
            return new ArrayList<>();//quer dizer que não tem nada no arquivo da ligado mano :(
        }
    }

    public Cidades buscar(String nome) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Cidades> cidades = read();

        for (Cidades c : cidades) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public Cidades buscarCEP(String cep) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Cidades> cidades = read();

        for (Cidades c : cidades) {
            if (c.getCep().equalsIgnoreCase(cep)) {
                return c;
            }
        }
        return null;
    }

    public boolean update(Cidades c) {
        return false;
    }

    public boolean delete(Cidades c) throws IOException, FileNotFoundException, ClassNotFoundException {
        List<Cidades> cidades = read();
        
        for(Cidades ci: cidades){
            if(ci.getCep().equalsIgnoreCase(ci.getCep())){
                cidades.remove(c);
                
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(cidades);
                return true;
            }
        }
        return false;
        
    }

}
