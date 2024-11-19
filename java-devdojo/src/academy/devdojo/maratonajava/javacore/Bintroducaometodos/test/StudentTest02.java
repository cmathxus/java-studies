package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();
        Student test = new Student();

        student01.nome = "Midoriya";
        student01.idade = 15;
        student01.sexo = 'M';

        student02.nome = "Sakura";
        student02.idade = 16;
        student02.sexo = 'F';

        student01.printer();
        student02.printer();

        double num1 = 20.22;
        int num2 = 2;

        test.test((int) num1,num2);
    }
}
