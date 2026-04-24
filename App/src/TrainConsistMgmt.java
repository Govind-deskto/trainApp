import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 9: Group Bogies by Type
 *
 * Description:
 * This class groups bogies using Stream API and Collectors.groupingBy()
 *
 * @author Krishna
 * @version 9.0
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
        System.out.println("UC9 - Group Bogies by Type");
        System.out.println("====================================\n");

        // --------------------------------------------
        // Create list of bogies
        // --------------------------------------------
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));
        bogies.add(new Bogie("AC Chair", 60));

        // --------------------------------------------
        // Display all bogies
        // --------------------------------------------
        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // --------------------------------------------
        // GROUPING using Streams
        // --------------------------------------------
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        // --------------------------------------------
        // Display grouped data
        // --------------------------------------------
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());

            for (Bogie b : entry.getValue()) {
                System.out.println("Capacity -> " + b.capacity);
            }
        }

        // --------------------------------------------
        // Completion message
        // --------------------------------------------
        System.out.println("\nUC9 grouping completed...");
    }
}