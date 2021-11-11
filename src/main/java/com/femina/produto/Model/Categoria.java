package main.java.com.femina.produto.Model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

    private String nome;
    private long id;
    private long idLoja;

    public Categoria(String nome, long id, long idLoja) {
        this.nome = nome;
        this.id = id;
        this.idLoja = idLoja;
    }

    public Categoria() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(long idLoja) {
        this.idLoja = idLoja;
    }

    public String toMostra() {
        return  "Categoria: \n" +
                "Id - "+ id + "\n" +
                "Nome da Categoria:" + nome + "\n";

    }

    @Override
    public String toString() {
        return "" + id + ";" + nome + ";" + idLoja;
    }

}
