package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.OfertasController;
import main.java.com.femina.produto.Controller.ProdutoDescontoController;
import main.java.com.femina.produto.Dao.OfertasDAO;
import main.java.com.femina.produto.Model.Ofertas;
import main.java.com.femina.produto.Model.ProdutoDesconto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OfertasView {

    ProdutoDescontoController produtoDescontoController = new ProdutoDescontoController();
    OfertasController ofertasController = new OfertasController();
    Ofertas ofertas = new Ofertas();
    Scanner entrada = new Scanner(System.in);

    public void cadastrarOfertas() throws IOException {
        List<ProdutoDesconto> listaOfertas = new ArrayList<>();
        List<ProdutoDesconto> produtoDescontoList = produtoDescontoController.mostrarListaDeDescontos();
        int tamanhoListaProd = produtoDescontoList.size();
        ofertas.setProdutoDescontoList(produtoDescontoList);
        for(int i = 0; i < tamanhoListaProd; i++){
            System.out.println(produtoDescontoList.get(i));
        }
        System.out.println("Escolha o produto para adicionar as ofertas:");
        int produtoSelecionado = entrada.nextInt();
        listaOfertas.add(ofertas.getProdutoDescontoList().get((produtoSelecionado - 1)));
        ofertasController.cadastrarOfertas(listaOfertas);
    }
}
