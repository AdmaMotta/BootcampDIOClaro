package Exercicios.StreamAPI.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {

    /*
    Representa uma função que aceita um argumento do tipo T e retorna um valor booleano.
    É comumente usada para filtrar elementos do Srtam com em alguma condição.
     */

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "C", "C#");

        // Predicate + Lambda
        Predicate<String> maisDeCincoCaracteres = p -> p.length() > 5;

        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e imprimir
        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);

    }


}
