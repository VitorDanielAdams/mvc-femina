package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Destaques;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DestaquesDao {

    public void cadastraDestaque(List<Destaques> destaquesList) throws IOException {

        FileWriter destaqueFile = new FileWriter("destaques.txt",true);
        PrintWriter printaDestaque = new PrintWriter(destaqueFile);

        for(int i = 0; i < destaquesList.size();i++) {
            printaDestaque.println(destaquesList.get(i));
        }

        printaDestaque.flush();
        printaDestaque.close();

    }

}
