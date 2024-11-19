package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class PrintStudent {
    public void printer(Student student) {
        System.out.println("-------------------");

        System.out.println(student.nome);
        System.out.println(student.sexo);
        System.out.println(student.idade);
    }
}
