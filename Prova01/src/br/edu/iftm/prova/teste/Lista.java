package br.edu.iftm.prova.teste;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {
    private T[] elementos;
    private T[] elementosJ;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.elementosJ = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean inverte() {
        int x = 0;
        for (int i = tamanho - 1; i >= 0; i--) {
            this.elementosJ[x] = this.elementos[i];
            x++;
        }
        x = 0;
        for (int i = 0; i <= tamanho - 1; i++) {
            this.elementos[x] = this.elementosJ[i];
            x++;
        }
        return true;
    }

    public boolean adiciona(int posicao, T elemento) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posicao Invalida");
        }
        this.aumentaCapacidade();
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public int tamanho() {
        return this.tamanho;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                elementosNovos[i] = elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao) throws IllegalAccessException {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalAccessException("Posicao Invalida");
        }
        return this.elementos[posicao];
    }

    @Override
    public String toString() {

        StringBuilder p = new StringBuilder();
        p.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            p.append(this.elementos[i]);
            p.append(", ");
        }

        if (this.tamanho > 0) {
            p.append(this.elementos[this.tamanho - 1]);
        }

        p.append("]");

        return p.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(elementos);
        result = prime * result + tamanho;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lista other = (Lista) obj;
        if (!Arrays.deepEquals(elementos, other.elementos))
            return false;
        if (tamanho != other.tamanho)
            return false;
        return true;
    }

}