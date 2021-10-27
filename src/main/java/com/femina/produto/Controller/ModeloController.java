package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.ModeloDao;
import main.java.com.femina.produto.Model.ModelosDosProdutos;

import java.io.*;
import java.util.List;

public class ModeloController {

    public void cadastraModelo(ModelosDosProdutos modelo) throws IOException {
        ModeloDao modeloDao = new ModeloDao();
        modeloDao.cadastraModelo(modelo);
    }

    public List<ModelosDosProdutos> mostraModelos() throws IOException {
        ModeloDao modeloDao = new ModeloDao();
        List<ModelosDosProdutos> listaDeModelos = modeloDao.mostraModelo();
        return listaDeModelos;
    }

    public void editaModelo(List<ModelosDosProdutos> modelosDosProdutos) throws IOException {
        ModeloDao modeloDao = new ModeloDao();
        modeloDao.editaDeletaModelo(modelosDosProdutos);
    }

}
