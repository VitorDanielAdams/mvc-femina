package main.java.com.femina.produto.Model;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private long id;
    private String nome;
    private Double preco;
    private int qtd;
    private Categoria categoria;
    private Fornecedor fornecedor; // obj

    private List<ModelosDosProdutos> modeloDosProdutos = new ArrayList<ModelosDosProdutos>();
    private List<Cor> cor = new ArrayList<Cor>();
    private List<Tamanho> tamanho = new ArrayList<Tamanho>();

    public Produto() {}

    public Produto(long id, String nome, Double preco, int qtd, Fornecedor fornecedor, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.fornecedor = fornecedor;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public List<ModelosDosProdutos> getModeloDosProdutos() {
        return modeloDosProdutos;
    }

    public void setModeloDosProdutos(List<ModelosDosProdutos> modeloDosProdutos) {
        this.modeloDosProdutos = modeloDosProdutos;
    }

    public List<Cor> getCor() {
        return cor;
    }

    public void setCor(List<Cor> cor) {
        this.cor = cor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Tamanho> getTamanho() {
        return tamanho;
    }

    public void setTamanho(List<Tamanho> tamanho) {
        this.tamanho = tamanho;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return ""+ id + ';' +
                nome + ';' +
                preco + ';' +
                qtd + ';'
//              +
//                modeloDosProdutos + ';' +
//                cor + ';' +
//                categoria.getNome() + ';' +
//                tamanho + ';' +
//                fornecedor
                ;
    }
}
