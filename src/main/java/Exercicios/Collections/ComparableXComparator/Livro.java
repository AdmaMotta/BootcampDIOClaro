package Exercicios.Collections.ComparableXComparator;

import java.util.Comparator;

class Livro implements Comparable<Livro> {

    private String titulo;
    private String autor;
    private Integer ano;

    // CONSTRUCTORS
    public Livro (String titulo, String autor, Integer ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAno() {
        return ano;
    }

    // Usando Comparable para ordenar livros por ano (Dentro da classe principal)
    public int compareTo(Livro l) {
        return titulo.compareTo(l.titulo);
    }
}

class CompararAutor implements Comparator<Livro> {

    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareTo(l2.getAutor());
    }
}

//Classe para comprar Livro por ano
class CompararAno implements Comparator<Livro> {

    public int compare(Livro l1, Livro l2) {
        return Integer.compare(l1.getAno(), l2.getAno());
    }
}

class CompararAnoAutorTitulo implements Comparator<Livro> {

    public int compare (Livro l1, Livro l2){
        int ano = Integer.compare(l1.getAno(), l2.getAno());
        if (ano != 0) return ano;

        int autor = l1.getAutor().compareTo(l2.getAutor());
        if (autor != 0) return autor;

        return l1.getTitulo().compareTo(l2.getTitulo());
    }
}