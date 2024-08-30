package Exercicios.Collections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> numeros;

    public SomaNumeros () {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero (int numero) {
        numeros.add(numero);
    }

    public int calcularSoma () {
        int soma = 0;
        if (!numeros.isEmpty()) {
            for (Integer i : numeros){
                soma += i;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = numeros.get(0);
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i >= maiorNumero) {
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = numeros.get(0);
        if (!numeros.isEmpty()) {
            for (Integer i : numeros) {
                if (i <= menorNumero) {
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);

        System.out.println("Soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Lista de números: " + somaNumeros.exibirNumeros());
    }

}
