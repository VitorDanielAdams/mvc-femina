package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.MarcaDao;
import main.java.com.femina.produto.Model.Marca;

import java.io.IOException;
import java.util.*;

public class MarcaController {

    public void cadastraMarca (Marca marca) {
        MarcaDao marcaDao = new MarcaDao();
        marcaDao.cadastraMarca(marca);
    }

    public List<Marca> mostraMarcaCadastrada() throws IOException {
        MarcaDao marcaDao = new MarcaDao();
        List<Marca> listaMarcas = marcaDao.mostraMarcas();
        return listaMarcas;
    }
}
