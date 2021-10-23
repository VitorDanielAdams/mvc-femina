package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Marca;

import java.io.*;
import java.util.*;

public class MarcaDao {

    public void cadastraMarca(Marca marca) {
        try {

            FileWriter fileWriter = new FileWriter("produtos.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(marca.getId() + ";");
            printWriter.print(marca.getNome() + ";");
            printWriter.print(marca.getEnderecoMarca() + ";");
            printWriter.print(marca.getContatos());

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Marca> mostraMarcas() {

        List<Marca> marcas = new ArrayList<>();

        // resto do código AQUI!!!!!

        return marcas;
    }

}
