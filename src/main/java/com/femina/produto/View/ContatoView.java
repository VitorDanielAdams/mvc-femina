package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.ContatoController;
import main.java.com.femina.produto.Model.Contatos;
import java.io.*;
import java.util.*;

public class ContatoView {

        Scanner leitor = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        public Contatos cadastraContato() throws IOException {

            System.out.println("Digite o Numero de contato: ");
            String telefone = leitor.next();

            System.out.println("Digite o e-mail de contato: ");
            String email  = leitor.next();

            Contatos contato = new Contatos(telefone, email);

            ContatoController contatoController = new ContatoController();

            List<Contatos> listaDeContatos  = contatoController.mostraContato();
            listaDeContatos.add(contato);

            contatoController.cadastraContato(listaDeContatos);

            return contato;
        }

        public void mostraContato() throws IOException {

            ContatoController cc = new ContatoController();
            List<Contatos> listaDeContatos  = cc.mostraContato();
            for(int i = 0; i < listaDeContatos.size(); i++) {
                System.out.println(listaDeContatos.get(i));
            }

        }

        public void editContato(int opProduto) throws IOException {

            ContatoController contatoController = new ContatoController();

            List<Contatos> listaContato = contatoController.mostraContato();

            System.out.println(" 1 - telefone");
            System.out.println(" 2 - email");

            int opAtributo = leitor.nextInt();

            switch (opAtributo) {
                case 1:
                    listaContato.get(opProduto - 1).setTel(leitor.next());
                    break;

                case 2:
                    listaContato.get(opProduto - 1).setEmail(leitor.next());
                    break;

                default:
                    System.out.println("Opção inválida");
            }

            contatoController.editaContato(listaContato);

        }

        public void deletContato(int opDelete) throws IOException {

            ContatoController contatoController = new ContatoController();

            List<Contatos> listaContatos = contatoController.mostraContato();

            listaContatos.remove(opDelete - 1);

            contatoController.deletaContatos(listaContatos);
            System.out.print(".");
        }

    }

    


