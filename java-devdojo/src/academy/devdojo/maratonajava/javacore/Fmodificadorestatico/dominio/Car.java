package devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Car {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Car(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime () {
        System.out.println("----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " + Car.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Car.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Car.velocidadeLimite;
    }

    //Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
