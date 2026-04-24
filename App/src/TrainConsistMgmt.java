import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 10: Count Total Seats in Train
 *
 * Description:
 * This class aggregates seating capacity of all bogies
 * into a single total using Stream reduce().
 *
 * @author Krishna
 * @version 10.0
 * ============================================================
 */

public class TrainConsistMgmt {

    // Reusing Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC10 - Count Total Seats in Train");
        System.out.println("====================================\n");

        // --------------------------------------------
        // Create list of bogies
        // --------------------------------------------
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // --------------------------------------------
        // Display bogies
        // --------------------------------------------
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // --------------------------------------------
        // AGGREGATE using map + reduce
        // --------------------------------------------
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);   // sum all values

        // --------------------------------------------
        // Display result
        // --------------------------------------------
        System.out.println("\nTotal Seating Capacity of Train: " + totalSeats);

        // --------------------------------------------
        // Completion message
        // --------------------------------------------
        System.out.println("\nUC10 aggregation completed...");
    }
}