package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Model.Produto;
import main.java.com.femina.produto.Controller.ProdutoController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoView {

    public void cadastro(){

        ProdutoController pc = new ProdutoController();
        Scanner entrada = new Scanner(System.in);

        Produto prod = new Produto();

        System.out.println("Informe o Nome:");
        prod.setNome(entrada.next());

        System.out.println("Informe o Preco:");
        prod.setPreco(entrada.nextDouble());

        System.out.println("Informe a Quantidade:");
        prod.setQtd(entrada.nextInt());

        pc.cadastrarProduto(prod);

    }

    public void mostrarProdutos(){
        ProdutoController pc = new ProdutoController();
        List<Produto> lpd = pc.listarProdutos();
        for(int i = 0; i < lpd.size();i++){
            System.out.println(lpd.get(i));
        }
    }

}
