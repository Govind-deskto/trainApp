import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 11: Validate Train ID & Cargo Code (Regex)
 *
 * Description:
 * This class validates input formats using Regular Expressions.
 *
 * @author Krishna
 * @version 11.0
 * ============================================================
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("UC11 - Validate Train ID & Cargo Code");
        System.out.println("====================================\n");

        Scanner scanner = new Scanner(System.in);

        // --------------------------------------------
        // Take input
        // --------------------------------------------
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // --------------------------------------------
        // Define regex patterns
        // --------------------------------------------
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // --------------------------------------------
        // Validate using Pattern.matches()
        // --------------------------------------------
        boolean isTrainValid = Pattern.matches(trainPattern, trainId);
        boolean isCargoValid = Pattern.matches(cargoPattern, cargoCode);

        // --------------------------------------------
        // Display result
        // --------------------------------------------
        System.out.println("\nValidation Results:");

        if (isTrainValid) {
            System.out.println("Train ID Valid: True");
        } else {
            System.out.println("Train ID Valid: False");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code Valid: True");
        } else {
            System.out.println("Cargo Code Valid: False");
        }

        // --------------------------------------------
        // Completion message
        // --------------------------------------------
        System.out.println("\nUC11 validation completed...");
    }
}
