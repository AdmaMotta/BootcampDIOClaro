package Exercicios.Collections.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatos;

    public AgendaContatos() {
        agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatos.put(nome, telefone);
    }

    public void removerContato (String nome) {
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }

    public void listarContatos () {
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome (String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatos.isEmpty()) {
            numeroPorNome = agendaContatos.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Mota", 222);
        agenda.adicionarContato("Alves", 333);
        agenda.adicionarContato("Ribeiro", 444);

        agenda.listarContatos();

        agenda.adicionarContato("Adma", 111);

        System.out.println(agenda.pesquisarPorNome("Adma"));

        agenda.removerContato("Alves");

        agenda.listarContatos();

    }
}
