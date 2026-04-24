import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating capacity
 * using a custom Comparator.
 *
 * @author Krishna
 * @version 7.0
 * ============================================================
 */

public class TrainConsistMgmt {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("====================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // --------------------------------------------
        // Before sorting
        // --------------------------------------------
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // --------------------------------------------
        // Sort using Comparator (ascending by capacity)
        // --------------------------------------------
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // --------------------------------------------
        // After sorting
        // --------------------------------------------
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // --------------------------------------------
        // Completion message
        // --------------------------------------------
        System.out.println("\nUC7 sorting completed...");
    }
}