package Exercicios.Collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaDeItens;

    public CarrinhoDeCompras () {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem (String nome) {
        List<Item> itensARemover = new ArrayList<>();
        for (Item i : listaDeItens){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensARemover.add(i);
            }
        }
        listaDeItens.removeAll(itensARemover);
    }

    public float calcularValorTotal() {
        float valorTotal = 0;
        for (Item i : listaDeItens) {
            float valorTotalItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorTotalItem;
        }
        return valorTotal;
    }

    public List<Item> exibirItens(){
        return listaDeItens;
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        System.out.println("Itens: " + carrinho.exibirItens());

        carrinho.adicionarItem("Tomate", 2,3);
        carrinho.adicionarItem("Cebola", (float) 3.3,2);
        carrinho.adicionarItem("Coentro", (float) 1.5,1);
        System.out.println("Itens: " + carrinho.exibirItens());

        carrinho.removerItem("Coentro");
        System.out.println("Itens: " + carrinho.exibirItens());

        float valorTotalCarrinho = carrinho.calcularValorTotal();
        System.out.println("Valor total: R$" + valorTotalCarrinho);

    }


}
