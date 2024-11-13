package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Persons {
    private String name;
    private int age;

    public void printer() {
        System.out.println(this.getName());
        System.out.println(this.getAge());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Idade invalida");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
