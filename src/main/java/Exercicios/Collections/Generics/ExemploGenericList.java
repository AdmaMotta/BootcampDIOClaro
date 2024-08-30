package Exercicios.Collections.Generics;

import java.util.List;
import java.util.ArrayList;

public class ExemploGenericList {

    public static void main(String[] args) {

        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        // Iterando sobre a lista sem o Generics (necessário realizar o CAST)
        for (Object e : listaSemGenerics){
            String str = (String) e;             //repassando o tipo do elemento a ser trabalhado
            System.out.println(e);
        }

        // Exemplo com Generics
        List <String> listaComGenerics = new ArrayList<>();
        listaComGenerics.add("Elemento 1");
        listaComGenerics.add("Elemento 2");

        // Iterando sobre a lista com o Generics
        for (String e : listaComGenerics){       //Não é necessário fazer o cast
            System.out.println(e);               // pois o tipo de elementos da lista
        }                                        // já está específicado
    }

}
