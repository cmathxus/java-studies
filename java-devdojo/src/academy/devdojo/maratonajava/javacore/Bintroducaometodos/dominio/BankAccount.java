package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class BankAccount {
    private int accountId;
    private String name;
    private double balance;

    public void init(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void addToBalance(double value){
        this.balance += value;
    }

    public void removeFromBalance(double value){
        if (value > this.balance) {
            System.out.println("Saldo insuficiente para retirada de: " + value);
            return;
        }
        this.balance -= value;
    }

    public void printer (){
        System.out.println("-----------------");
        System.out.println("ID da conta: " + this.accountId);
        System.out.println("Nome de usuário: " + this.name);
        System.out.println("Saldo em conta: " + this.balance);
        System.out.println("-----------------");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
