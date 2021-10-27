package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.MarcaController;
import main.java.com.femina.produto.Model.Cor;
import main.java.com.femina.produto.Controller.CorController;
import main.java.com.femina.produto.Model.Marca;

import java.io.IOException;
import java.util.*;

public class CorView {
    public void cadastro(){

        Cor cor = new Cor();
        Scanner entrada  = new Scanner(System.in);
        CorController cc = new CorController();

        System.out.println("Informe a cor:");
        cor.setNome(entrada.next());

        System.out.println("Informe o Hexadecimal:");
        cor.setHexadecimal(entrada.next());

        cc.cadastraCor(cor);
    }
    public void mostrarCor() throws IOException {

        CorController cd = new CorController();

        List<Cor> listaCores = cd.mostraCorCadastrada();

        for (int i = 0; i < listaCores.size(); i++) {
            System.out.println(listaCores.get(i));
        }

    }
    public void editaCor()  throws IOException {

        CorController cd = new CorController();

    }
}
