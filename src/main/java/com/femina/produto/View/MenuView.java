package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Model.Fornecedor;

import java.io.IOException;
import java.util.Scanner;

public class MenuView {

    public void menuPrincipal() throws IOException {
        Scanner entrada = new Scanner(System.in);
        LojasView lojasView = new LojasView();
        System.out.println("-------------------");
        System.out.println("1 - Acessar Lojas  ");
        System.out.println("2 - Cadastrar Lojas");
        System.out.println("3 - Listar Lojas   ");
        System.out.println("0 - Sair           ");
        System.out.println("-------------------");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1:
                lojasView.acessarLoja();
                menuPrincipal();
                break;
            case 2:
                lojasView.cadastrarLoja();
                menuPrincipal();
                break;
            case 3:
                lojasView.verLojas();
                menuPrincipal();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }

    public void menuDeLoja() throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------");
        System.out.println("1 - Acessar Funcionarios    ");
        System.out.println("2 - Acessar Categorias      ");
        System.out.println("3 - Ofertas                 ");
        System.out.println("4 - Todos os Produtos       ");
        System.out.println("5 - Fornecedores            ");
        System.out.println("0 - Sair                    ");
        System.out.println("----------------------------");
        int escolha = entrada.nextInt();
        switch (escolha){

            case 1:
                menuFuncionarios();
                break;
            case 2:
                menuCategorias();
                break;
            case 3:
                menuOfertas();
                break;
            case 4:
                menuProdutos();
                break;
            case 5:
                menuFornecedor();
                break;
            case 0:
                menuPrincipal();
                break;
        }
    }

    public void menuFuncionarios() throws IOException {
        ViewFuncionarios viewFuncionarios = new ViewFuncionarios();
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("1 - Cadastrar Funcionario");
        System.out.println("2 - Listar Funcionarios  ");
        System.out.println("3 - Editar Funcionarios  ");
        System.out.println("0 - Sair                 ");
        System.out.println("-------------------------");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1:
                viewFuncionarios.cadastrarFuncionarios();
                menuFuncionarios();
                break;
            case 2:
                viewFuncionarios.mostrarFuncionarios();
                menuFuncionarios();
                break;
            case 3:
                System.out.println("Com um bug na hora de salvar o funcionario editado");
//                viewFuncionarios.editFuncionarios();
                menuFuncionarios();
                break;
            case 0:
                menuDeLoja();
                break;
        }
    }

    public void menuCategorias() throws IOException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em andamento.");
        System.out.println("0 - Sair");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 0:
                menuDeLoja();
                break;
        }
    }

    public void menuOfertas() throws IOException {
        Scanner entrada = new Scanner(System.in);
        OfertasView ofertasView = new OfertasView();
        System.out.println("--------------------");
        System.out.println("1 - Cadastrar Oferta");
        System.out.println("2 - Listar Ofertar  ");
        System.out.println("3 - Excluir Oferta  ");
        System.out.println("0 - Sair            ");
        System.out.println("--------------------");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1:
                ofertasView.cadastrarOfertas();
                menuOfertas();
                break;
            case 2:
                ofertasView.listarOfertas();
                menuOfertas();
                break;
            case 3:
                ofertasView.excluirOferta();
                menuOfertas();
                break;
            case 0:
                menuDeLoja();
                break;
        }
    }

    public void menuProdutos() throws IOException {
        Scanner entrada = new Scanner(System.in);
        ProdutoView produtoView = new ProdutoView();
        System.out.println("----------------------");
        System.out.println("1 - Cadastrar Produto ");
        System.out.println("2 - Mostrar Produto   ");
        System.out.println("3 - Editar Produto    ");
        System.out.println("4 - Deletar Produto   ");
        System.out.println("0 - Sair              ");
        System.out.println("----------------------");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1:
                produtoView.cadastro();
                menuProdutos();
                break;
            case 2:
                produtoView.mostrarProdutos();
                menuProdutos();
                break;
            case 3:
                produtoView.alterarProduto();
                menuProdutos();
                break;
            case 4:
                produtoView.deletarProduto();
                menuProdutos();
                break;
            case 0:
                menuDeLoja();
                break;
        }
    }

    public void menuFornecedor() throws IOException {
        Scanner entrada = new Scanner(System.in);
        FornecedorView fornecedorView = new FornecedorView();
        System.out.println("-------------------------");
        System.out.println("1 - Cadastrar Fornecedor ");
        System.out.println("2 - Mostrar Fornecedor   ");
        System.out.println("3 - Editar Fornecedor    ");
        System.out.println("4 - Deletar Fornecedor   ");
        System.out.println("0 - Sair                 ");
        System.out.println("-------------------------");
        int escolha = entrada.nextInt();
        switch (escolha){
            case 1:
                fornecedorView.cadastro();
                menuFornecedor();
                break;
            case 2:
                fornecedorView.mostrarFornecedores();
                menuFornecedor();
                break;
            case 3:
                fornecedorView.alterarFornecedor();
                menuFornecedor();
                break;
            case 4:
                fornecedorView.deletarFornecedor();
                menuFornecedor();
                break;
            case 0:
                menuDeLoja();
                break;
        }
    }
}
