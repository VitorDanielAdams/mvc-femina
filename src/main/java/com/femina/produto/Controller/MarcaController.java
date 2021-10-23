package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.MarcaDao;
import main.java.com.femina.produto.Model.Marca;

public class MarcaController {

    public void cadastraMarca (Marca marca) {
        MarcaDao marcaDao = new MarcaDao();
        marcaDao.cadastraMarca(marca);
    }
}
