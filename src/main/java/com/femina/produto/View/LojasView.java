package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.LojasController;
import main.java.com.femina.produto.Model.Lojas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LojasView {

    Scanner entrada = new Scanner(System.in);
    Lojas lojas = new Lojas();
    EndereçoView endereçoView = new EndereçoView();
    LojasController lojasController = new LojasController();
    List<Lojas> lojasList = new ArrayList<>();

    public List<Lojas> cadastrarLoja() throws IOException {

        System.out.println("Digite o nome da Loja:");
        lojas.setNome(entrada.next());

       // System.out.println("Endereço:");
        //lojas.setEndereco(endereçoView.cadastraEndereco());

        lojasList.add(lojas);

        System.out.println("Continuar?");
        System.out.println("1 - Sim\n2 - Não");
        int contOuNao = entrada.nextInt();

        if(contOuNao == 1){

            cadastrarLoja();

        }else{

            lojasController.cadastrarLojas(lojasList);

        }

        return lojasList;

    }

    public void verLojas(){}

    public void excluirLojas(){}

    public void editarLojas(){}
}
