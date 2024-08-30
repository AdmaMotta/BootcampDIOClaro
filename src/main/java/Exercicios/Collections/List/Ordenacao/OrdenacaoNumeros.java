package Exercicios.Collections.List.Ordenacao;

import java.util.*;

public class OrdenacaoNumeros {

    List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenacaoCrescente() {
        List<Integer> numerosCrescentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosCrescentes, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i1, i2);
            }
        });
        return numerosCrescentes;
    }

    public List<Integer> ordenacaoDescrescent() {
        List<Integer> numerosDescrescentes = new ArrayList<>(listaNumeros);
        Collections.sort(numerosDescrescentes, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i2, i1);
            }
        });
        return numerosDescrescentes;
    }

    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println(ordenacaoNumeros.listaNumeros);
        System.out.println(ordenacaoNumeros.ordenacaoCrescente());
        System.out.println(ordenacaoNumeros.ordenacaoDescrescent());
    }
}
