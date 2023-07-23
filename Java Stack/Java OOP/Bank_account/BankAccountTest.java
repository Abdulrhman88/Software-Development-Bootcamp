public class BankAccountTest {
	public static void main(String[] args) {
		
	// BankAccount user1 = new BankAccount();

	// user1.accountDeposit("Savings", 500.00);
	// user1.accountWithdrawal("Savings", 100.00);
	// user1.myBalance();

	BankAccount user2=new BankAccount();

	user2.accountDeposit("Checking", 100.00);
	user2.accountWithdrawal("Checking", 50.00);
	user2.myBalance();
	user2.TotalMoney();

	// BankAccount user3=new BankAccount();

	// user3.accountDeposit("savings", 3000.0);
	// user3.accountWithdrawal("savings", 1000.00);	
	// user3.myBalance();
	}
}
