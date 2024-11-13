package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Product {
    private String name;
    private double price;
    private int amount;

    public void printer(){
        System.out.println("---------------");
        System.out.println("Nome do produto: " + name);
        System.out.println("Preço do produto: " + price);
        System.out.println("Quantidade do produto em estoque: " + amount);
        System.out.println("Valor total em estoque: R$" + totalValue());
        System.out.println("---------------");
    }

    public double totalValue (){
        return this.amount * this.price;
    }

    public void addToStock (int value) {
        amount += value;
    }

    public void removeFromStock (int value) {
        if (value > this.amount){
            System.out.println("Valor digitado maior do que o número em estoque.");
            System.out.println("Valor digitado: " + value);
            return;
        }
        amount -= value;
    }

    public void init(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
