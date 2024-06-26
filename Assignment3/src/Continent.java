
public class Continent {
	String continentName;
    int numberOfCountries;
    String majorLanguage;

    // Constructor
    public Continent() {
        this.continentName = "Asia";
        this.numberOfCountries = 48;
        this.majorLanguage = "Hindi, Chinease, Mandarin";
    }

    // Method to display continent details
    public void continentDetails() {
        System.out.println("Continent Name: " + continentName);
        System.out.println("Number of Countries: " + numberOfCountries);
        System.out.println("Major Language: " + majorLanguage);
    }
}
