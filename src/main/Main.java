package main;

import main.java.com.femina.produto.Model.Cliente;
import main.java.com.femina.produto.View.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        ProdutoView pv = new ProdutoView();
        FornecedorView fv = new FornecedorView();
        MarcaView marca = new MarcaView();
        ClienteView cv = new ClienteView();
        LojasView lojasView = new LojasView();

        CorView corView = new CorView();

        TamanhoView tamanhoView = new TamanhoView();


//        corView.cadastro();
//        corView.mostrarCor();
//        corView.editaCor();
//        corView.removeCor();
//        corView.mostrarCor();
//        cv.cadastro();
        //cv.mostrarClientes();
//        pv.cadastro();
//        pv.mostrarProdutos();
//        pv.alterarProduto();
//        pv.deletarProduto();
//        pv.mostrarProdutos();

//        marca.cadastrarMarca();
//        marca.cadastrarMarca();
//        marca.editarMarcas();
//        marca.deletaMarca();
//        marca.mostrarMarcas();
//        lojasView.cadastrarLoja();
        tamanhoView.cadastrarTamanho();

    }
}
