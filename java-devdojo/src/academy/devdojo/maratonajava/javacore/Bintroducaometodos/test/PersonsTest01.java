package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Persons;

public class PersonsTest01 {
    public static void main(String[] args) {
        Persons person = new Persons ();
        person.setName("Jiraya");
        person.setAge(70);
        person.printer();
//        System.out.println(person.getName());
//        System.out.println(person.getAge());
    }
}
