package main.java.com.femina.produto.Dao;
import java.io.*;
import main.java.com.femina.produto.Model.Produto;

public class ProdutoDao {

    public void gravaProduto(Produto prod){

        try {

            FileWriter fileWriter = new FileWriter("produtos.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(prod.getNome() + ";");
            printWriter.print(prod.getPreco() + ";");
            printWriter.println(prod.getQtd());

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
