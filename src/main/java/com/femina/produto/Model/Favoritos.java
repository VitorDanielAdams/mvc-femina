package main.java.com.femina.produto.Model;

import java.util.ArrayList;
import java.util.List;

public class Favoritos {

    private List<Produto> Produtos = new ArrayList<Produto>();
    private List<Cliente> Cliente = new ArrayList<Cliente>();

    public Favoritos() {
    }

    public List<Produto> getProdutos() {
        return Produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        Produtos = produtos;
    }

    public List<main.java.com.femina.produto.Model.Cliente> getCliente() {
        return Cliente;
    }

    public void setCliente(List<main.java.com.femina.produto.Model.Cliente> cliente) {
        Cliente = cliente;
    }

    @Override
    public String toString() {
        return "" + Produtos + ";" + Cliente;
    }
}
