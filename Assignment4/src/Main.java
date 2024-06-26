import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ticketReservstion obj=new ticketReservstion();
		Scanner sc = new Scanner(System.in);
		while (true) {
		    System.out.println("Tickets available :" + ticketReservstion.numberOfTicktes + "\nTo book tickets fill following details:");
		    obj.gettingDetails();
		    System.out.println(obj);
		    ticketReservstion.calculateTickets();	    System.out.println("Do you want more tickets? Enter Yes or No");
		    String answer = sc.nextLine().toLowerCase();

		    if (answer.equals("yes")) {
		        continue;
		    } else if (answer.equals("no")) {
		        break;
		    } else {
		        while (!answer.equals("yes") && !answer.equals("no")) {
		            System.out.println("Please give correct input (Yes or No)");
		            answer = sc.nextLine().toLowerCase();
		        }
		        if (answer.equals("yes")) {
		            continue;
		        } else {
		            break;
		        }
		    }
		}
	}
	}


