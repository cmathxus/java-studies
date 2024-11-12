package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.PrintStudent;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent print = new PrintStudent();
        student01.nome = "Midoriya";
        student01.idade = 15;
        student01.sexo = 'M';

        student02.nome = "Sakura";
        student02.idade = 16;
        student02.sexo = 'F';

        print.printer(student01);

        print.printer(student02);

    }
}
