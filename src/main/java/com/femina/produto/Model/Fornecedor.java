package main.java.com.femina.produto.Model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {

    private long id;
    private String nome;
    private String cnpj;
    private Endereco endereco; // OBJETO -> endereço

    private List<Contatos> contatos = new ArrayList<Contatos>(); // lista de contatos

    public Fornecedor() {
    }

    public Fornecedor(long id, String nome, String cnpj, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "" + id + ';' +
                nome + ';' +
                cnpj;
//                endereco + ';' +
//                contatos;
    }
}
