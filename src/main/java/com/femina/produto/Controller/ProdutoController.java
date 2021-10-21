package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.Dao.ProdutoDao;
import main.java.com.femina.produto.Model.Produto;

import java.util.List;

public class ProdutoController {

    public void cadastrarProduto(Produto prod){
        ProdutoDao pd = new ProdutoDao();
        pd.gravaProduto(prod);
    }

    public List<Produto> listarProdutos(){
        ProdutoDao pd = new ProdutoDao();
        List<Produto> lpd = pd.retornaProdutos();
        return lpd;
    }

    public void editarProduto(List<Produto> lpd){
        ProdutoDao pd = new ProdutoDao();
        pd.updateProduto(lpd);

    }

}
