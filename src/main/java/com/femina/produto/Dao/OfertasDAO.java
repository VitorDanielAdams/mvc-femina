package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.ProdutoDesconto;
import main.java.com.femina.produto.Model.Tamanho;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class OfertasDAO {

    public void cadastrarOfertas(List<ProdutoDesconto> listaOfertas){

        File file = new File("ofertas.txt");
        if(file.isFile()){
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for(int i = 0; i < listaOfertas.size(); i++){
                    printWriter.println(listaOfertas.get(i));
                }
                printWriter.flush();
                fileWriter.close();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                file.createNewFile();
                cadastrarOfertas(listaOfertas);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
