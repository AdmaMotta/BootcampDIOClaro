package Exercicios.Collections.Generics;

import java.util.HashMap;
import java.util.Map;

public class ExemploGenericsMap {

    public static void main(String[] args) {

        //Sem Generics
        Map semGenerics = new HashMap();
        semGenerics.put("Elemento 1", 10);
        semGenerics.put("Elemento 2", "valor");

        // Iterando sobre o Map sem Generics
        for (Object e : semGenerics.entrySet()) {
            Map.Entry entry = (Map.Entry) e;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: " + chave + ", Valor; " + valor);
        }

        // Com Generics
        Map <String, Integer> comGenerics = new HashMap<>();
        comGenerics.put("Elemento 1", 10);
        comGenerics.put("Elemento 2", 20);

        // Iterando sobre o Map com Generics
        for (Map.Entry<String, Integer> entry : comGenerics.entrySet()){
            String chave = entry.getKey();
            Integer valor = entry.getValue();
            System.out.println("Chave; " + chave + ", Valor: " + valor);
        }
    }
}
