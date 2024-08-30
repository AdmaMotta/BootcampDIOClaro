package Exercicios.Collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> listaTarefas;

    public ListaTarefa() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa (String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas () {
        return listaTarefas.size();
    }

    public void obterDescricaoTarefas () {
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Introdução a List");
        listaTarefa.adicionarTarefa("Exercicio com List");
        listaTarefa.adicionarTarefa("Projeto com List");
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Introdução a List");
        System.out.println("Número total de elementos na lista: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }

}
