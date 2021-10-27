package main.java.com.femina.produto.Dao;
import java.io.*;
import java.util.*;

import main.java.com.femina.produto.Model.Contatos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ContatoDao {


    public void cadastraContato(Contatos contato) throws IOException {

        FileWriter localDoArquivo = new FileWriter("C:\\Users\\maria\\listaDeContatos.txt", true);
        PrintWriter escreveArquivo = new PrintWriter(localDoArquivo);

        escreveArquivo.print(contato.getEmail());
        escreveArquivo.print(contato.getTel());
        escreveArquivo.println(contato.getId());

        localDoArquivo.close();
        escreveArquivo.flush();

    }


    public List<Contatos> mostraContato() throws IOException {

        FileReader arquivoTxt1 = new FileReader("C:\\Users\\maria\\listaDeContatos.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt1);

        List<String> ListString = new ArrayList<>();
        List<Contatos> listaDeContatos = new ArrayList<>();

        String linha = "";

        while ((linha = lerArq.readLine()) != null) {

            if (linha != null) {
                ListString.add(linha);
            }
        }

        arquivoTxt1.close();
        lerArq.close();

        for( String i : ListString){

            String[] prod = i.split(";");
            Contatos contatos = new Contatos();

            contatos.setId(Long.valueOf(prod[0]));
            contatos.setTel(prod[1]);
            contatos.setEmail(prod[2]);

            listaDeContatos.add(contatos);
        }

        return listaDeContatos;

    }

    public void editContatos(List <Contatos> contatos) throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\listaDeContatos.txt",false);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);


        for (int l = 0; l < contatos.size();l++ ) {
            gravaArq.println(contatos.get(l));
        }

        gravaArq.flush();
        gravaArq.close();
        arquivoTxt.close();

    }

    public void deletContatos (List<Contatos> contatos) throws IOException {

        FileWriter arquivoTxt = new FileWriter("C:\\Users\\maria\\listaDeContatos.txt",false);
        PrintWriter gravaArq = new PrintWriter(arquivoTxt);

        for (int l = 0; l < contatos.size();l++ ) {
            gravaArq.println(contatos.get(l));
        }

        gravaArq.flush();
        gravaArq.close();
        arquivoTxt.close();


    }

}
