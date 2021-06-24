package Challenges.Classes;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.depositFunds(250.0);
        System.out.println("the total balance : " +account.getBalance());
        account.deductFunds(200.0);
        System.out.println("the total balance : " +account.getBalance());

        BankAccount account1 = new BankAccount("Krishna",2000);
        System.out.println("the total balance : " +account1.getBalance());
    }
}
