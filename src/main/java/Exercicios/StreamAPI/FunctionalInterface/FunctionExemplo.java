package Exercicios.StreamAPI.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {

    /*
    Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
    É utilizada para transformar ou mapear os elementos do StrEam em outros valores ou tipos.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usa o Function com expressão lambda para dobrar o valor de cada número
        Function<Integer, Integer> dobrados = n -> n * 2;

        // Usa a função oara dobrar todos os números no Stream e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrados)
                .toList();

        //Imprime a lista de números dobrados
        numerosDobrados.forEach(System.out::println);
    }
}
