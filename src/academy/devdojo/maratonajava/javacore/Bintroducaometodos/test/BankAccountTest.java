package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount();
        user1.init(1, "Caio", 1500);
        user1.printer(); // Impressão dos dados padrões
        user1.addToBalance(1000);
        user1.printer(); // Teste adicionar saldo
        user1.removeFromBalance(500);
        user1.printer(); // Teste retirar saldo
        user1.removeFromBalance(2500);
        user1.printer(); // Teste retirar maior que o saldo
    }
}
