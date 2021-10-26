package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Marca;

import java.io.*;
import java.util.*;

public class MarcaDao {

    public void cadastraMarca(Marca marca) {
        try {

            FileWriter fileWriter = new FileWriter("marcas.txt", true);
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

    public List<Marca> mostraMarcas() throws IOException {

        FileReader fileReader = new FileReader("marcas.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> tranformToString = new ArrayList<>();

        List<Marca> listaMarcas = new ArrayList<>();

        String linha = " ";

        while((linha = bufferedReader.readLine()) != null) {
            if(linha != null) {
                tranformToString.add(linha);
            }
        }

        fileReader.close();
        bufferedReader.close();

        for (String i: tranformToString) {
            String[] marc = i.split(";");

            Marca marc2 = new Marca();

            marc2.setId(Long.valueOf(marc[0]));
            marc2.setNome(marc[1]);

            listaMarcas.add(marc2);
        }
        return listaMarcas;
    }

    public void editaMarca(List<Marca> marcas) {

    }
}
