package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class House {
    public String address = "";
    public int numBedrooms;
    public int numBathrooms;
    public int yearBuilt;
    public double price;

    public void printer(){
        System.out.println("---------------------");
        System.out.println("Address: " + this.address);
        System.out.println("Bedrooms: " + this.numBedrooms);
        System.out.println("Bathrooms: " + this.numBathrooms);
        System.out.println("Year Built: " + this.yearBuilt);
        System.out.println("Price: " + this.price);
    }


}
