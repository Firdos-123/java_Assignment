import com.firdos.assignment.employees.Manager;
import com.firdos.assignment.employees.Developer;
import com.firdos.assignment.utilities.EmployeeUtilities;

/**
 * The AssignmentMain class contains the main method to test the functionality.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create instances of Manager and Developer
        Manager manager = new Manager("Alice", "M123", 90000, "IT");
        Developer developer = new Developer("Bob", "D456", 80000, "Java");

        // Use EmployeeUtilities methods to perform operations on the employee objects
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println();
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
