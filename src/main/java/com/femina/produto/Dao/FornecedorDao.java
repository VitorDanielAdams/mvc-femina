package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Fornecedor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDao {

    public void gravarFornecedor(Fornecedor forn){
        File arq = new File("fornecedores.txt");

        try {
            if(arq.isFile() ==  false){
                arq.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(forn.getId() + ";");
            printWriter.print(forn.getNome() + ";");
            printWriter.println(forn.getCnpj());
//            printWriter.println(forn.getEnderco());

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Fornecedor> retornaFornecedores(){
        List<Fornecedor> fornecedores = new ArrayList<>();
        try {
            File arquivoDeTexto = new File ("fornecedores.txt");

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

            int i = 0;
            for (String s : result) {
                String[] forncedores = s.split(";");

                Fornecedor fornecedor = new Fornecedor();
                i++;
                fornecedor.setId(Integer.valueOf(forncedores[0]));
                fornecedor.setNome(forncedores[1]);
                fornecedor.setCnpj(forncedores[2]);
//                fornecedor.setEndereco();

                fornecedores.add(fornecedor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fornecedores;
    }

    public void updelFornecedor(List<Fornecedor> forn){
        try {

            FileWriter fileWriter = new FileWriter("fornecedores.txt", false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int list = 0; list < forn.size(); list++) {
                printWriter.println(forn.get(list));
            }

            printWriter.flush();
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
