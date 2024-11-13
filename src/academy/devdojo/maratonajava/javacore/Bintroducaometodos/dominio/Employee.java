package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Employee {
    private String nome = "";
    private int idade;
    private double[] salarios;
    private double media;


    public void printer() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
    }

    public void averagePrinter() {
        if (salarios == null) {
            return;
        }
        for (double num : salarios) {
            media += num;
        }
        media /= salarios.length;
        System.out.println("Média salarial" + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
