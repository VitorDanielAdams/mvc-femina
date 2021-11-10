package main.java.com.femina.produto.View;


import main.java.com.femina.produto.Model.Cor;
import main.java.com.femina.produto.Model.Fornecedor;
import main.java.com.femina.produto.Model.Produto;
import main.java.com.femina.produto.Controller.ProdutoController;
import main.java.com.femina.produto.View.FornecedorView;

import java.io.IOException;
import java.util.*;

public class ProdutoView {

    public void cadastro() throws IOException {

        ProdutoController pc = new ProdutoController();
        FornecedorView fv = new FornecedorView();
        CorView cv = new CorView();

        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Produto prod = new Produto();

        System.out.println("Informe o Código do Produto:");
        prod.setCodigo(entrada.nextInt());

        System.out.println("Informe o Nome:");
        prod.setNome(entrada.next());

        System.out.println("Informe o Preco:");
        prod.setPreco(entrada.nextDouble());

        System.out.println("Informe a Quantidade:");
        prod.setQtd(entrada.nextInt());

        System.out.println("Selecione um Fornecedor");

        List<Fornecedor> lfd = fv.mostrarFornecedores();
        prod.setFornecedor(lfd.get(entrada.nextInt() - 1));

        prod = pc.cadastrarProduto(prod);

        cv.cadastro(prod.getId());

    }

    public void mostrarProdutos() throws IOException {
        ProdutoController pc = new ProdutoController();
        CorView cv = new CorView();

        List<Produto> lpd = pc.listarProdutos();

        for(int i = 0; i < lpd.size();i++){
            List<Cor> cores = cv.listaCorDoProduto(Long.valueOf(lpd.get(i).getId()));
            for(int j = 0;j < cores.size();j++){
                lpd.get(i).getCor().add(cores.get(j));
            }
            System.out.println((i+1) + " - " + lpd.get(i).toMostra());
        }
    }

    public void alterarProduto() throws IOException {
        ProdutoController pc = new ProdutoController();
        FornecedorView fv = new FornecedorView();
        CorView cv = new CorView();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Produto> lpd = pc.listarProdutos();
        for(int i = 0; i < lpd.size();i++){
            List<Cor> cores = cv.listaCorDoProduto(Long.valueOf(lpd.get(i).getId()));
            for(int j = 0;j < cores.size();j++){
                lpd.get(i).getCor().add(cores.get(j));
            }
            System.out.println((i+1)+" - "+lpd.get(i).toMostra());
        }
        System.out.println("Escolha qual produto quer editar");
        int select = entrada.nextInt();
        System.out.println("Selecione: 1-Código;2-Nome;3-Preço;4-Quantidade;5-Trocar Fornecedor;6-Cor");
        int selectItem = entrada.nextInt();
        switch (selectItem) {
            case 1:
                System.out.print("Código-" + lpd.get(select - 1).getCodigo() + ": ");
                lpd.get(select-1).setCodigo(entrada.nextInt());
                break;
            case 2:
                System.out.print("Nome-" + lpd.get(select - 1).getNome() + ": ");
                lpd.get(select-1).setNome(entrada.next());
                break;
            case 3:
                System.out.print("Preço-" + lpd.get(select - 1).getPreco() + ": ");
                lpd.get(select-1).setPreco(entrada.nextDouble());
                break;
            case 4:
                System.out.print("Quantidade-" + lpd.get(select - 1).getQtd() + ": ");
                lpd.get(select-1).setQtd(entrada.nextInt());
                break;
            case 5:
                System.out.println("Selecione o novo fornecedor:");
                List<Fornecedor> lfd = fv.mostrarFornecedores();
                lpd.get(select-1).setFornecedor(lfd.get(entrada.nextInt()  - 1));
                break;
            case 6:
                cv.editaCor(lpd.get(select-1).getId());
                break;
            default:
                System.out.println("Opção Inválida");
        }

        pc.editarProduto(lpd);
    }

    public void deletarProduto() throws IOException {
        ProdutoController pc = new ProdutoController();
        CorView cv = new CorView();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Produto> lpd = pc.listarProdutos();
        for(int i = 0; i < lpd.size();i++){
            List<Cor> cores = cv.listaCorDoProduto(Long.valueOf(lpd.get(i).getId()));
            for(int j = 0;j < cores.size();j++){
                lpd.get(i).getCor().add(cores.get(j));
            }
            System.out.println((i+1)+" - "+lpd.get(i).toMostra());
        }
        System.out.println("Escolha qual produto quer Deletar");
        int select = entrada.nextInt();

        cv.removeCor(lpd.get(select-1).getId());

        lpd.remove(select - 1);

        pc.removerProduto(lpd);
    }

    public long acessarProduto() throws IOException {
        ProdutoController pc = new ProdutoController();
        CorView cv = new CorView();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Produto> lpd = pc.listarProdutos();

        for(int i = 0; i < lpd.size();i++){
            List<Cor> cores = cv.listaCorDoProduto(Long.valueOf(lpd.get(i).getId()));
            for(int j = 0;j < cores.size();j++){
                lpd.get(i).getCor().add(cores.get(j));
            }
            System.out.println((i+1)+" - "+lpd.get(i).toMostra());
        }

        System.out.println("Escolha qual produto acessar: ");

        long idProduto = pc.pegaIdProduto(entrada.nextInt()-1).getId();

        System.out.println("Produto selecionado:" + lpd.get((int) (idProduto-1)).toMostra());

        return idProduto;
    }
}
