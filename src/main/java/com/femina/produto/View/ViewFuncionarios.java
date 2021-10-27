package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.FuncionariosController;
import main.java.com.femina.produto.Model.Funcionarios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewFuncionarios {

    public void mostrarFuncionarios() throws IOException {

        FuncionariosController funcionariosController = new FuncionariosController();

        List<Funcionarios> listaDeFuncionarios = funcionariosController.mostrarFuncionarios();

        System.out.println();

    }

    public void cadastrarFuncionarios() throws IOException {

        Scanner entrada = new Scanner(System.in);

        Funcionarios funcionario = new Funcionarios();
        List<Funcionarios> listaFuncionarios = new ArrayList<>();

        FuncionariosController funcionariosController = new FuncionariosController();

        System.out.println("Nome: ");
        String nome = entrada.next();

        System.out.println("Cargo: ");
        String cargo = entrada.next();

        //o objeto precisa receber os atributos ainda!!
        funcionario = new Funcionarios();
        listaFuncionarios.add(funcionario);

        listaFuncionarios = funcionariosController.cadastrarFuncionario(listaFuncionarios);

        System.out.println("Cadastro de funcionario(s) realizado com sucesso!");
        System.out.println(listaFuncionarios);

    }

    public void editFuncionarios() throws IOException {

        Scanner entrada = new Scanner(System.in);

        FuncionariosController funcionariosController = new FuncionariosController();

        List<Funcionarios> listaFuncionarios = funcionariosController.mostrarFuncionarios();

        System.out.println("Escolha o funcionario que deseja editar.");
        int editFunc = entrada.nextInt();

        System.out.println("1 - Editar valores \n2 - Excluir\n 0 - Voltar");
        int escolha = entrada.nextInt();

        switch (escolha){

            case 1:

                System.out.println("Qual valor deseja editar?");
                System.out.println("1 - Nome\n2 - Cargo\n 3 - Endereço\n4 - Empresa");
                int valorEdit = entrada.nextInt();

                switch (valorEdit){

                    case 1:
                        System.out.println("Digite o novo nome:");
                        String nome = entrada.next();
                        listaFuncionarios.get(editFunc).setNome(nome);

                        break;
                    case 2:
                        System.out.println("Digite o novo cargo:");
                        String cargo = entrada.next();
                        listaFuncionarios.get(editFunc).setCargo(cargo);
                        break;
                    case 3:
                        //FUNCAO QUE EDITA O ENDEREÇO
                        //viewEndereço
                        break;
                    case 4:
                        System.out.println("Digite a nova empresa:");
                        int novaEmpresa = entrada.nextInt();

                        //
                        //verificacao se a empresa existe
                        //

                        listaFuncionarios.get(editFunc).setIdEmpresa(novaEmpresa);
                        break;

                }

                break;

            case 2:

                FuncionariosController funcionariosController1 = new FuncionariosController();

                listaFuncionarios.remove(editFunc);

                funcionariosController1.editFuncionarios(listaFuncionarios);


            break;

            case 0:

                editFuncionarios();

            break;
        }

        listaFuncionarios = funcionariosController.editFuncionarios(listaFuncionarios);

        System.out.println("Lista editada com sucesso!\n" + listaFuncionarios);

    }

}