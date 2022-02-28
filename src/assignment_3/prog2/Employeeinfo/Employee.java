//package assignment_3.prog2.Employeeinfo;
//
//import assignment_3.prog1.Account;
//import assignment_3.prog1.AccountType;
//
//
//import java.time.LocalDate;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
//
//
//public class Employee {
//
//	private Account savingsAcct;
//	private Account checkingAcct;
//	private Account retirementAcct;
//	private String name;
//	private LocalDate hireDate;
//
//
//	Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire){
//		this.name = name;
//		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
//
//		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
//		hireDate = LocalDate.of(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1, cal.get(Calendar.DATE));
//
//	}
//
//
//	public void createNewChecking(double startAmount) {
//		// implement
//		//Account(assignment_3.prog1.Employee emp, Enum acctType, double balance)
//		checkingAcct = new Account(this, AccountType.CHECKING, 0);
//
//	}
//
//	public void createNewSavings(double startAmount) {
//
//		savingsAcct = new Account(this, AccountType.SAVINGS, 0);
//
//	}
//
//	public void createNewRetirement(double startAmount) {
//		// implement
//		retirementAcct = new Account(this, AccountType.RETIREMENT, 0);
//
//	}
//
//	public String getFormattedAcctInfo() {
//
//		String display = "ACCOUNT INFO FOR " + name + ":\n\n";
//		if (checkingAcct != null) {
//			display += checkingAcct.toString();
//		}
//		if (savingsAcct != null) {
//			display += savingsAcct.toString();
//		}
//		if (retirementAcct != null) {
//			display += retirementAcct.toString();
//		}
//		return display +"\n";
//
//	}
//
//
//	public void deposit(String acctType, double amt){
//		// implement
//		if(acctType.equals("SAVINGS"))
//			this.savingsAcct.makeDeposit(amt);
//		else if(acctType.equals("CHECKING"))
//			this.checkingAcct.makeDeposit(amt);
//		else
//			this.savingsAcct.makeDeposit(amt);
//	}
//	public boolean withdraw(String acctType, double amt){
//		// implement
//		if(acctType.equals("SAVINGS") && this.savingsAcct.getBalance() > amt) {
//			this.savingsAcct.makeWithdrawal(amt);
//			return true;
//
//		}else if
//			(acctType.equals("CHECKING") && this.checkingAcct.getBalance() > amt){
//			this.savingsAcct.makeWithdrawal(amt);
//			return true;
//		}else
//			if (this.retirementAcct.getBalance() > amt) {
//				this.retirementAcct.makeWithdrawal(amt);
//				return true;
//			}return false;
//		}
//
//	public String getName() {
//		return name;
//	}
//
//	public LocalDate getHireDate() {
//		return hireDate;
//	}
//}


