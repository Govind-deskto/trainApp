import javaArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates CRUD operations using ArrayList.
 *
 * @author Krishna
 * @version 2.0
 * ============================================================
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("====================================\n");

        // Create list
        List<String> passengerBogies = new ArrayList<>();

        // --------------------------------------------
        // ADD bogies
        // --------------------------------------------
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // --------------------------------------------
        // REMOVE bogie
        // --------------------------------------------
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // --------------------------------------------
        // CHECK existence
        // --------------------------------------------
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        // --------------------------------------------
        // FINAL STATE
        // --------------------------------------------
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}