
import java.util.Scanner;

public class Bank {
	Scanner sc = new Scanner(System.in);
	
	String accHolderName; 	String password;	int depositBalance;
	static int totalAccounts=0;
	
	static String accnames[]= new String[300];
	static String accpasswords[]= new String[300];
	static int accbalances[] = new int[300];

	void createAccount() {
		System.out.println("Enter Bank account owner name");
		this.accHolderName = sc.nextLine();
		accnames[totalAccounts]=this.accHolderName;

		System.out.println("set password");
		this.password = sc.next();
		accpasswords[totalAccounts]=this.password;
		
		System.out.println("Enter Deposit ammount");
		this.depositBalance = sc.nextInt();	
		accbalances[totalAccounts]= this.depositBalance;
		totalAccounts++;
		
	}
	
	static int gettotalAccounts() {
		return totalAccounts;
	}

}
