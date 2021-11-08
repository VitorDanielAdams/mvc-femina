package main.java.com.femina.produto.View;

import main.java.com.femina.produto.Controller.TamanhoController;
import main.java.com.femina.produto.Model.Tamanho;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TamanhoView {

    Scanner entrada = new Scanner(System.in);
    TamanhoController tamanhoController = new TamanhoController();
    List<Tamanho> tamanhos = new ArrayList<>();


    public void cadastrarTamanho(){
        Tamanho tamanho = new Tamanho();
        System.out.println("Tamanho:");
        String tamanhoValue = entrada.next();
        tamanho.setTam(tamanhoValue);
        tamanhos.add(tamanho);
        System.out.println("Deseja continuar?\n1 - SIM\n2 - NÃO");
        int continuar = entrada.nextInt();
        if(continuar == 2){
            System.out.println(tamanhos);
            tamanhoController.cadastrarTamanho(tamanhos);
        }else{
            cadastrarTamanho();
        }
    }

}
