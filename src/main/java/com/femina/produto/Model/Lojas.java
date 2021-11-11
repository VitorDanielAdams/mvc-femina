package main.java.com.femina.produto.Model;

import java.util.ArrayList;
import java.util.List;

public class Lojas {
    private long id;
    private String nome;
    private Endereco endereco;
    private Contatos contatos;
    private List<Funcionarios> funcionarios = new ArrayList<Funcionarios>();

    public Lojas() {
    }

    public Lojas(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Lojas(long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

    public List<Funcionarios> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionarios> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + endereco + ";" + contatos + ";" + funcionarios;
    }
}
