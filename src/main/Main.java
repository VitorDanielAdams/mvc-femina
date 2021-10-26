package main;

import main.java.com.femina.produto.View.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ProdutoView pv = new ProdutoView();
        FornecedorView fv = new FornecedorView();
        MarcaView marca = new MarcaView();

//        fv.cadastro();
        pv.cadastro();
        pv.mostrarProdutos();
//        pv.alterarProduto();
       // pv.deletarProduto();


     //   marca.cadastrarMarca();
//        marca.mostrarMarcas();

       // marca.cadastrarMarca();
        marca.editarMarcas();

    }
}
