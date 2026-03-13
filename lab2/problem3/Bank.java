import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account a) {
        if (a != null && getAccount(a.getAccountNumber()) == null) {
            accounts.add(a);
        }
    }

    public void closeAccount(int accNumber) {
        Account a = getAccount(accNumber);
        if (a != null) {
            accounts.remove(a);
        }
    }

    public Account getAccount(int accNumber) {
        for (Account a : accounts) {
            if (a.getAccountNumber() == accNumber) {
                return a;
            }
        }
        return null;
    }

    /**
     * Process all accounts: add interest to SavingsAccount, deduct fees from CheckingAccount.
     */
    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest();
            } else if (a instanceof CheckingAccount) {
                ((CheckingAccount) a).deductFee();
            }
        }
    }

    public int getAccountCount() {
        return accounts.size();
    }
}
