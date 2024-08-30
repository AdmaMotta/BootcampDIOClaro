package Exercicios.Collections.List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa (String nome, int idade, double altura){
        pessoas.add(new Pessoa (nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade () {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura () {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        pessoasPorAltura.sort(new compararPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Joao", 20, 1.70);
        ordenacaoPessoas.adicionarPessoa("Maria", 18, 1.50);
        ordenacaoPessoas.adicionarPessoa("Pedro", 23, 1.90);
        ordenacaoPessoas.adicionarPessoa("Joana", 19, 1.55);
        ordenacaoPessoas.adicionarPessoa("Lucas", 29, 1.80);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.pessoas);
    }

}
