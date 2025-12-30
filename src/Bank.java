public class Bank {
    private double balance;

    public Bank(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Account a1 = new Account(100);
        Account a2 = a1;

        a2.deposit(50);
        System.out.println(a1.getBalance());
    }
}
