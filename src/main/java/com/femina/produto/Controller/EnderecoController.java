package main.java.com.femina.produto.Controller;
import main.java.com.femina.produto.Dao.ContatoDao;
import main.java.com.femina.produto.Dao.EnderecoDao;
import main.java.com.femina.produto.Model.Contatos;
import main.java.com.femina.produto.Model.Endereco;

import java.io.IOException;
import java.util.List;

public class EnderecoController {

    public void cadastraEndereco(List<Endereco> listEndereco) throws IOException {

        EnderecoDao enderecoDao = new EnderecoDao();
        enderecoDao.cadastraEndereco(listEndereco);

    }

    public List<Endereco> mostraEndereco() throws IOException {

        EnderecoDao contatoDao = new EnderecoDao();
        List<Endereco> listaEndereco = contatoDao.mostraEndereco();
        return listaEndereco;
    }

    public void editaEndereco(List<Endereco> endereco) throws IOException {

        EnderecoDao enderecoDao = new EnderecoDao();
        enderecoDao.editEndereco(endereco);
    }

    public void deletaEndereco(List<Endereco> endereco) throws IOException {

        EnderecoDao enderecoDao = new EnderecoDao();
        enderecoDao.delEndereco(endereco);
    }

}


