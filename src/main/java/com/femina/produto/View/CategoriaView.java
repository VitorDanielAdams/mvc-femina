package main.java.com.femina.produto.View;
import main.java.com.femina.produto.Controller.CategoriaController;
import main.java.com.femina.produto.Model.Categoria;
import main.java.com.femina.produto.Controller.ProdutoController;
import main.java.com.femina.produto.Model.Produto;
import main.java.com.femina.produto.Model.ProdutoDesconto;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CategoriaView {

    Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

    public void cadastrarCategoria(Long idLoja) throws IOException {

        CategoriaController categoriaController = new CategoriaController();

        Categoria categoria = new Categoria();

        System.out.println("Digite o nome da categoria ");
        categoria.setNome(leitor.next());

        categoria.setIdLoja(idLoja);

        categoriaController.cadastrarCategoria(categoria);
    }

    public List<Categoria> mostrarListaDeCategorias() throws IOException {

        CategoriaController categoriaController = new CategoriaController();

        List<Categoria> listaDeCategorias = categoriaController.mostrarListaDeCategoria();

        for(int i = 0;i < listaDeCategorias.size();i++){
            System.out.println((i+1) + " - " + listaDeCategorias.get(i).toMostra());
        }

        return listaDeCategorias;
    }

    public void editarCategoria() throws IOException {

        CategoriaController categoriaController = new CategoriaController();

        List<Categoria> listaDeCategorias = categoriaController.mostrarListaDeCategoria();

        for(int i = 0;i < listaDeCategorias.size();i++){
            System.out.println(listaDeCategorias.get(i));
        }

        System.out.println("Escolha a categoria para editar: ");
        int select = leitor.nextInt();

        System.out.println("Digite o novo nome da categoria: ");
        listaDeCategorias.get(select-1).setNome(leitor.next());

        categoriaController.editaCategoria(listaDeCategorias);
    }

    public void removerCategoria() throws IOException {

        CategoriaController categoriaController = new CategoriaController();

        List<Categoria> listaDeCategorias = categoriaController.mostrarListaDeCategoria();

        for(int i = 0;i < listaDeCategorias.size();i++){
            System.out.println(listaDeCategorias.get(i));
        }

        System.out.println("Qual categoria você quer remover: ");
        int select = leitor.nextInt();

        ProdutoView pv = new ProdutoView();

        pv.removerProdutoCategoria(listaDeCategorias.get(select-1).getId());

        listaDeCategorias.remove(select-1);

        categoriaController.removeCategoria(listaDeCategorias);

    }
}


