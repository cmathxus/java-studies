package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Employee {
    public String nome = "";
    public int idade;
    public double[] salarios;

    public void printer() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        averagePrinter();
    }

    public void averagePrinter() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double num : salarios) {
            media += num;
        }
        media /= salarios.length;
        System.out.println("Média salarial" + media);
    }
}
