package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Circle {
    private double raio;

    public double areaCalculator() {
        double area = 0;
        if (raio == 0) {
            System.out.println("Raio inválido");
            return 0;
        }
        area = Math.PI * raio * raio;
        ;
        return area;
    }

    public void printer() {
        double area = areaCalculator();
        if (area >= 0) {
            System.out.println("A área do circulo é: " + area);
        }
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
