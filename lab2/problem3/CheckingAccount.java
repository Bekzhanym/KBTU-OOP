
public class CheckingAccount extends Account {

    public static final int FREE_TRANSACTIONS = 3;
    private static final double FEE_PER_TRANSACTION = 0.02;

    private int transactionCount;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        double before = getBalance();
        super.deposit(sum);
        if (getBalance() != before) transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        double before = getBalance();
        super.withdraw(sum);
        if (getBalance() != before) transactionCount++;
    }

    public void deductFee() {
        int extra = transactionCount - FREE_TRANSACTIONS;
        if (extra > 0) {
            double fee = extra * FEE_PER_TRANSACTION;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return "CheckingAccount[number=" + getAccountNumber() + ", balance=" + getBalance()
            + ", transactions=" + transactionCount + "]";
    }
}
