import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * This class maps each bogie to its seating or load capacity
 * using HashMap (key-value pair).
 *
 * At this stage, the application:
 * - Stores bogie as key
 * - Stores capacity as value
 * - Displays mapping using iteration
 *
 * This maps real-world attribute association.
 *
 * @author Krishna
 * @version 6.0
 * ============================================================
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("====================================\n");

        // --------------------------------------------
        // Create HashMap (Bogie -> Capacity)
        // --------------------------------------------
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // --------------------------------------------
        // Add entries
        // --------------------------------------------
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        // --------------------------------------------
        // Display mapping
        // --------------------------------------------
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // --------------------------------------------
        // Completion message
        // --------------------------------------------
        System.out.println("\nUC6 mapping completed successfully...");
    }
}