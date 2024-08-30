package Exercicios.Collections.Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> agenda;

    public AgendaContatos() {
        agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public void listarContatos() {
        System.out.println(agenda);
    }

    public Set<Contato> pesquisarPorNome (String nome) {
        Set <Contato> contatosNome = new HashSet<>();
        for (Contato c : agenda) {
            if (c.getNome().startsWith(nome)) {
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumeroContato (String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : agenda) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Adma", 123);
        agendaContatos.adicionarContato("José", 123);
        agendaContatos.adicionarContato("Edlly", 1234);
        agendaContatos.adicionarContato("Mae", 12345);
        agendaContatos.adicionarContato("Mae", 12349);
        agendaContatos.adicionarContato("Pai", 123456);

        agendaContatos.listarContatos();
        agendaContatos.listarContatos();
        agendaContatos.atualizarNumeroContato("Edlly", 1212);
        agendaContatos.listarContatos();
        agendaContatos.pesquisarPorNome("Mae");
    }


}
