package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.House;

public class HouseTest {
    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();

        house1.address = "Hollywood Boulevard";
        house1.numBathrooms = 2;
        house1.numBedrooms = 4;
        house1.price = 1250000;
        house1.yearBuilt = 2018;

        house2.address = "5th Avenue";
        house2.numBathrooms = 4;
        house2.numBedrooms = 8;
        house2.price = 7500000;
        house2.yearBuilt = 2021;

        house1.printer();
        house2.printer();
    }
}
