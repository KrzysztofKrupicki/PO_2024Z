package cw6.zad6;

public record BankAccount(String accountNumber, double saldo) {
    public BankAccount(String accountNumber) {
        this(accountNumber, 0);
    }
}
