import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Discrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Discrição curso Python");
        curso2.setCargaHoraria(12);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição Mentoria curso de java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome(("BootCamp Java Developer"));
        bootCamp.setDescricao("Descrição Bootcamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscrito Leonardo" + devLeonardo.getConteudosInscricos());
        devLeonardo.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscrito Leonardo" + devLeonardo.getConteudosInscricos());
        System.out.println("Conteudo Concluidos Leonardo" + devLeonardo.getConteudosConcluidos());
        System.out.println("XP: " + devLeonardo.calcularTotalXp());


        System.out.println("-----------------");


        Dev devIsis = new Dev();
        devIsis.setNome("Isis Regina");
        devIsis.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscrito Isis Regina" + devIsis.getConteudosInscricos());
        devIsis.progredir();
        devIsis.progredir();
        devIsis.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscrito Isis Regina" + devIsis.getConteudosInscricos());
        System.out.println("Conteudo Inscrito Isis Regina" + devIsis.getConteudosConcluidos());
        System.out.println("XP:" + devIsis.calcularTotalXp());

        System.out.println("-----------------");


        Dev devEmilia = new Dev();
        devEmilia.setNome("Emilia Lira");
        devEmilia.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscrito Emilia Lira" + devEmilia.getConteudosInscricos());
        devEmilia.progredir();
        devEmilia.progredir();
        devEmilia.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscrito Emilia Lira" + devEmilia.getConteudosInscricos());
        System.out.println("Conteudo Inscrito Emilia Lira" + devEmilia.getConteudosConcluidos());
        System.out.println("XP:" + devEmilia.calcularTotalXp());
    }
}
