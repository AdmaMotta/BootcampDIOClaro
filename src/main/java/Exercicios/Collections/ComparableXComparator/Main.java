package Exercicios.Collections.ComparableXComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>() {
            {
                add(new Livro("Java", "Peter Jandl Jr.", 2021));
                add(new Livro("Desenvolvimento Real de Software", "Raoul-Gabriel Urma e  Richard Warburton", 2021));
                add(new Livro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017));
            }
        };

        System.out.println("-----------------------------------------------");

        System.out.println("Livros após a ordenação natural (Titulo): ");
        Collections.sort(livros);
        for (Livro livro : livros) {
            System.out.println("TITULO: " + livro.getTitulo() + " | " + "AUTOR: " + livro.getAutor() + " | " + "ANO: " + livro.getAno());
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Livros após a ordenação por Ano: ");
        livros.sort(new CompararAno());
        for (Livro livro : livros) {
            System.out.println("ANO: " + livro.getAno() + " | " + "TITULO: " + livro.getTitulo() + " | " + "AUTOR: " + livro.getAutor());
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Livros após ordenação por Autor");
        livros.sort(new CompararAutor());
        for (Livro livro : livros) {
            System.out.println("AUTOR: " + livro.getAutor() + " | " + "TITULO: " +  livro.getTitulo() + " | " + "ANO: " + livro.getAno());
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Livros após ordenação por Ano, Autor e Título: ");
        livros.sort(new CompararAnoAutorTitulo());
        for (Livro livro : livros) {
            System.out.println("ANO: " + livro.getAno() + " | " + "AUTOR: " + livro.getAutor() + " | " + "TITULO: " + livro.getTitulo());
        }

    }
}
