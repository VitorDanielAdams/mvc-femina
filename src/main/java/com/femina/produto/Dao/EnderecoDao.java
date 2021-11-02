package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Contatos;
import main.java.com.femina.produto.Model.Endereco;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDao {

    public void cadastraEndereco(Endereco endereco) throws IOException {

        FileWriter localDoArquivo = new FileWriter("listaDeEndereços.txt", true);
        PrintWriter escreveArquivo = new PrintWriter(localDoArquivo);

        escreveArquivo.print(endereco.getIdEndereco() + ";");
        escreveArquivo.print(endereco.getPais() + ";");
        escreveArquivo.print(endereco.getEstado() + ";");
        escreveArquivo.print(endereco.getCidade() + ";");
        escreveArquivo.print(endereco.getRua() + ";");
        escreveArquivo.print(endereco.getCep() + ";");
        escreveArquivo.println(endereco.getNumCasa());

        localDoArquivo.close();
        escreveArquivo.flush();
    }

    public List<Endereco> mostraEndereco() throws IOException {

        FileReader arquivoTxt1 = new FileReader("listaDeEndereços.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);

        List<String> ListString = new ArrayList<>();
        List<Endereco> listaEndereco = new ArrayList<>();

        String linha = "";

        while ((linha = lerArq.readLine()) != null) {

            if (linha != null) {
                ListString.add(linha);
            }
        }

        arquivoTxt1.close();
        lerArq.close();

        for (String i : ListString) {

            String[] prod = i.split(";");
            Endereco endereco = new Endereco();

            endereco.setIdEndereco(Long.valueOf(prod[0]));
            endereco.setPais(prod[1]);
            endereco.setEstado(prod[2]);
            endereco.setCidade(prod[3]);
            endereco.setRua(prod[4]);
            endereco.setCep(prod[5]);
            endereco.setNumCasa(Integer.valueOf(prod[6]));


            listaEndereco.add(endereco);
        }

        return listaEndereco;
    }


    public void editEndereco (List <Endereco> endereco) throws IOException {

        FileWriter arquivoTxt = new FileWriter("listaDeEndereços.txt",false);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);


        for (int l = 0; l < endereco.size();l++ ) {
            gravaArq.println(endereco.get(l));
        }

        gravaArq.flush();
        gravaArq.close();
        arquivoTxt.close();

   }

    public void delEndereco (List <Endereco> endereco) throws IOException {

        FileWriter arquivoTxt = new FileWriter("listaDeEndereços.txt",false);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);


        for (int l = 0; l < endereco.size();l++ ) {
            gravaArq.println(endereco.get(l));
        }

        gravaArq.flush();
        gravaArq.close();
        arquivoTxt.close();

    }
}