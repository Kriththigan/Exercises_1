public class Account {
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args){
        Account acc = new Account(500);
        acc.deposit(250);
        acc.withdraw(100);
        System.out.println("Final Balance:" + acc.getBalance());
    }
}
