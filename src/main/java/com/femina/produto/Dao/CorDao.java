package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Cor;
import main.java.com.femina.produto.Model.Marca;

import java.io.*;
import java.util.*;

public class CorDao {

    public void cadastraCor(Cor cor) {
        try {
            FileWriter fileWriter = new FileWriter("cor.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(cor.getNome() + ";");
            printWriter.println(cor.getHexadecimal());

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Cor> mostraCor() throws IOException {
        FileReader fileReader = new FileReader("cor.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> tranformToString = new ArrayList<>();

        List<Cor> listaCores = new ArrayList<>();

        String linha = " ";

        while ((linha = bufferedReader.readLine()) != null) {
            if (linha != null) {
                tranformToString.add(linha);
            }
        }
        fileReader.close();
        bufferedReader.close();

        for (String i: tranformToString) {
            String[] cs = i.split(";");

            Cor cores = new Cor();

            cores.setNome(cs[0]);
            cores.setHexadecimal(cs[1]);

       }
        return listaCores;
    }

    public void editaCores(List<Cor> Cores) {

    }
}
