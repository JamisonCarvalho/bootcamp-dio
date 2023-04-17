import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso básico de Java.");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso básico de JavaScript.");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Aprenda mais sobre a linguagem Java, com nossa mentoria.");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria();
        mentoria1.setTitulo("Mentoria de JavaScript");
        mentoria1.setDescricao("Aprenda mais sobre a linguagem JavaScript, com nossa mentoria.");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria2);
    }
}