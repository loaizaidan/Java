public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney;

    public BankAccount() {
        setCheckingBalance(0);
        setSavingsBalance(0);
        setAccounts(getAccounts() + 1);
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static void setAccounts(int accounts) {
        BankAccount.accounts = accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static void setTotalMoney(double totalMoney) {
        BankAccount.totalMoney = totalMoney;
    }

    // METHODS
    // deposit
    // users should be able to deposit money into their checking or savings account
    public void deposit(double amount, String accountType) {
    	if (accountType == "checking") {
    		setCheckingBalance(getCheckingBalance() + amount);
    	} else {
    		setSavingsBalance(getSavingsBalance() + amount);
    	}
    	System.out.println("Successfully deposited $" + amount + " to your " + accountType + " account.");
    	setTotalMoney(getTotalMoney() + amount);
    }
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
	public void withdraw(double amount, String accountType) {
    	if (accountType == "checking") {
    		if (getCheckingBalance() >= amount) {
    			setCheckingBalance(getCheckingBalance() - amount);
    			setTotalMoney(getTotalMoney() - amount);
    			System.out.println("Successfully withdrew $" + amount + " from your checking account.");
    		} else {
    			System.out.println("Insufficient funds.");
    		}
    	} else {
    		if (getSavingsBalance() >= amount) {
    			setSavingsBalance(getSavingsBalance() - amount);
    			setTotalMoney(getTotalMoney() - amount);
    			System.out.println("Successfully withdrew $" + amount + " from your savings account.");
    		} else {
    			System.out.println("Insufficient funds.");
    		}
    	}
    }

    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.println("Total accounts balance:\n" + "Checking: $" + getCheckingBalance() + "\nSavings: $"
                + getSavingsBalance());
    }
}