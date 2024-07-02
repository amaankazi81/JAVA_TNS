
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Bank b1 = new Bank();
		SavingAccounts a1 = new SavingAccounts();
		CheckingAccounts c1 = new CheckingAccounts();
		String input = "";
		while(!input.equals("exit")) {
			
			System.out.println("           WELCOME TO BANK");
			System.out.println(" Menu \t \n press 1 to create bank account \n press 2 to deposit money \n press 3 to withdraw money \n press 4 to see account blalance \n press 5 to exit Bank");
			
			input = sc.nextLine();
			
			if(input.equals("1")) {
				
				System.out.println("Enter acc type Savings aur Checking");
				String acctype = sc.nextLine();
				b1.createAccount();
				
			} 
			else if(input.equals("2")) {a1.deposit();} 
			else if(input.equals("3")) {a1.withdraw();} 
			else if(input.equals("4")) {a1.getBalance();} 
			else if(input.equals("5")) {input="exit";}
			
			
			else {System.out.println("please enter a valid input");}
			
		}
		System.out.println("GOODBYE!!!");
				
	}

	}


