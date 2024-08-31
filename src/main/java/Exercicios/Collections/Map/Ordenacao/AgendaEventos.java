package Exercicios.Collections.Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionarEvento (LocalDate data, String nome, String atracao) {
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosEmOrdem = new TreeMap<>(eventos);
        System.out.println(eventosEmOrdem);
    }

    public void obterProximoEvento () {
        LocalDate dataHoje = LocalDate.now();
        LocalDate dataEvento = null;
        Evento evento = null;
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()) {
            if (entry.getKey().isEqual(dataHoje) || entry.getKey().isAfter(dataHoje)) {
                dataEvento = entry.getKey();
                evento = entry.getValue();
                System.out.println("Evento: " + evento + " | Data: " + dataEvento);
                break;
            }
        }
    }

    public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado" + "\n");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento" + "\n");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão" + "\n");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas" + "\n");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada" + "\n");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    }
}
