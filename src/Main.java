import br.com.dio.desafio.dominio.*;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Instanciar Curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        //Instanciar Curso
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        //Instanciar Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        //Criar bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //Criar devs
        Dev devFrancisco = new Dev();
        devFrancisco.setNome("Francisco");
        //Increver bootcamp
        devFrancisco.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Francisco" + devFrancisco.getConteudosInscritos());
        //Progredir bootcamp
        devFrancisco.progredir();
        devFrancisco.progredir();
        devFrancisco.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Francisco" + devFrancisco.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Francisco" + devFrancisco.getConteudosConcluidos());
        System.out.println("XP: " + devFrancisco.calcularTotalXp());

        System.out.println("--------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        //Increver bootcamp
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        //Progredir bootcamp
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */
    }
}
