//package assignment_4.prog3.employeeinfo;
//
//
//
//public class Account {
//	private final static double DEFAULT_BALANCE = 0.0;
//	private double balance;
//
//	private Employee employee;
//
//	Account(Employee emp, double balance){
//		employee = emp;
//
//		this.balance = balance;
//	}
//	Account(Employee emp){
//		this(emp , DEFAULT_BALANCE);
//
//
//	}
//	public double getBalance() {
//		if(this.acctType.equals(AccountType.CHECKING)){
//		balance -= 5;
//		return balance;
//		}else if(this.acctType.equals(AccountType.SAVINGS)){
//			balance = balance - balance * 0.25;
//			return balance;
//		}
//		return balance;
//
//	}
//
//	public AccountType getAcctType() {
//		return acctType;
//	}
//	public String toString() {
//		String newline = System.getProperty("line.separator");
//		return "Account type: "+ acctType.toString().toLowerCase()+
//				newline +
//				"Current bal: "+balance;
//	}
//
//	public void makeDeposit(double deposit) {
//		balance += deposit;
//	}
//	public boolean makeWithdrawal(double amount) {
//		if(amount <= balance && this.acctType.equals(AccountType.RETIREMENT)) {
//			balance = balance - balance * 0.02;
//			balance -= amount;
//			return true;
//		}else if(amount <= balance) {
//			balance -= amount;
//			return true;
//		}
//		return false;
//	}
//}
