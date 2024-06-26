
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students students = new students();

        // Create an object of Commission class
		Comissoin Comission = new Comissoin();

        // Accept details of the sales employee
        Comission.acceptDetails();

        // Calculate the commission based on sales amount
        Comission.calculateCommission();

        // Display the commission details
        Comission.displayCommission();
	}

}
