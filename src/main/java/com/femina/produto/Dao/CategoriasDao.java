package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Categoria;
import main.java.com.femina.produto.Model.Produto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriasDao {

    public void cadastrarCategoria(Categoria categorias) throws IOException {

        File arquivoDeTexto = new File ("categorias.txt");

        if(!arquivoDeTexto.isFile()){
            arquivoDeTexto.createNewFile();
        }

        List<Categoria> listaDeCategoria = mostrarListaDeCategoria();

        FileWriter categoriaFile = new FileWriter(arquivoDeTexto,true);
        PrintWriter printaCategoria = new PrintWriter(categoriaFile);

        listaDeCategoria.add(categorias);
        for(int i = 0; i < listaDeCategoria.size();i++) {
            if(listaDeCategoria.get(i).getId() != i+1) {
                listaDeCategoria.get(i).setId(i + 1);
                printaCategoria.println(listaDeCategoria.get(i));
            }
        }

        printaCategoria.flush();
        printaCategoria.close();

    }

    public List<Categoria> mostrarListaDeCategoria () throws IOException {

        FileReader fileReader = new FileReader("categorias.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<String> transformToString = new ArrayList<>();

        List<Categoria> listaDeCategorias = new ArrayList<>();

        String linha = " ";

        while((linha = bufferedReader.readLine()) != null) {
            if (linha != null) {
                transformToString.add(linha);
            }
        }

        fileReader.close();
        bufferedReader.close();

        for (String i: transformToString) {
            String[] cat = i.split(";");

            Categoria categoria = new Categoria();

            categoria.setId(Long.valueOf(cat[0]));
            categoria.setNome(cat[1]);
            categoria.setIdLoja(Long.valueOf(cat[2]));

            listaDeCategorias.add(categoria);
        }

        return listaDeCategorias;
    }

    public void editaCategorias(List<Categoria> categorias) throws IOException {
        FileWriter fileWriter = new FileWriter("categorias.txt",false);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (int listCategoria = 0; listCategoria < categorias.size(); listCategoria++) {
            printWriter.println(categorias.get(listCategoria));
        }

        printWriter.flush();
        printWriter.close();
        fileWriter.close();
    }

    public void deletaCategorias(List<Categoria> categorias) throws IOException {
        FileWriter fileWriter = new FileWriter("categorias.txt",false);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (int listCategoria = 0; listCategoria < categorias.size(); listCategoria++) {
            categorias.get(listCategoria).setId(listCategoria+1);
            printWriter.println(categorias.get(listCategoria));
        }

        printWriter.flush();
        printWriter.close();
        fileWriter.close();
    }

}


