public class Account {

    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (other != null && amount > 0 && amount <= balance) {
            withdraw(amount);
            other.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "Account[number=" + accNumber + ", balance=" + balance + "]";
    }

    public final void print() {
        System.out.println(toString());
    }
}
