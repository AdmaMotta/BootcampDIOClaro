package Exercicios.Collections.Set.Pesquisa;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaARemover = null;
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaARemover = t;
                break;
            }
        }
        if (tarefaARemover != null) { // Verifica se encontrou uma tarefa a ser removida
            tarefas.remove(tarefaARemover);
        }
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefas;
    }

    public int quantTarefas() {
        return tarefas.size();
    }

    public Set<Tarefa> tarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> tarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefas) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente (String descricao) {
        for (Tarefa t : tarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                if (t.isConcluida() == true) {
                    t.setConcluida(false);
                }
            }
        }
    }
    public void limparListaTarefas() {
        tarefas.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 01");
        listaTarefas.adicionarTarefa("Tarefa 02");
        listaTarefas.adicionarTarefa("Tarefa 03");
        listaTarefas.adicionarTarefa("Tarefa 04");
        listaTarefas.adicionarTarefa("Tarefa 05");

        System.out.println(listaTarefas.exibirTarefas());
        System.out.println(listaTarefas.quantTarefas());
        listaTarefas.marcarTarefaConcluida("Tarefa 01");
        listaTarefas.marcarTarefaConcluida("Tarefa 03");
        listaTarefas.marcarTarefaConcluida("Tarefa 05");
        System.out.println(listaTarefas.tarefasPendentes());
        listaTarefas.removerTarefa("Tarefa 04");
        System.out.println(listaTarefas.exibirTarefas());
        listaTarefas.limparListaTarefas();
        System.out.println(listaTarefas.exibirTarefas());

    }

}
