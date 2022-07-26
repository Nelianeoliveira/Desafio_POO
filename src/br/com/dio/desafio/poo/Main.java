package br.com.dio.desafio.poo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Curso curso1 = new Curso();
curso1.setTitulo("curso java");
curso1.setDescricao("Descrição curso java");
curso1.setCargaHoraria(8);

Curso curso2 = new Curso();
curso2.setTitulo("curso js");
curso2.setDescricao("Descrição curso js");
curso2.setCargaHoraria(4);

//Conteudo conteudo = new Curso();//Polimorfismo
// Conteudo conteudo = new Mentoria();//Polimorfismo



Mentoria mentoria = new Mentoria();
mentoria.setTitulo("Mentoria de java ");
mentoria.setDescricao("Descrição mentoria de java");
mentoria.setData(LocalDate.now());



        /*System.out.println(curso1);
System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devNeliane = new Dev();
            devNeliane.setNome("Neliane");
            devNeliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Neliane:" + devNeliane.getConteudosInscritos());
            devNeliane.progredir();
            devNeliane.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Neliane:" + devNeliane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Neliane:" + devNeliane.getConteudosConcluidos());
        System.out.println("XP:" + devNeliane.calcularTotalXp());

        System.out.println("-------");

        Dev devDavid = new Dev();
            devDavid.setNome("David");
            devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos David:" + devDavid.getConteudosInscritos());
            devDavid.progredir();
            devDavid.progredir();
            devDavid.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos David:" + devDavid.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos David:" + devDavid.getConteudosConcluidos());
        System.out.println("XP:" + devDavid.calcularTotalXp());

    }
}
