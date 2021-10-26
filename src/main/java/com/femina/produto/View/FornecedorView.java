package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Model.Fornecedor;
import main.java.com.femina.produto.Controller.FornecedorController;

import java.util.*;

public class FornecedorView {

    public void cadastro(){

        FornecedorController fc = new FornecedorController();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Fornecedor forn = new Fornecedor();

        System.out.println("Informe o nome do fornecedor");
        forn.setNome(entrada.next());

        System.out.println("Informe o CNPJ do fornecedor");
        forn.setCnpj(entrada.next());

        fc.cadastrarFornecedor(forn);
    }

    public void mostrarFornecedores(){
        FornecedorController fc = new FornecedorController();
        List<Fornecedor> lfd = fc.listarFornecedores();
        for(int i = 0; i < lfd.size();i++){
            System.out.println((i+1) + " - " + lfd.get(i).toString());
        }
    }

    public void alterarFornecedor(){
        FornecedorController fc = new FornecedorController();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        List<Fornecedor> lfd = fc.listarFornecedores();
        for(int i = 0; i < lfd.size();i++){
            System.out.println((i+1) + " - " + lfd.get(i).toString());
        }
        System.out.println("Escolha qual fornecedor quer editar");
        int select = entrada.nextInt();
        System.out.println("Selecione: 1-Nome;2-CNPJ;3-Endereço");
        int selectItem = entrada.nextInt();
        switch (selectItem) {
            case 1:
                System.out.print("Nome-" + lfd.get(select - 1).getNome() + ": ");
                lfd.get(select-1).setNome(entrada.next());
                break;
            case 2:
                System.out.print("Preço-" + lfd.get(select - 1).getCnpj() + ": ");
                lfd.get(select-1).setCnpj(entrada.next());
                break;
            case 3:
                break;
            default:
                System.out.println("Opção Inválida");
        }

        fc.editarFornecedor(lfd);
    }

    public void deletarFornecedor(){
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        FornecedorController fc = new FornecedorController();
        List<Fornecedor> lfd = fc.listarFornecedores();
        for(int i = 0; i < lfd.size();i++){
            System.out.println((i+1) + " - " + lfd.get(i).toString());
        }
        System.out.println("Escolha qual fornecedor quer Deletar");
        int select = entrada.nextInt();

        lfd.remove(select - 1);

        fc.removerFornecedor(lfd);
    }

}
