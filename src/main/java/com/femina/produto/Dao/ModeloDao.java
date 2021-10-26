package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.ModelosDosProdutos;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModeloDao {

    public void cadastraModelo(ModelosDosProdutos modelo) throws IOException {
        FileWriter fileWriter = new FileWriter("modeloDosProdutos.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.print(modelo.getId() + ";");
        printWriter.println(modelo.getNomeTipo());

        printWriter.flush();
        printWriter.close();
    }

    public List<ModelosDosProdutos> mostraModelo() throws IOException {  // retorna uma lista

        FileReader fileReader = new FileReader("modeloDosProdutos.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> transformToString = new ArrayList<>();

        List<ModelosDosProdutos> listaDeModelos = new ArrayList<>();

        String linha = " ";

        while((linha = bufferedReader.readLine()) != null) {
            if (linha != null) {
                transformToString.add(linha);
            }
        }

        fileReader.close();
        bufferedReader.close();

        for (String i: transformToString) {
            String[] model = i.split(";");

            ModelosDosProdutos models = new ModelosDosProdutos();

            models.setId(Long.valueOf(model[0]));
            models.setNomeTipo(model[1]);

            listaDeModelos.add(models);
        }
        return listaDeModelos;
    }

}
