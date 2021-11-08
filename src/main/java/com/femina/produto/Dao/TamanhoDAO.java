package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Tamanho;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TamanhoDAO {

    public void cadastrarTamanho(List<Tamanho> tamanhos){

        File file = new File("tamanhos.txt");
        if(file.isFile()){
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for(int i = 0; i < tamanhos.size(); i++){
                    tamanhos.get(i).setId(i);
                    printWriter.println(tamanhos.get(i));
                    System.out.println(tamanhos.get(i));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                file.createNewFile();
                cadastrarTamanho(tamanhos);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
