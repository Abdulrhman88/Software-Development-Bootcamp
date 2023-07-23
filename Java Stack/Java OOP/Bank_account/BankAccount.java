import java.util.Random;

public class BankAccount {
	
	
	
	private Double checkingBalance = 0.0;
	private Double savingsBalance = 0.0;
	private static Double totalMoney = 0.0;
	private static int NumberCount = 0;
	private double accountDetels=checkingBalance+savingsBalance;
	
	//Constructors
	public BankAccount() {

		
		NumberCount ++;
	
	}
	
	//Getters
	public Double getCheckingBalance() {
		return checkingBalance;
	}
	public Double getSavingsBalance() {
		return savingsBalance;
	}

	//Setters
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	
	
	public void accountDeposit(String check, Double totalamount) {
		if(check.equals("Savings"))
		{
			setSavingsBalance(getSavingsBalance()+ totalamount);
			totalamount+=totalMoney;
			
		}
		else if(check.equals("Checking")){
			setCheckingBalance(getCheckingBalance()+totalamount);
			totalamount+=totalMoney;
			
		}	
	}
	
	public void accountWithdrawal(String check, Double totalamount) {
			if(check.equals("Savings")){

				if(getSavingsBalance()<totalamount){
				System.out.println("They are no mony ");
				
				}
				else  {
					setSavingsBalance(getSavingsBalance()-totalamount);
					totalMoney-=totalamount;
					

				}
				} 
			else if (check.equals("Checking")){
				if(getCheckingBalance()<totalamount){
					System.out.println("They are no mony ");
					
					
				}
				else {
				setCheckingBalance(getCheckingBalance()-totalamount);
				totalMoney-=totalamount;
				
				}
			}
	
		}

	

	public void TotalMoney(){
		

			System.out.printf("Your total balance is %f",accountDetels);
		}
	
	public Double myBalance() {
		Double balance = accountDetels; // accountDetels = saving and cheking
		System.out.println(balance);
		return balance;
	}
}