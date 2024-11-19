package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculator.divideDoisNumeros(20,2));
        System.out.println("-----------");
        calculator.imprimeDivisaoDeDoisNumeros(20,0);
    }
}
