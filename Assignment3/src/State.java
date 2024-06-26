
public class State extends Country {
	String stateName;
    int statePopulation;
    String stateCapital;

    // Constructor
    public State() {
        this.stateName = "Maharashtra";
        this.statePopulation = 66429000; // Population in millions
        this.stateCapital = "Mumbai";
    }

    // Method to display state details
    public void stateDetails() {
        countryDetails(); // Call method from India
        System.out.println("State Name: " + stateName);
        System.out.println("State Population: " + statePopulation);
        System.out.println("State Capital: " + stateCapital);
    }
}
