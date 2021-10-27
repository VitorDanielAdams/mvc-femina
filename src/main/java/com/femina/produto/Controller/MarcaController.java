package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.MarcaDao;
import main.java.com.femina.produto.Model.Marca;

import java.io.*;
import java.util.*;

public class MarcaController {

    public Marca cadastraMarca (Marca marca) {
        MarcaDao marcaDao = new MarcaDao();
        return marcaDao.cadastraMarca(marca);
    }

    public List<Marca> mostraMarcaCadastrada() throws IOException {
        MarcaDao marcaDao = new MarcaDao();
        List<Marca> listaMarcas = marcaDao.mostraMarcas();
        return listaMarcas;
    }

    public void editaMarca(List<Marca> marcas) {
        MarcaDao marcaDao = new MarcaDao();
        marcaDao.editaMarca(marcas);
    }
}
