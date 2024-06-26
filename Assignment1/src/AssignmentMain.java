import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
	public static void main(String[] args) {
        // Create a Manager instance
        Manager manager = new Manager();
        manager.setName("Alice");
        manager.setEmployeeId(1);
        manager.setSalary(90000);
        manager.setDepartment("IT");

        // Create a Developer instance
        Developer developer = new Developer();
        developer.setName("Bob");
        developer.setEmployeeId(2);
        developer.setSalary(80000);
        developer.setProgrammingLanguage("Java");

        // Use EmployeeUtilities to print details and increase salary
        System.out.println("Manager Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.increaseSalary(manager, 10);
        System.out.println("After 10% salary increase:");
        EmployeeUtilities.printEmployeeDetails(manager);

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.printEmployeeDetails(developer);
        EmployeeUtilities.increaseSalary(developer, 15);
        System.out.println("After 15% salary increase:");
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
