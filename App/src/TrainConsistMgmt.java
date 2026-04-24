import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 12: Safety Compliance Check for Goods Bogies
 *
 * Description:
 * Validates cargo safety rules using Stream allMatch().
 *
 * Rule:
 * Cylindrical bogies must carry only Petroleum cargo.
 *
 * @author Krishna
 * @version 12.0
 * ============================================================
 */

public class TrainConsistMgmt {

    // Goods Bogie class
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("====================================\n");

        // Create list
        List<GoodsBogie> bogies = new ArrayList<>();

        // ⚠️ Yahan intentionally INVALID case dala hai (screenshot jaisa)
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal")); // ❌ invalid

        // Display bogies
        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // Safety check
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // Output
        System.out.println("\nSafety Compliance Status:");
        System.out.println("Train formation is " + (isSafe ? "SAFE" : "NOT SAFE"));

        System.out.println("\nUC12 safety validation completed...");
    }
}