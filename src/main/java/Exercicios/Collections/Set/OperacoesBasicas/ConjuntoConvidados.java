package Exercicios.Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidados.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigo (int codigo) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidados) {
            if (c.getCodigoConvite() == codigo) {
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("Código inexistente.");
            }
        }
        convidados.remove(convidadoParaRemover);
    }

    public int quantConvidados() {
        return convidados.size();
    }

    public void exibirConvidados() {
        System.out.println(convidados);
    }

    public static void main(String[] args) {

        ConjuntoConvidados listaConvidados = new ConjuntoConvidados();
        listaConvidados.adicionarConvidado("Adma", 01);
        listaConvidados.adicionarConvidado("Joanderson", 01);  //Não salvo devido ao EQUALS
        listaConvidados.adicionarConvidado("Joao", 02);
        listaConvidados.adicionarConvidado("Kayo", 03);

        listaConvidados.exibirConvidados();
        listaConvidados.removerConvidadoPorCodigo(03);
        listaConvidados.exibirConvidados();
        listaConvidados.quantConvidados();

    }
}
