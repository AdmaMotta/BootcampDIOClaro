package Exercicios.Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco){
        estoque.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void listarProdutos() {
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque (){
        double valorTotal = 0.0;
        if(!estoque.isEmpty()){
            for (Produto p : estoque.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto produtoMaisCaro () {
        Produto maisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if(!estoque.isEmpty()){
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorValor){
                    maisCaro = p;
                    maiorValor = p.getPreco();
                }
            }
        }
        return maisCaro;
    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.listarProdutos();

        estoqueProdutos.adicionarProduto(123L,"Cebola", 1, 1.5);
        estoqueProdutos.adicionarProduto(122L,"Tomate", 1, 5.5);
        estoqueProdutos.adicionarProduto(133L,"Café", 1, 10);

        estoqueProdutos.listarProdutos();

        System.out.println(estoqueProdutos.produtoMaisCaro());
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
    }


}
