package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.sql.SQLOutput;

public class Student {
    public String nome;
    public int idade;
    public char sexo;

    public void printer() {
        System.out.println("--------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    public void test(int a, int y) {
        System.out.println("---------------");
        System.out.println(a+y);
    }
}
