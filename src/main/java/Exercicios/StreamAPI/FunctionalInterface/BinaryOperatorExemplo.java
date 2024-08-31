package Exercicios.StreamAPI.FunctionalInterface;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {

    /*
    Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do memsmo tipo T.
    É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
     */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // BinaryOperator + Lambda
        BinaryOperator<Integer> somar = Integer::sum;

        // Usa o BinaryOperator para somar todos os números no Stream
        int resultado = numeros.stream()
                .reduce(0, somar);

        System.out.println("Soma total: " + resultado);
    }

}
