package Exercicios.Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> listaPalavras;

    public ConjuntoPalavrasUnicas () {
        listaPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        listaPalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraARemover = null;
        for (String s : listaPalavras) {
            if (s.equalsIgnoreCase(palavra)) {
                palavraARemover = palavraARemover;
                break;
            } else {
                System.out.println("A palavra não consta na lista.");
            }
        }
        listaPalavras.remove(palavraARemover);
    }

    public String verificarPalavra (String palavra) {
        String consta = null;
        for (String s : listaPalavras) {
            if (s.equalsIgnoreCase(palavra)) {
                consta = "Consta";
                break;
            } else {
                consta = "Não consta";
            }
        }
        return consta;
    }

    public Set exibirPalavrasUnicas() {
        return listaPalavras;
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Bola");
        conjuntoPalavrasUnicas.adicionarPalavra("Bola");
        conjuntoPalavrasUnicas.adicionarPalavra("Trave");
        conjuntoPalavrasUnicas.adicionarPalavra("Gramado");
        conjuntoPalavrasUnicas.adicionarPalavra("Torcedor");
        conjuntoPalavrasUnicas.adicionarPalavra("Torcedor");
        conjuntoPalavrasUnicas.adicionarPalavra("Jogador");
        conjuntoPalavrasUnicas.adicionarPalavra("Arbitro");

        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());
        conjuntoPalavrasUnicas.removerPalavra("Trave");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Bola2"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Bola"));
        conjuntoPalavrasUnicas.adicionarPalavra("Bola2");
        conjuntoPalavrasUnicas.adicionarPalavra("Cerveja2");
        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());

    }


}
