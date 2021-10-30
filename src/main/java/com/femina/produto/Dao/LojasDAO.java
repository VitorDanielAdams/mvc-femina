package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Lojas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LojasDAO {

    public void cadastrarLojas(List<Lojas> lojasList) throws IOException {

        File arq = new File("lojas.txt");

        if (!arq.isFile()) {
            arq.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(arq, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for(int i = 0; i < lojasList.size(); i++){

            lojasList.get(i).setId(i);
            printWriter.println(lojasList.get(i));

            System.out.println("oi");

        }

    }
}
