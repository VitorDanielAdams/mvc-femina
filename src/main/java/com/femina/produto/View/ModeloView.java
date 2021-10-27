package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.ModeloController;
import main.java.com.femina.produto.Model.ModelosDosProdutos;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ModeloView {

    Scanner leitor = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void cadastrarModelos() throws IOException {
        ModeloController modeloController = new ModeloController();

        System.out.println("Digite o Id do modelo: ");
        long id = leitor.nextLong();

        System.out.println("Digite o nome do modelo: ");
        String nomeModelo = leitor.next();

        ModelosDosProdutos modelosDosProdutos = new ModelosDosProdutos(id, nomeModelo);

        modeloController.cadastraModelo(modelosDosProdutos);
    }

    public void mostrarModelos(List<ModelosDosProdutos> modelosDosProdutos)  throws IOException {

       ModeloController modeloController = new ModeloController();

       List<ModelosDosProdutos> listaModelos = modeloController.mostraModelos();

       for(int i = 0; i < listaModelos.size();i++) {
           System.out.println(listaModelos.get(i));
       }

    }

    public void editaModelo() throws IOException {

        ModeloController modeloController = new ModeloController();

        List<ModelosDosProdutos> listaDeModelos = modeloController.mostraModelos();

        for (int i = 0; i < listaDeModelos.size();i++) {
            System.out.println(listaDeModelos.get(i));
        }

        System.out.println("Escolha qual modelo você quer editar: ");
        int opModelo = leitor.nextInt();

        System.out.println("Digite o novo nome do modelo:");
        listaDeModelos.get(opModelo - 1).setNomeTipo(leitor.next());

        modeloController.editaModelo(listaDeModelos);
    }



}
