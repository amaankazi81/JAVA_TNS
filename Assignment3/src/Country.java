
public class Country extends Continent{
	String countryName;
    int population;
    String capital;

    // Constructor
    public Country() {
        this.countryName = "India";
        this.population = 1421052203; // Population in billions
        this.capital = "New Delhi";
    }

    // Method to display country details
    public void countryDetails() {
    	continentDetails(); // Call method from Asia
        System.out.println("Country Name: " + countryName);
        System.out.println("Population: " + population);
        System.out.println("Capital: " + capital);
}
}
