package assignment_3.prog1;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Charles", "Charlie", 200000, 2020, 8, 12);

        Account a1 = new Account(e1, AccountType.CHECKING, 300);
        Account a2 = new Account(e1, AccountType.SAVINGS, 300);
        Account a3 = new Account(e1, AccountType.RETIREMENT, 300);


        System.out.println(a1.getAcctType() + " --->  " + a1.getBalance());
        System.out.println(a2.getAcctType() + " --->  " + a2.getBalance());
        System.out.println(a3.getAcctType() + " --->  " + a3.getBalance());


    }
}
