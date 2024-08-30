package Exercicios.Collections.Generics;

import java.util.HashSet;
import java.util.Set;

public class ExemploGenericSet {

    public static void main(String[] args) {

        // Exemplo sem o Generics
        Set semGenerics = new HashSet();
        semGenerics.add("Elemento 1");
        semGenerics.add(10);

        // Iterando sobre o conjunto sem Generics (necessário fazer o CAST)
        for (Object e : semGenerics){
            String str = (String) e;
            System.out.println(e);
        }

        // Exemplo com o Generics
        Set <String> comGenerics = new HashSet();
        comGenerics.add("Elemento 1");
        comGenerics.add("Elemento 2");

        // Iterando sobre o conjunto com o Generics
        for (String e : comGenerics){
            System.out.println(e);
        }
    }
}
