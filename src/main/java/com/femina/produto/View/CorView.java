package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.MarcaController;
import main.java.com.femina.produto.Model.Cor;
import main.java.com.femina.produto.Controller.CorController;
import main.java.com.femina.produto.Model.Marca;

import java.io.IOException;
import java.util.*;

public class CorView {
    public void cadastro() throws IOException {

        Cor cor = new Cor();
        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);;
        CorController cc = new CorController();

        System.out.println("Informe a cor:");
        cor.setNome(entrada.next());

        System.out.println("Informe o Hexadecimal:");
        cor.setHexadecimal(entrada.next());

        List<Cor> ldc = cc.mostraCorCadastrada();
        ldc.add(cor);

        cc.cadastraCor(ldc);

        System.out.println("Cor cadastrada com sucesso" );
    }
    public void mostrarCor() throws IOException {

        CorController cd = new CorController();

        List<Cor> listaCores = cd.mostraCorCadastrada();

        for (int i = 0; i < listaCores.size(); i++) {
            System.out.println(listaCores.get(i).toMostra());
        }

    }
    public void editaCor()  throws IOException {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        CorController cd = new CorController();

        List<Cor> cores = cd.mostraCorCadastrada();

        for(int i = 0;i < cores.size();i++){
            System.out.println((i+1) + " - " + cores.get(i).toMostra());
        }

        System.out.println("Escolha qual cor quer editar");
        int select = entrada.nextInt();
        System.out.println("Selecione: 1-cor;2-hexadecimal");
        int selectItem = entrada.nextInt();
        switch (selectItem) {
            case 1:
                cores.get(select-1).setNome(entrada.next());
                break;
            case 2:
                cores.get(select-1).setHexadecimal(entrada.next());
                break;
            default:
                System.out.println("Opção inválida");
        }

        cd.editaCores(cores);
        System.out.println("Cor editada com sucesso!");
    }

    public void removeCor() throws IOException {

        Scanner entrada = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        CorController cd = new CorController();

        List<Cor> cores = cd.mostraCorCadastrada();

        for(int i = 0;i < cores.size();i++){
            System.out.println((i+1) + " - " + cores.get(i).toMostra());
        }

        System.out.println("Escolha qual cor quer deletar:");
        int select = entrada.nextInt();

        cores.remove(select - 1);

        cd.apagaCores(cores);

        System.out.println("Cor deletada com sucesso!");

    }

}
