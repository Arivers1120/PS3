


public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account(1122, 20000);
		a1.withdraw(2500);
		a1.deposit(3000);
		a1.setAnnuallnterestRate(4.5);
		a1.getMonthlyInterestRate();
		
//		a1.withdraw(40000);
		
		System.out.println(a1.getBalance());
		System.out.println(a1.getAnnuallnterestRate());
		System.out.println(a1.getDateCreated());
	}
	
	
	
	
//	•	ID = 1122
//			•	Balance = 20,000
//			•	Annual Interest rate 4.5%
//			•	Use the withdraw method to withdraw $2,500
//			•	Use the deposit method to deposit $3,000
//			•	Print the balance, the monthly interest and the date the account was created.

	
	
	


}
