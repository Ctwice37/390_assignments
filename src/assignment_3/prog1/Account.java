package assignment_3.prog1;

public class Account {
//	public final static String CHECKING = "checking";
//	public final static String SAVINGS = "savings";
//	public final static String RETIREMENT = "retirement";
	private final static double DEFAULT_BALANCE = 0.0;
	private double balance;
	private AccountType acctType;
	private Employee employee;

	public Account(Employee emp, AccountType AccountType, double balance) {
		employee = emp;
		this.acctType = AccountType;
		this.balance = balance;
	}



	Account(Employee emp, AccountType acctType) {
		this(emp, acctType, DEFAULT_BALANCE);
	}

	public String toString() {
		return "type = " + acctType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {

		balance+= deposit;
	}

	public boolean makeWithdrawal(double amount) {
		if(balance < amount)
		return false;
		balance -= amount;
		return true;
	}

	public double getBalance() {
		return balance;
	}

	public Enum getAcctType() {
		return acctType;
	}

}
