package Exercicios.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String nome, Integer contagem){
        palavras.put(nome, contagem);
    }

    public void removerPalavra(String nome) {
        if(!palavras.isEmpty()){
            palavras.remove(nome);
        }
    }

    public int quantPalavras () {
        int quant = 0;
        for (int contagem : palavras.values()) {
            quant += contagem;
        }
        return quant;
    }

    public String encontrarPalavraMaisFrequente () {
        String maisFrequente = null;
        Integer quantRepeticoes = 0;
            for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
                quantRepeticoes = entry.getValue();
                maisFrequente = entry.getKey();
            }
        return maisFrequente;
    }


}
