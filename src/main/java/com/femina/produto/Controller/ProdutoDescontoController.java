package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.ProdutosComDescontoDao;
import main.java.com.femina.produto.Model.ProdutoDesconto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDescontoController {

    List<ProdutoDesconto> descontos = new ArrayList<>();
    ProdutosComDescontoDao produtosComDescontoDao = new ProdutosComDescontoDao();

    public void cadastrarDesconto(ProdutoDesconto produtoDesconto,Double precoComDesconto) throws IOException {
        descontos.add(produtoDesconto);
        produtosComDescontoDao.cadastrarDesconto(descontos,precoComDesconto);
    }

    public List<ProdutoDesconto> mostrarListaDeDescontos() throws IOException {
        descontos = produtosComDescontoDao.mostrarListaDeDesconto();
        return descontos;
    }

    public List<ProdutoDesconto> getDescontoByIdProduto(long idProduto) {

        List<ProdutoDesconto> listaDeProdutosComDescontos = new ArrayList<ProdutoDesconto>();

        for(int i = 0; i < descontos.size();i++) {
            if(descontos.get(i).getIdProduto() == idProduto) {
                listaDeProdutosComDescontos.add(descontos.get(i));
            }
        }

        return listaDeProdutosComDescontos;

    }

}
