
import java.util.Scanner;

public abstract class Account{
	

	abstract void deposit();
	abstract void withdraw();
	abstract void getBalance();
	}


class SavingAccounts extends Account{
Scanner sc = new Scanner(System.in);

 void deposit() {
	 String username ; int ammount;
	 boolean found=false;
	 
	 while (found!=true) {
	 System.out.println("Enter accname");
	 username = sc.nextLine();
	 for (int i = 0; i < Bank.accnames.length; i++) {
		 
	     if (Bank.accnames[i].equals(username)) {
	         System.out.println("Enter amount");
	         ammount = sc.nextInt();
	         Bank.accbalances[i]= Bank.accbalances[i]+ammount-Transaction.fee;
	         System.out.println(ammount-Transaction.fee+"credited to your account");
	         found=true;
	         break; 
	         //Exit the loop once the element is found
	     }
	     
	     
	    }
	 
	 }	
	 
 }
 
 void withdraw() {
	 
	 String username ; int ammount;
	 boolean found=false;
	 
	 while (found!=true) {
	 System.out.println("Enter accname");
	 username = sc.nextLine();
	 for (int i = 0; i < Bank.accnames.length; i++) {
		 
	     if (Bank.accnames[i].equals(username)) {
	         System.out.println("Enter amount you want to withdraw");
	         ammount = sc.nextInt();
	         if((Bank.accbalances[i]<=0)||(Bank.accbalances[i]<ammount+Transaction.fee)) {System.out.println("Insufficient funds cannot withdraw");}
	         else{Bank.accbalances[i]= Bank.accbalances[i]-ammount-Transaction.fee;System.out.println(ammount+Transaction.fee+" debited from your account ");}
	         
	         System.out.println("Remaining Balance is "+Bank.accbalances[i]);
	         found=true;
	         break; 
	         //Exit the loop once the element is found
	     }
	     }
	 }
	 }
 void getBalance() {
	 String username ;
	 boolean found=false;
	 
	 while (found!=true) {
	 System.out.println("Enter accname");
	 username = sc.nextLine();
	 for (int i = 0; i < Bank.accnames.length; i++) 
	 {
		 if (Bank.accnames[i].equals(username)) {
			 
			 System.out.println("Remaining Balance is "+Bank.accbalances[i]);
			 found=true;
			 break;
		 } 
		 
	 }
	 break;
	 
	 
	 }	 
 }
 
}


class CheckingAccounts extends Account{
Scanner sc = new Scanner(System.in);

 void deposit() {
	 String username ; int ammount;
	 boolean found=false;
	 
	 while (found!=true) {
	 System.out.println("Enter accname");
	 username = sc.nextLine();
	 for (int i = 0; i < Bank.accnames.length; i++) {
		 
	     if (Bank.accnames[i].equals(username)) {
	         System.out.println("Enter amount");
	         ammount = sc.nextInt();
	         Bank.accbalances[i]= Bank.accbalances[i]+ammount;
	         found=true;
	         break; 
	         //Exit the loop once the element is found
	     }
	     
	     
	    }
	 
	 }	
	 
 }
 
 void withdraw() {
	 
	 String username ; int ammount;
	 boolean found=false;
	 
	 while (found!=true) {
	 System.out.println("Enter accname");
	 username = sc.nextLine();
	 for (int i = 0; i < Bank.accnames.length; i++) {
		 
	     if (Bank.accnames[i].equals(username)) {
	         System.out.println("Enter amount you want to withdraw");
	         ammount = sc.nextInt();
	         if((Bank.accbalances[i]<=0)||(Bank.accbalances[i]<ammount)) {System.out.println("Insufficient funds cannot withdraw");}
	         else{Bank.accbalances[i]= Bank.accbalances[i]-ammount;}
	         System.out.println("Remaining Balance is "+Bank.accbalances[i]);
	         found=true;
	         break; 
	         //Exit the loop once the element is found
	     }
	     }
	 }
	 }
 void getBalance() {
	 String username ;
	 boolean found=false;
	 
	 while (found!=true) {
	 System.out.println("Enter accname");
	 username = sc.nextLine();
	 for (int i = 0; i < Bank.accnames.length; i++) 
	 {
		 if (Bank.accnames[i].equals(username)) {
			 System.out.println("Remaining Balance is "+Bank.accbalances[i]);
			 found=true;
			 break;
		 } 
		 
	 }
	 break;
	 
	 
	 }	 
 }
 
}
