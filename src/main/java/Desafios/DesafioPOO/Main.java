package Desafios.DesafioPOO;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso01 = new Curso();
        curso01.setTitulo("Java");
        curso01.setDescricao("Para Iniciantes");
        curso01.setCargaHoraria(8);

        Curso curso02 = new Curso();
        curso02.setTitulo("Python");
        curso02.setDescricao("Para Iniciantes");
        curso02.setCargaHoraria(5);

        Mentoria mentoria01 = new Mentoria();
        mentoria01.setTitulo("Mentoria Java");
        mentoria01.setDescricao("Sobre POO");
        mentoria01.setData(LocalDate.now());

        Mentoria mentoria02 = new Mentoria();
        mentoria02.setTitulo("Mentoria SpringBoot");
        mentoria02.setDescricao("Sobre produtividade");
        mentoria02.setData(LocalDate.now());

        BootCamp bootCamp01 = new BootCamp();
        bootCamp01.setNome("BootCamp Java");
        bootCamp01.setDescricao("Do zero ao avançado");
        bootCamp01.getConteudos().add(curso01);
        bootCamp01.getConteudos().add(mentoria01);
        bootCamp01.getConteudos().add(mentoria02);

        Dev devAdma = new Dev();
        devAdma.setNome("Adma Motta");
        devAdma.inscreverBootCamp(bootCamp01);
        System.out.println("Conteúdos inscritos: " + devAdma.getConteudosInscritos());
        devAdma.progredir();
        devAdma.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos de Adma: " + devAdma.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Adma: " + devAdma.getConteudosConcluidos());
        System.out.println("XP: " + devAdma.calcularTotalXP());







    }
}
