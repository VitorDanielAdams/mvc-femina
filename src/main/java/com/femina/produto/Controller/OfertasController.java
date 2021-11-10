package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.OfertasDAO;
import main.java.com.femina.produto.Model.ProdutoDesconto;
import java.util.List;

public class OfertasController {

    OfertasDAO ofertasDAO = new OfertasDAO();

    public void cadastrarOfertas(List<ProdutoDesconto> listaOfertas){
        ofertasDAO.cadastrarOfertas(listaOfertas);
    }

}
