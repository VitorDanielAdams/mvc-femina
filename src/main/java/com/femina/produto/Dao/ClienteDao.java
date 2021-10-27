package main.java.com.femina.produto.Dao;

import main.java.com.femina.produto.Controller.ContatoController;
import main.java.com.femina.produto.Controller.EnderecoController;
import main.java.com.femina.produto.Model.Cliente;
import main.java.com.femina.produto.Model.Contatos;
import main.java.com.femina.produto.Model.Endereco;
import main.java.com.femina.produto.Model.Fornecedor;

import java.io.*;
import java.util.*;

public class ClienteDao {

    public void gravarCliente(Cliente cliente){
        File arq = new File("clientes.txt");

        try {
            if(arq.isFile() ==  false){
                arq.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(arq, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(cliente.getId() + ";");
            printWriter.print(cliente.getNome() + ";");
            printWriter.print(cliente.getIdade() + ";");
            printWriter.print(cliente.getSenha() + ";");
            printWriter.print(cliente.getContatos().getId() + ";");
            printWriter.println(cliente.getEndereco().getIdEndereco());

            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> retornaCliente(){
        List<Cliente> clientes = new ArrayList<>();
        try {
            File arquivoDeTexto = new File ("clientes.txt");

            if(!arquivoDeTexto.isFile()){
                arquivoDeTexto.createNewFile();
            }

            FileReader fileReader = new FileReader(arquivoDeTexto);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            List<String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();

            int i = 0;
            for (String s : result) {
                String[] cl = s.split(";");

                Cliente cliente = new Cliente();
                i++;
                cliente.setId(Integer.valueOf(cl[0]));
                cliente.setNome(cl[1]);
                cliente.setIdade(Integer.valueOf(cl[2]));
                cliente.setSenha(cl[3]);
                ContatoController cc = new ContatoController();
                List<Contatos> ldc = cc.mostraContato();
                cliente.setContatos(ldc.get(Integer.valueOf(cl[4])));
                EnderecoController ec = new EnderecoController();
                List<Endereco> lde = ec.mostraEndereco();
                cliente.setEndereco(lde.get(Integer.valueOf(cl[5])-1));

                clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public void updelCliente(List<Cliente> ldc){
        try {

            FileWriter fileWriter = new FileWriter("clientes.txt", false);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            for (int list = 0; list < ldc.size(); list++) {
                printWriter.println(ldc.get(list));
            }

            printWriter.flush();
            printWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
