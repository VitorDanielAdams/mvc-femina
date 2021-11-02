package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.ClienteController;
import main.java.com.femina.produto.Model.Cliente;
import main.java.com.femina.produto.Model.Contatos;
import main.java.com.femina.produto.Model.Endereco;
import main.java.com.femina.produto.View.ContatoView;

import java.io.IOException;
import java.util.*;

public class ClienteView {
    public void cadastro() throws IOException {

        ClienteController cc = new ClienteController();
        ContatoView cv = new ContatoView();
        EndereçoView ev = new EndereçoView();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Cliente cliente = new Cliente();

        System.out.println("Informe o seu nome");
        cliente.setNome(entrada.next());

        System.out.println("Informe a sua idade");
        cliente.setIdade(entrada.nextInt());

        System.out.println("Informe a sua Senha");
        cliente.setSenha(entrada.next());

        Contatos contato = cv.cadastraContato();
        cliente.setContatos(contato);

        Endereco endereco = ev.cadastraEndereco();
        cliente.setEndereco(endereco);

//        System.out.println("Confirme sua senha");

        cc.cadastrarCliente(cliente);
    }

    public void mostrarClientes(){
        ClienteController cc = new ClienteController();
        List<Cliente> ldc = cc.listarClientes();

        for(int i = 0; i < ldc.size();i++){
            System.out.println((i+1) + " - " + ldc.get(i).toMostra());
        }
    }

    public void alterarClientes() throws IOException {
        ClienteController cc = new ClienteController();
        ContatoView cv = new ContatoView();
        EndereçoView ev = new EndereçoView();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        List<Cliente> ldc = cc.listarClientes();

        for(int i = 0; i < ldc.size();i++){
            System.out.println((i+1) + " - " + ldc.get(i).toMostra());
        }
        System.out.println("Escolha qual Cliente você quer editar");
        int select = entrada.nextInt();
        System.out.println("Selecione: 1-Nome;2-Idade;3-Senha;4-Contato;5-Endereço");
        int selectItem = entrada.nextInt();
        switch (selectItem) {
            case 1:
                System.out.print("Nome-" + ldc.get(select - 1).getNome() + ": ");
                ldc.get(select-1).setNome(entrada.next());
                break;
            case 2:
                System.out.print("Idade-" + ldc.get(select - 1).getIdade() + ": ");
                ldc.get(select-1).setIdade(entrada.nextInt());
                break;
            case 3:
                System.out.print("Nova senha: ");
                ldc.get(select-1).setSenha(entrada.next());
                break;
            case 4:
                cv.editContato(select);
                break;
            case 5:
                ev.editEndereco(select);
                break;
            default:
                System.out.println("Opção Inválida");
        }

        cc.editarCliente(ldc);
    }

    public void deletarClientes() throws IOException {
        ClienteController cc = new ClienteController();
        ContatoView cv = new ContatoView();
        EndereçoView ev = new EndereçoView();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        List<Cliente> ldc = cc.listarClientes();
        for(int i = 0; i < ldc.size();i++){
            System.out.println((i+1) + " - " + ldc.get(i).toMostra());
        }
        System.out.println("Escolha qual cliente você quer deletar");
        int select = entrada.nextInt();

        cv.deletContato(select);
        ev.deletEndereco(select);

        ldc.remove(select - 1);

        cc.removerCliente(ldc);
        System.out.println(".\nCliente deletado com sucesso!");
    }
}
