package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> meuArray = new ArrayList<>();
        List<String> meuArray2 = new ArrayList<>();
        String teste = "";
        int i=1;
        JOptionPane.showMessageDialog(null, "ATENÇÃO!Quando terminar de digitar sua lista NÃO clique em CANCELAR, apenas digite Fim\n" );
        while(!teste.equalsIgnoreCase("FIM")) {
            teste = JOptionPane.showInputDialog("Digite a " + i + " palavra da lista 1");
            if(!teste.equalsIgnoreCase("FIM"))
                meuArray.add(teste);
            i++;
        }
        JOptionPane.showMessageDialog(null, "Exibindo o ArrayList 1\n" + meuArray);
        teste="";
        i=1;
        while(!teste.equalsIgnoreCase("FIM")) {
            teste = JOptionPane.showInputDialog("Digite a " + i + " palavra da lista 2");
            if(!teste.equalsIgnoreCase("FIM"))
                meuArray2.add(teste);
            i++;
        }
        JOptionPane.showMessageDialog(null, "Exibindo o ArrayList 2\n" + meuArray2);
        Listas objeto = new Listas(meuArray,meuArray2);
        JOptionPane.showMessageDialog(null, "OS duplicados são:\n" + objeto.duplicadas() +"\nAté a próxima amigos!");
    }
}