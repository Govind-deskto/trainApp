import java.util.HashSet;
import java.util.Set;

/*
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures duplicate bogie IDs are not added
 * using HashSet.
 *
 * ============================================================
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

        // Header
        System.out.println("====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("====================================\n");

        // Create HashSet
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (with duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        // Final message
        System.out.println("\nUC3 uniqueness validation completed...");
    }
}