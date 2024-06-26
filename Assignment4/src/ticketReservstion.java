import java.util.Scanner;

public class ticketReservstion {
	static int numberOfTicktes=100;
	String name;
	int age;
	Scanner sc = new Scanner(System.in);
	
	public static int calculateTickets() {
		return numberOfTicktes--;
	}
	
	public void gettingDetails() {
		System.out.println("Please Enter your name:");
		name=sc.nextLine();
		System.out.println("Please Enter your age:");
		age =sc.nextInt();
		sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Ticket is reserved for:\nName:"+name+"\nAge:"+age;
	}
}
