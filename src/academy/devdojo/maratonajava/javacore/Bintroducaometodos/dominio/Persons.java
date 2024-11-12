package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Persons {
    public String name;
    private int age;

    public void printer() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void setName(String name) {
        name = name;
    }
}
