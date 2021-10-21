package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Model.Produto;
import main.java.com.femina.produto.Controller.ProdutoController;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoView {

    public void cadastro(){

        ProdutoController pc = new ProdutoController();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

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
            System.out.println((i+1) + " - " + lpd.get(i).toString());
        }
    }

    public void alterarProduto(){
        ProdutoController pc = new ProdutoController();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Produto> lpd = pc.listarProdutos();
        for(int i = 0; i < lpd.size();i++){
            System.out.println((i+1)+" - "+lpd.get(i).toString());
        }
        System.out.println("Escolha qual produto quer editar");
        int select = entrada.nextInt();
        System.out.println("Selecione: 1-Nome;2-Preço;3-Quantidade;");
        int selectItem = entrada.nextInt();
        switch (selectItem) {
            case 1:
                System.out.print("Nome-" + lpd.get(select - 1).getNome() + ": ");
                lpd.get(select-1).setNome(entrada.next());
                break;
            case 2:
                System.out.print("Preço-" + lpd.get(select - 1).getPreco() + ": ");
                lpd.get(select-1).setPreco(entrada.nextDouble());
                break;
            case 3:
                System.out.print("Quantidade-" + lpd.get(select - 1).getQtd() + ": ");
                lpd.get(select-1).setQtd(entrada.nextInt());
                break;
            default:
                System.out.println("Opção Inválida");
        }

        pc.editarProduto(lpd);

    }
}
