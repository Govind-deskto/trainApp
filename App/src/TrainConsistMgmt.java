import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating capacity
 * using Java Stream API.
 *
 * @author Krishna
 * @version 8.0
 * ============================================================
 */

public class TrainConsistMgmt {

    // Reusing Bogie class (same as UC7)
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
        System.out.println("UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // --------------------------------------------
        // Filter bogies with capacity > 60
        // --------------------------------------------
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // --------------------------------------------
        // Display filtered bogies
        // --------------------------------------------
        System.out.println("Filtered Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // --------------------------------------------
        // Completion message
        // --------------------------------------------
        System.out.println("\nUC8 filtering completed...");
    }
}