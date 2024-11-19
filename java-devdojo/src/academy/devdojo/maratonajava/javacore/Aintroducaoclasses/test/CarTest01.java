package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.nome = "Lancer";
        car1.ano = 2024;
        car1.modelo = "Evolution";

        car2.nome = "Civic";
        car2.ano = 2022;
        car2.modelo = "Type R";

        car1 = car2;

        System.out.println("CARRO 1 - NOME: " + car1.nome + " ANO: " + car1.ano + " MODELO: " + car1.modelo);
        System.out.println("CARRO 2 - NOME: " + car2.nome + " ANO: " + car2.ano + " MODELO: " + car2.modelo);
    }
}
