package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.ProdutoDao;
import main.java.com.femina.produto.Model.Produto;

public class ProdutoController {

    public void cadastrarProduto(Produto prod){
        ProdutoDao pd = new ProdutoDao();
        pd.gravaProduto(prod);
    }

}
