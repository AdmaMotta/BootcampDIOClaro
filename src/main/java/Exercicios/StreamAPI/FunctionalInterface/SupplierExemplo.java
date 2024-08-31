package Exercicios.StreamAPI.FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {

    /*
    Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
    É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
     */

    public static void main(String[] args) {

        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá Mundo!";

        // Usa o Supplier para obter uma lista com 5 saudações
        List<String> saudacoes = Stream.generate(() -> "Olá Mundo")
                .limit(5)
                .toList();

        // Imprime as saudações geradas
        saudacoes.forEach(System.out::println);
    }

}
