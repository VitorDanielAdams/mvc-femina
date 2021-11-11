package main.java.com.femina.produto.View;

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

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

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
                viewFuncionarios.editFuncionarios();
                menuFuncionarios();
                break;
            case 0:
                menuDeLoja();
                break;
        }
    }

}
