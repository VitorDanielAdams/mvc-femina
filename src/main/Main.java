package main;

import main.java.com.femina.produto.View.ProdutoView;
import main.java.com.femina.produto.View.MarcaView;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ProdutoView pv = new ProdutoView();
        MarcaView marca = new MarcaView();

//        pv.cadastro();
//        pv.mostrarProdutos();
//        pv.alterarProduto();
       // pv.deletarProduto();

     //   marca.cadastrarMarca();
        marca.mostrarMarcas();
    }
}
