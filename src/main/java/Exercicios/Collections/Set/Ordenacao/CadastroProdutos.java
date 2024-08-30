package Exercicios.Collections.Set.Ordenacao;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> listaProdutos;

    public CadastroProdutos() {
        listaProdutos = new HashSet<>();
    }

    public void adicionarProduto (String nome, int codigo, double preco, int quantidade) {
        listaProdutos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public void removerProduto (String nome) {
        Produto produtoARemover = null;
        for (Produto p : listaProdutos) {
            if (p.getNome().equalsIgnoreCase(nome)){
                produtoARemover = p;
                break;
            }
        }
        listaProdutos.remove(produtoARemover);
    }

    public Set<Produto> listarPorNome () {
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos); //O TREESET REORGANIZA NO LUGAR DO COLLECTIONS
        return produtosPorNome;
    }

    public Set<Produto> listarProdutosPorPreco () {
        Set<Produto> produtosPorPreco = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtosPorPreco.addAll(listaProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto("Batata", 1, 1.5, 5);
        cadastroProdutos.adicionarProduto("Cebola", 2, 2.3, 2);
        cadastroProdutos.adicionarProduto("Repolho", 3, 5.5, 3);
        cadastroProdutos.adicionarProduto("Cenoura", 4, 3.5, 7);

        System.out.println(cadastroProdutos.listaProdutos);
        System.out.println(cadastroProdutos.listarProdutosPorPreco());
        System.out.println(cadastroProdutos.listarPorNome());
        cadastroProdutos.removerProduto("Batata");
        System.out.println(cadastroProdutos.listaProdutos);

    }

}
