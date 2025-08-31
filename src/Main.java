import br.com.fal.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Angular");
        curso2.setDescricao("Descrição curso Angular");
        curso2.setCargaHoraria(6);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Aula de Java");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Starter GFT 7");
        bootcamp.setDescricao("Irei passar no GFT Starter e virar estagiario da GFT");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devFal = new Dev();
        devFal.setNome("Felipe Aguiar Lopes");
        devFal.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devFal.getConteudosInscritos());
        devFal.progredir();
        System.out.println("Conteudos Concluidos" + devFal.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + devFal.getConteudosInscritos());
        System.out.println("XP: "+ devFal.calcularTotalXp());

        Dev devJunior = new Dev();
        devFal.setNome("Juninho GFT" + devJunior.getConteudosInscritos());
        System.out.println("Conteudos inscritos" + devJunior.getConteudosInscritos());


    }
}
