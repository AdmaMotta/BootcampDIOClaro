package Exercicios.Collections.Set.Ordenacao;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadosAlunos {

    Set<Aluno> listaAlunos;

    public GerenciadosAlunos() {
        listaAlunos = new HashSet<>();
    }

    public void adicionarAluno (long matricula, String nome, double nota) {
        listaAlunos.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno (long matricula) {
        Aluno alunoRemover = null;
        for (Aluno a : listaAlunos) {
            if (a.getMatricula() == matricula) {
                alunoRemover = a;
                break;
            }
        }
        listaAlunos.remove(alunoRemover);
    }

    public Set<Aluno> listarPorNome() {
        Set<Aluno> listaPorNome = new TreeSet<>(listaAlunos);
        return listaPorNome;
    }

    public Set<Aluno> listarPorNota() {
        Set<Aluno> listaPorNota = new TreeSet<>(new Aluno.ComparatorPorNota());
        listaPorNota.addAll(listaAlunos);
        return listaPorNota;
    }

    public Set<Aluno> listarAlunos() {
        return listaAlunos;
    }

    public static void main(String[] args) {

        GerenciadosAlunos gerenciadosAlunos = new GerenciadosAlunos();

        gerenciadosAlunos.listarAlunos();
        gerenciadosAlunos.adicionarAluno(123,"Adma", 7.5);
        gerenciadosAlunos.adicionarAluno(132,"Joao", 0.5);
        gerenciadosAlunos.adicionarAluno(321,"Kayo", 8.5);

        System.out.println(gerenciadosAlunos.listarAlunos());

        System.out.println(gerenciadosAlunos.listarPorNome());
        System.out.println(gerenciadosAlunos.listarPorNota());
        gerenciadosAlunos.removerAluno(132);
        System.out.println(gerenciadosAlunos.listarAlunos());


    }

}
