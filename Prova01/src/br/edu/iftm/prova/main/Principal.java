package br.edu.iftm.prova.main;

import br.edu.iftm.prova.teste.Lista;

public class Principal {
    public static void main(String[] args) throws IllegalAccessException {

        Lista lista = new Lista(10);

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.adiciona(4);
        lista.adiciona(16);

        System.out.println("Exercicio 1-A) \n");
        System.out.println("Lista Ordenada: " + lista);
        lista.inverte();
        System.out.println("Lista Invertida: " + lista);
        lista.inverte();
        System.out.println();

    }
}
