package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.DestaquesDao;
import main.java.com.femina.produto.Model.Destaques;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DestaquesController {

    List<Destaques> listaDeDestaques = new ArrayList<Destaques>();
    DestaquesDao destaquesDao = new DestaquesDao();

    public void cadastraDestaque(Destaques destaques) throws IOException {
        listaDeDestaques.add(destaques);
        destaquesDao.cadastraDestaque(listaDeDestaques);
    }


}
