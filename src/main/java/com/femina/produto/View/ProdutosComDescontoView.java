package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.ProdutoController;
import main.java.com.femina.produto.Controller.ProdutoDescontoController;
import main.java.com.femina.produto.Model.Produto;
import main.java.com.femina.produto.Model.ProdutoDesconto;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutosComDescontoView {

    Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
    ProdutoDescontoController produtoDescontoController = new ProdutoDescontoController();

    public void cadastrarDesconto() throws IOException {

        ProdutoDesconto produtoDesconto = new ProdutoDesconto();
        Produto produto = new Produto();

        ProdutoController produtoController = new ProdutoController();
        List<Produto> listaDeProdutos = produtoController.listarProdutos();

        for(int i = 0; i < listaDeProdutos.size();i++) {
            System.out.println(listaDeProdutos.get(i));
        }

        System.out.println("Qual porduto você quer adicionar desconto: ");
        int idProdutoSelecionado = leitor.nextInt();

        produtoDesconto.setIdProduto(Long.valueOf(idProdutoSelecionado));

        System.out.println("Digite o desconto do produto: ");
        Double porcentagemDesconto = leitor.nextDouble();

        Double precoComDesconto = listaDeProdutos.get(idProdutoSelecionado).getPreco() * (porcentagemDesconto / 100);

        produtoDesconto.setPreco(precoComDesconto);

        System.out.println(produtoDesconto.getPreco());

        produtoDescontoController.cadastrarDesconto(produtoDesconto, precoComDesconto);
    }

    public List<ProdutoDesconto> mostraListaDeDescontos() throws IOException {
        List<ProdutoDesconto> listaDeDescontos = produtoDescontoController.mostrarListaDeDescontos();
        System.out.println(listaDeDescontos);
        return listaDeDescontos;
    }




}
