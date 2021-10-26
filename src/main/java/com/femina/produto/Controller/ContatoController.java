package main.java.com.femina.produto.Controller;

import main.java.com.femina.produto.View.ContatoView;
import main.java.com.femina.produto.Dao.ContatoDao;
import main.java.com.femina.produto.Model.Contatos;

import java.io.IOException;
import java.util.List;

public class ContatoController {


    public void cadastraContato (Contatos contato) throws IOException {

        ContatoDao contatoDao = new ContatoDao();
        contatoDao.cadastraContato(contato);
    }

    public List<Contatos> mostraContato() throws IOException {

        ContatoDao contatoDao = new ContatoDao();
        List<Contatos> listaContato = contatoDao.mostraContato();
        return listaContato;
    }

    public void editaContato(List<Contatos> contatos) throws IOException {
        
        ContatoDao contatoDao = new ContatoDao();
        contatoDao.editContatos(contatos);
    }

    public void deletaContatos (List <Contatos> contatos) throws IOException {

        ContatoDao contatoDao = new ContatoDao();
        contatoDao.deletContatos(contatos);

    }



}
