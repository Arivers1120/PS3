import java.sql.Date;



public class Account {

	private int id = 0;
	private double balance = 0 ;
	private double annuallnterestRate = 0;
	private Date dateCreated;
	
	public Account (){
		
	}
	
	public Account( int id , double balance ){
		this.id = id;
		this.balance = balance;
		
	}
	
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnuallnterestRate(){
		return annuallnterestRate;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnuallnterestRate(double AnnuallnterestRate){
		this.annuallnterestRate = annuallnterestRate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return getAnnuallnterestRate()/12.00;
	}
	
	public double withdraw(double a){
		 balance = balance - a;
		 return balance;
	}
	
	public double deposit(double b){
		 balance  = balance + b;
		 return balance;
	}

	
	
	
	}
//	•	ID = 1122
//	•	Balance = 20,000
//	•	Annual Interest rate 4.5%
//	•	Use the withdraw method to withdraw $2,500
//	•	Use the deposit method to deposit $3,000
//	•	Print the balance, the monthly interest and the date the account was created.

	

