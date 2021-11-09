package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Model.Funcionarios;
import main.java.com.femina.produto.Model.Tamanho;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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

    public List<Tamanho> listarTamanhos(){
        int dadosInt = 0;
        List<String> listaDoArquivoTamanhos = new ArrayList<>();
        List<Tamanho> listaDeTamanhos = new ArrayList<>();
        Path path = Paths.get("funcionarios.txt");
        try {
            listaDoArquivoTamanhos = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i = 0; i < listaDoArquivoTamanhos.size(); i++){
            String func = listaDoArquivoTamanhos.get(i);
            String[] dadosFuncionario = func.split(";");
            if(isNumeric(dadosFuncionario[i])){
                dadosInt = (Integer.parseInt(dadosFuncionario[i]));
                Tamanho tamanho = new Tamanho();
                tamanho.setId(dadosInt);
                tamanho.setTam(dadosFuncionario[1]);
            }
        }
        return listaDeTamanhos;
    }

    public List<Tamanho> validarId(){


        return null;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
