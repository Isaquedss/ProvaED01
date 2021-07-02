package br.edu.iftm.prova.teste;

import java.util.LinkedList;

public class PilhaLista<List> extends LinkedList {

    private Object[] elementos;
    private int tamanho;

    public boolean adicionar(List elemento) {
        this.add(elemento);
        return true;
    }

    public boolean remover() {
        if (this.isEmpty()) {
            return false;
        } else {
            this.remove(this.remove(this.size() - 1));
            return true;
        }
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        int teste = this.size() - 1;

        for (int i = 0; i < this.size(); i++) {
            s.append(this.get(i));
            if (i != teste) {
                s.append(", ");
            }
        }

        s.append("]");

        return s.toString();
    }
}
