package main.java.com.femina.produto.View;
import main.java.com.femina.produto.Controller.ContatoController;
import main.java.com.femina.produto.Model.Contatos;
import java.io.*;
import java.util.*;

public class ContatoView {

        Scanner leitor = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        public Contatos cadastraContato() throws IOException {

            System.out.println("Digite o Id do Contato ");
            long id2 = leitor.nextLong();

            System.out.println("Digite o Numero de contato: ");
            String telefone = leitor.next();

            System.out.println("Digite o e-mail de contato: ");
            String email  = leitor.next();

            Contatos contato = new Contatos(id2, telefone, email);

            ContatoController contatoController = new ContatoController();
            contatoController.cadastraContato(contato);

            return contato;
        }

        public void mostraContato() throws IOException {

            ContatoController cc = new ContatoController();
            List<Contatos> listaDeContatos  = cc.mostraContato();
            for(int i = 0; i < listaDeContatos.size(); i++) {
                System.out.println(listaDeContatos.get(i));
            }

        }

        public void editContato() throws IOException {

            ContatoController produtoController = new ContatoController();

            List<Contatos> listaContato = produtoController.mostraContato();

            // mostro a lista de produtos
            for (int i = 0; i < listaContato.size(); i++) {
                System.out.println(listaContato.get(i));
            }

            System.out.println("Escolha qual produto você quer editar: ");

            int opProduto = leitor.nextInt();
            System.out.println(" 1 - telefone");
            System.out.println(" 2 - imail");

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

            produtoController.editaContato(listaContato);

        }

        public void deletProduto() throws IOException {

            ContatoController produtoController = new ContatoController();

            List<Contatos> listaContatos = produtoController.mostraContato();

            // mostro a lista de produtos
            for (int i = 0; i < listaContatos.size(); i++) {
                System.out.println(listaContatos.get(i));
            }

            System.out.println("Escolha qual contato você quer deletar: ");
            int opDelete = leitor.nextInt();

            listaContatos.remove(opDelete - 1);

            produtoController.deletaContatos(listaContatos);

        }

}



