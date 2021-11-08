package main.java.com.femina.produto.Dao;
import java.io.*;
import java.util.*;

import main.java.com.femina.produto.Model.Fornecedor;
import main.java.com.femina.produto.Model.Produto;
import main.java.com.femina.produto.Controller.FornecedorController;

public class ProdutoDao {

    public void gravaProduto(Produto prod){

        try {
            FileWriter fileWriter = new FileWriter("produtos.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(prod.getId() + ";");
            printWriter.print(prod.getCodigo() + ";");
            printWriter.print(prod.getNome() + ";");
            printWriter.print(prod.getPreco() + ";");
            printWriter.print(prod.getQtd() + ";");
            printWriter.println(prod.getFornecedor().getId());

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> retornaProdutos(){
        List<Produto> produtos = new ArrayList<>();
        try {
            File arquivoDeTexto = new File ("produtos.txt");

            if(!arquivoDeTexto.isFile()){
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

            for (String s : result) {
                String[] produts = s.split(";");

                Produto p = new Produto();

                p.setId(Integer.valueOf(produts[0]));
                p.setCodigo(Integer.valueOf(produts[1]));
                p.setNome(produts[2]);
                p.setPreco(Double.valueOf(produts[3]));
                p.setQtd(Integer.valueOf(produts[4]));
                FornecedorController fc = new FornecedorController();
                List<Fornecedor> lfd = fc.listarFornecedores();
                for (int i = 0;i < lfd.size();i++){
                    if(lfd.get(i).getId() == Integer.valueOf(produts[5])){
                        p.setFornecedor(lfd.get(i));
                    }
                }

                produtos.add(p);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public void updelProd(List<Produto> prod){
        try {

            FileWriter fileWriter = new FileWriter("produtos.txt", false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int list = 0; list < prod.size(); list++) {
                printWriter.println(prod.get(list));
            }

            printWriter.flush();
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
