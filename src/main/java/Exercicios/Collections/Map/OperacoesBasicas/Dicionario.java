package Exercicios.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> listaPalavras;

    public Dicionario() {
        listaPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String descricao) {
        listaPalavras.put(palavra, descricao);
    }

    public void removePalavra(String palavra) {
        if(!listaPalavras.isEmpty()) {
            listaPalavras.remove(palavra);
        }
    }

    public void listarPalavras () {
        System.out.println(listaPalavras);
    }

    public String pesquisarPorPalavra (String palavra) {
        String descricaoPorPalavra = null;
        if (!listaPalavras.isEmpty()) {
            descricaoPorPalavra = listaPalavras.get(palavra);
        }
        return descricaoPorPalavra;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.listarPalavras();

        dicionario.adicionarPalavra("Futebol", "Esporte");
        dicionario.adicionarPalavra("FIFA 14", "Video Game");
        dicionario.adicionarPalavra("Jogador", "Atleta");

        dicionario.listarPalavras();
        dicionario.removePalavra("FIFA 14");
        dicionario.listarPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Futebol"));

    }

}
