public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        deposit(getBalance() * interestRate / 100.0);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount[number=" + getAccountNumber() + ", balance=" + getBalance()
            + ", rate=" + interestRate + "%]";
    }
}
