package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Model.Contatos;
import main.java.com.femina.produto.Model.Endereco;
import main.java.com.femina.produto.Model.Marca;
import main.java.com.femina.produto.Controller.MarcaController;

import java.io.*;
import java.util.*;

public class MarcaView {

    Scanner leitor = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    public void cadastrarMarca() {
        MarcaController marcaController = new MarcaController();

        Endereco enderecomarca = new Endereco();
        Contatos contatoMarca = new Contatos();

        System.out.println("Digite o id da marca: ");
        long idMarca = leitor.nextLong();

        System.out.println("Digite o nome da marca: ");
        String nomeMarca = leitor.next();

        System.out.println("----- Endereço -----");

        System.out.println("Digite o país da marca: ");
        enderecomarca.setPais(leitor.next());

        System.out.println("Digite o estado da marca: ");
        enderecomarca.setEstado(leitor.next());

        System.out.println("Digite a cidade da marca: ");
        enderecomarca.setCidade(leitor.next());

        System.out.println("Digite a rua da marca: ");
        enderecomarca.setRua(leitor.next());

        enderecomarca.setCep("Digite o cep da marca: ");
        enderecomarca.setCep(leitor.next());

        System.out.println("Digite o número da marca: ");
        enderecomarca.setNumCasa(leitor.nextInt());

        System.out.println("----- Contato -----");

        System.out.println("Digite o Id do contato");
        contatoMarca.setId(leitor.nextLong());

        System.out.println("Digite o telefone pricipal: ");
        contatoMarca.setTel(leitor.next());

        System.out.println("Digite o e-mail principal: ");
        contatoMarca.setEmail(leitor.next());

        Marca marca = new Marca(idMarca,nomeMarca,enderecomarca);

        marca.getContatos().add(contatoMarca);

        marcaController.cadastraMarca(marca);
    }

    public void mostrarMarcas() throws IOException {

        MarcaController mc = new MarcaController();

        List<Marca> listaDeMarcas = mc.mostraMarcaCadastrada();

        for(int i = 0; i < listaDeMarcas.size();i++) {
            System.out.println(listaDeMarcas.get(i));
        }

    }

}
