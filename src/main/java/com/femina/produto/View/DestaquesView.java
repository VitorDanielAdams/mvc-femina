package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.DestaquesController;
import main.java.com.femina.produto.Controller.ProdutoController;
import main.java.com.femina.produto.Model.Destaques;
import main.java.com.femina.produto.Model.Produto;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DestaquesView {

    Scanner leitor = new Scanner(System.in);
    DestaquesController destaquesController = new DestaquesController();

    public void cadastraDestaque() throws IOException {
        Destaques destaques = new Destaques();
        ProdutoController produtoController = new ProdutoController();
        List<Produto> listaDeProdutos = produtoController.listarProdutos();

        for(int i = 0; i < listaDeProdutos.size();i++) {
            System.out.println(listaDeProdutos.get(i));
        }

        System.out.println("Qual produto você quer adicionar aos destaques: ");
        int idProdutoSelecionado = leitor.nextInt();

        destaques.setIdProduto(Long.valueOf(idProdutoSelecionado));

        destaquesController.cadastraDestaque(destaques);
    }

    public void mostraDestaques() {

    }

}
