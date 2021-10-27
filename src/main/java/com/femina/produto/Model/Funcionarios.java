package main.java.com.femina.produto.Model;
import java.util.ArrayList;
import java.util.List;

public class Funcionarios {
    private int id;
    private String nome, cargo;
    private Endereco endereco;
    private int idEmpresa;
    private List<Contatos> contatos = new ArrayList<Contatos>();

    public Funcionarios(int id, String nome, String cargo, Endereco endereco, int idEmpresa) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.endereco = endereco;
        this.idEmpresa = idEmpresa;
    }

    public Funcionarios() {
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Contatos> getCursos() {
        return contatos;
    }

    public void setCursos(List<Contatos> cursos) {
        this.contatos = contatos;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public List<Contatos> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contatos> contatos) {
        this.contatos = contatos;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String mostrar(){

        return  "id: " + id + " Nome: " + nome + " Cargo: " + cargo + "\n"
                + " Endereço: " + endereco + " Id Empresa: " + idEmpresa + " Contatos: " + contatos;

    }

    @Override
    public String toString() {
        return id + ";" + nome + ";" + cargo + ";" + endereco + ";" +idEmpresa +";" + contatos;
    }
}
