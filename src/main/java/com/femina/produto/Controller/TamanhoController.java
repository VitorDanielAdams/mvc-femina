package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.TamanhoDAO;
import main.java.com.femina.produto.Model.Tamanho;

import java.util.List;

public class TamanhoController {

    TamanhoDAO tamanhoDAO = new TamanhoDAO();

    public void cadastrarTamanho(List<Tamanho> tamanhos){

        tamanhoDAO.cadastrarTamanho(tamanhos);

    }

}
