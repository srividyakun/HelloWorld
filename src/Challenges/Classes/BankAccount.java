package Challenges.Classes;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount(){
        this("Anil",15000);
        System.out.println("Empty constructor is called");
    }

    public BankAccount(String customerName,double balance){
        this.customerName = customerName;
        setBalance(balance);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

   public double depositFunds(double deposit){
       return balance+=deposit;
   }

    public double deductFunds(double withdraw){
        if (balance-withdraw < 0) {
            System.out.println("Insufficient funds");
        }else {
            balance -= withdraw;
        }
        return balance;
    }
}
