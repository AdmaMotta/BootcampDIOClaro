package Exercicios.StreamAPI.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExemplo {

    /*
    Representa uma operação que aceita um argumento do tipo T e não retorna NENHUM resultado.
    É utilizada PRINCIPALMENTE para realizar ações, ou efeitos colaterais nos elementos do Stream
    SEM MODIFICAR, ou retornar um valor
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // Usar o Consumer com expressão Lambda para imprimir apenas os pares
        Consumer<Integer> numerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer, Predicate e Lambda para imprimir números pares no Strem
        numeros.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
