package main.java.com.femina.produto.Controller;
import main.java.com.femina.produto.Dao.CategoriasDao;
import main.java.com.femina.produto.Model.Categoria;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaController {

    CategoriasDao categoriasDao = new CategoriasDao();

    public void cadastrarCategoria(Categoria categoria) throws IOException {
        categoriasDao.cadastrarCategoria(categoria);
    }

    public List<Categoria> mostrarListaDeCategoria() throws IOException {
        List<Categoria> list = categoriasDao.mostrarListaDeCategoria();
        return list;
    }

    public void editaCategoria(List<Categoria> categorias) throws IOException {
        categoriasDao.editaCategorias(categorias);
    }

    public void removeCategoria(List<Categoria> categorias) throws IOException {
        categoriasDao.deletaCategorias(categorias);
    }

}
