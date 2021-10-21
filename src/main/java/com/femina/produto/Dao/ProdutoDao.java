package main.java.com.femina.produto.Dao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

    public List<Produto> retornaProdutos(){
        List<Produto> produtos = new ArrayList<Produto>();
        try {
            File arquivoDeTexto = new File ("produtos.txt");

            if(arquivoDeTexto.isFile() ==  false){
                arquivoDeTexto.createNewFile();
            }

            FileReader fileReader = new FileReader(arquivoDeTexto);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            int i = 0;
            for (String s : result) {
                String[] produts = s.split(";");

                Produto p = new Produto();
                i++;
                p.setNome(produts[0]);
                p.setPreco(Double.valueOf(produts[1]));
                p.setQtd(Integer.valueOf(produts[2]));

                produtos.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produtos;
    }

}
