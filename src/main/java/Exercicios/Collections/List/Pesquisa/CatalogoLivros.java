package Exercicios.Collections.List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor (String autor) {
        List<Livro> livrosAutor = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
        }
        return livrosAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livrosIntervalo = new ArrayList<>();
        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal ){
                    livrosIntervalo.add(l);
                }
            }
        }
        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro primeiroLivroEncontrado = null;
        if (!livros.isEmpty()){
            for (Livro l : livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    primeiroLivroEncontrado = l;
                    break;
                }
            }
        }
        return primeiroLivroEncontrado;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2001);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2003);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2004);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1980);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000,2004));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}
