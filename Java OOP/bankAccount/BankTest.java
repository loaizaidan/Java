public class BankTest {
    public static void main(String[] args) {
        BankAccount loaiAccount = new BankAccount();

        loaiAccount.deposit(1000, "checking");
        loaiAccount.deposit(200, "savings");
        loaiAccount.getBalance();

        loaiAccount.withdraw(1000, "savings");
		loaiAccount.withdraw(100, "checking");
		loaiAccount.getBalance();
    }
}
