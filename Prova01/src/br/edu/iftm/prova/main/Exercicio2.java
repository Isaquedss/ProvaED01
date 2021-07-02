package br.edu.iftm.prova.main;

import br.edu.iftm.prova.teste.PilhaLista;

public class Exercicio2 {
    public static void main(String[] args) {

        System.out.println("Exercicio 02");

        PilhaLista pilhaLista = new PilhaLista<>();

        pilhaLista.adicionar("Taffarel");
        pilhaLista.adicionar("Pelé");
        pilhaLista.adicionar("Maradona");
        pilhaLista.adicionar("Kaká");
        pilhaLista.adicionar("Ronaldinho");

        System.out.println("5 jogadores entraram em campo " + pilhaLista);

        pilhaLista.remover();

        System.out.println("Um Jogador saiu machucado " + pilhaLista + "\n");

        pilhaLista.adicionar("Miranda");

        System.out.println("Entrou o reserva " + pilhaLista);

        pilhaLista.remover();

        System.out.println("Um jogador foi expulso: " + pilhaLista);

        System.out.println();

    }
}
