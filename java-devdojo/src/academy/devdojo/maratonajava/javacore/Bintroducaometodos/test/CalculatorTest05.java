package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculator;

public class CalculatorTest05 {
    public static void main(String[] args) {
     Calculator calculator = new Calculator();
     int [] numeros = {1,2,3,4,5};
     calculator.somaArray(new int[]{1,2,3,4,5});
     calculator.somaVarArgs(1,2,3,4,5,6,7);
    }
}
