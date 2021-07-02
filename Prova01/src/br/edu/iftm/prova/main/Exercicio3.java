package br.edu.iftm.prova.main;

import br.edu.iftm.prova.teste.ListaLigada;

public class Exercicio3 {
    public static void main(String[] args) {

        System.out.println("Exercicio 3: ");
        ListaLigada listaOn = new ListaLigada();
        ListaLigada listaInter = new ListaLigada();

        listaInter.add(5);
        listaInter.add(6);
        listaInter.add(7);
        listaInter.add(8);
        listaInter.add(9);

        listaInter.intercalar(listaInter);

        System.out.println("\nLista intercalada: " + listaInter);
        System.out.println();
        System.out.println("Lista baseada no Exercicio 01: \n");

        listaOn.add(11);
        listaOn.add(13);
        listaOn.add(15);
        listaOn.add(17);
        listaOn.add(19);

        System.out.println("Lista Ordenada: " + listaOn);
        listaOn.inverte();
        System.out.println("Lista invertida: " + listaOn);
        listaOn.inverte();
        System.out.println();

    }
}
