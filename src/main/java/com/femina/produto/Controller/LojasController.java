package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.LojasDAO;
import main.java.com.femina.produto.Model.Lojas;

import java.io.IOException;
import java.util.List;

public class LojasController {

    LojasDAO lojasDAO = new LojasDAO();

    public void cadastrarLojas(List<Lojas> lojasList) throws IOException {

        lojasDAO.cadastrarLojas(lojasList);

    }

}
