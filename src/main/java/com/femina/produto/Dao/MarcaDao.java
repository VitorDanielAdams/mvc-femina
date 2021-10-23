package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Marca;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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

}
