import java.util.ArrayList;
import java.util.List;

/*
 * ============================================================
 * MAIN CLASS - TrainConsistMgmt
 * ============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * This class represents the entry point of the Train Consist
 * Management Application.
 *
 * Author: Developer
 * Version: 1.0
 * ============================================================
 */

public class TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("====================================");

        // Create dynamic list
        List<String> trainConsist = new ArrayList<>();

        // Initialization message
        System.out.println("\nTrain initialized successfully...");

        // Initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Current consist
        System.out.println("Current Train Consist : " + trainConsist);

        // Ready message
        System.out.println("\nSystem ready for operations...");
    }
}